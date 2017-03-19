package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.ArrayOfSubCategory;
import com.iceportal.services.service.SubCategory;

/**
 * @author David Esner
 */
public class SubcategoryWrapper {
	private int parentId;
	protected int id;
	protected String iceCateogry;
	
	

	public SubcategoryWrapper() {
		super();
	}

	public SubcategoryWrapper(int parentId, SubCategory sub) {
		super();
		this.parentId = parentId;
		this.id = sub.getID();
		this.iceCateogry = sub.getIceCateogry();
	}

	public static class Builder {
		public static List<SubcategoryWrapper> build(int parentId, ArrayOfSubCategory subcats) {
			List<SubcategoryWrapper> result = new ArrayList<>();
			if (subcats == null) {
				return result;
			}
			subcats.getSubCategory().forEach(t -> result.add(new SubcategoryWrapper(parentId, t)));
			return result;
		}
	}

	public int getParentId() {
		return parentId;
	}

	public int getId() {
		return id;
	}

	public String getIceCateogry() {
		return iceCateogry;
	}



}
