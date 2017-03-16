package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.ArrayOfItemForVisuals;
import com.iceportal.services.service.ItemForVisuals;

/**
 * @author David Esner
 */
public class CaptionItemWrapper {

	private String captionId;
	private String itemType;
	protected String text;
	protected int lcid;
	
	public CaptionItemWrapper(){}

	public CaptionItemWrapper(String uniqueId, String itemType, ItemForVisuals cv) {
		if (cv == null) {
			return;
		}
		this.itemType = itemType;
		this.captionId = uniqueId;
		this.text = cv.getText();
		this.lcid = cv.getLcid();
	}

	public static class Builder {
		public static List<CaptionItemWrapper> build(String itemType, String uniqueId,
				ArrayOfItemForVisuals captionItems) {
			List<CaptionItemWrapper> result = new ArrayList<>();
			if ( captionItems == null) {
				return result;
			}
			captionItems.getItem().forEach(t -> result.add(new CaptionItemWrapper(uniqueId, itemType, t)));
			return result;
		}
	}

	public String getCaptionId() {
		return captionId;
	}

	public String getItemType() {
		return itemType;
	}

	public String getText() {
		return text;
	}

	public int getLcid() {
		return lcid;
	}
	
}
