package esnerda.keboola.ex.iceportal.ws;

import org.apache.cxf.common.util.StringUtils;

/**
 * @author David Esner
 */
public class IceClientConfig {
	private final String userName;
	private final String password;
	private final String userMtype;

	public IceClientConfig(String userName, String password, String userMtype) {
		super();
		this.userName = userName;
		this.password = password;
		this.userMtype = userMtype;
	}

	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getUserMtype() {
		return userMtype;
	}

	public boolean isValid(){
		return !StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password);
	}
	
	
}
