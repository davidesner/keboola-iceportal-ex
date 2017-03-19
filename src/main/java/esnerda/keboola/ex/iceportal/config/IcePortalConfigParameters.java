package esnerda.keboola.ex.iceportal.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.components.configuration.IKBCParameters;
import esnerda.keboola.components.configuration.ValidationException;

/**
 * @author David Esner
 */
public class IcePortalConfigParameters extends IKBCParameters{
	 private final static String[] REQUIRED_FIELDS = {"userName", "password"};
	 private final Map<String, Object> parametersMap;
	 
	 /* auth */ 
	@JsonProperty("userName")
	private String userName;
	
	@JsonProperty("#password")
	private String password;
	
	@JsonProperty("userMtype")
	private String userMtype;

	/* custom params */
	@JsonProperty("pubStatus")
	private Integer pubStatus;

	@JsonProperty("modType")
	private Integer modType;
	
	@JsonProperty("linkType")
	private String linkType;

	@JsonProperty("propertyTypes")
	private List<Integer> propertyTypes;

	@JsonProperty("incremental")
	private Boolean incremental;

	@JsonProperty("since")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate since;
	
	@JsonProperty("datasets")
	private List<String> datasets;
	
	@JsonProperty("debug")
	private Boolean debug;

	
	
	
	@JsonCreator
    public IcePortalConfigParameters(@JsonProperty("userName") String userName, @JsonProperty("#password") String password,
    		@JsonProperty("userMtype") String userMtype, @JsonProperty("pubStatus") Integer pubStatus, @JsonProperty("modType") Integer modType, 
    		@JsonProperty("propertyTypes") List<Integer> propertyTypes,	@JsonProperty("incremental") Boolean incremental, 
    		@JsonProperty("since") LocalDate since, @JsonProperty("datasets") List<String> datasets, @JsonProperty("linkType") String linkType, 
    		@JsonProperty("debug") Boolean debug) {
		
		this.debug = Optional.ofNullable(debug).orElse(false);
		this.userName = userName;
		this.password = password;
		this.userMtype = userMtype;
		this.pubStatus = Optional.ofNullable(pubStatus).orElse(PublicationType.PUBLISHED.code);
		this.modType = Optional.ofNullable(modType).orElse(ModType.ALL.code);
		this.linkType = Optional.ofNullable(linkType).orElse("DL");
		this.propertyTypes = propertyTypes;
		this.incremental = Optional.ofNullable(incremental).orElse(true);
		this.since = since;
		this.datasets = datasets;

		// set param map
		parametersMap = new HashMap<>();
		parametersMap.put("userName", userName);
		parametersMap.put("password", password);
	}



	@Override
	protected String[] getRequiredFields() {
		return REQUIRED_FIELDS;
	}

	@Override
	protected boolean validateParametres() throws ValidationException {
		// validate date format
		String error = "";

		error += this.missingFieldsMessage(parametersMap);
		error += validateDatasetList();

		if (error.equals("")) {
			return true;
		} else {
			throw new ValidationException("Invalid configuration parameters!", "Config validation error: " + error,
					null);
		}
	}

	private String validateDatasetList() throws ValidationException {
		List<String> invalidCols = new ArrayList();
		if (this.datasets != null) {
			for (String colName : this.datasets) {
				if (!Dataset.isValid(colName)) {
					invalidCols.add(colName);
				}
			}
		}
		if (!invalidCols.isEmpty()) {
			return "Some datasets are not supported: " + invalidCols.toString();
		}
		return "";
	}

	/** enums **/

	public static enum PublicationType {
		ALL(0), PUBLISHED(1), UNPUBLISHED(2);

		private int code;

		PublicationType(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public static boolean isValid(String test) {
			for (Dataset c : Dataset.values()) {
				if (c.name().equals(test)) {
					return true;
				}
			}
			return false;
		}
	}

	public static enum ModType {
		ALL(0), CREATED_SINCE(1), MODIFIED_SINCE(2), CONTENT_MOD_SINCE(3);

		private int code;

		ModType(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public static boolean isValid(String test) {
			for (Dataset c : Dataset.values()) {
				if (c.name().equals(test)) {
					return true;
				}
			}
			return false;
		}
	}

	public static enum Dataset {
		PHOTOS, I360, VIDEOS, CAPTIONS, LANGUAGES, PROPERTY_TYPES, STATES, LINK_CODES;

		public static boolean isValid(String test) {
			for (Dataset c : Dataset.values()) {
				if (c.name().equals(test)) {
					return true;
				}
			}
			return false;
		}
	}

	/* getters */

	public String getPropertyTypesString() {
		return propertyTypes.stream().map(t -> Integer.toString(t)).collect(Collectors.joining(","));
	}
 	
	public String getUserName() {
		return userName;
	}

	public Boolean isDebug() {
		return debug;
	}

	public void setDebug(Boolean debug) {
		this.debug = debug;
	}



	public String getPassword() {
		return password;
	}

	public String getUserMtype() {
		return userMtype;
	}

	public Integer getPubStatus() {
		return pubStatus;
	}

	public Integer getModType() {
		if (since == null) {
			return ModType.ALL.code;
		}
		return ModType.MODIFIED_SINCE.code;
	}

	public List<Integer> getPropertyTypes() {
		return propertyTypes;
	}

	public Boolean getIncremental() {
		return incremental;
	}

	public LocalDate getSince() {
		return since;
	}

	public String getSinceString() {
		if (since == null) {
			return "";
		}
		return since.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}

	public List<String> getDatasets() {
		return datasets;
	}

	public String getLinkType() {
		return linkType;
	}

	
	

}
