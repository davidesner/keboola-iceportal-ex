package esnerda.keboola.ex.iceportal.result.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.iceportal.services.service.Categories;
import com.iceportal.services.service.ICESubCategories;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.iceportal.result.wrappers.SubcategoryWrapper;

/**
 * @author David Esner
 */
public class CategoriesWriter implements IResultWriter<Map<Categories, ICESubCategories>> {

	private IResultWriter<Categories> categoryWriter;
	private IResultWriter<SubcategoryWrapper> subcategoryWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(categoryWriter.closeAndRetrieveMetadata());
		results.addAll(subcategoryWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Map<Categories, ICESubCategories>> clazz) throws Exception {
		// init category writer
		categoryWriter = new DefaultBeanResultWriter<Categories>("category.csv", new String[] { "id" });
		categoryWriter.initWriter(path, Categories.class);
		// init subcat writer
		subcategoryWriter = new DefaultBeanResultWriter<SubcategoryWrapper>("subCategory.csv",
				new String[] { "id", "parentId" });
		subcategoryWriter.initWriter(path, SubcategoryWrapper.class);
	}

	@Override
	public void writeResult(Map<Categories, ICESubCategories> obj) throws Exception {
		for (Entry<Categories, ICESubCategories> cat : obj.entrySet()) {
			categoryWriter.writeResult(cat.getKey());
			if (cat.getValue() != null) {
				subcategoryWriter.writeAllResults(
						SubcategoryWrapper.Builder.build(cat.getValue().getID(), cat.getValue().getSubCateogories()));
			}

		}
	}

	@Override
	public void writeAllResults(List<Map<Categories, ICESubCategories>> objs) throws Exception {
		for (Map<Categories, ICESubCategories> o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Map<Categories, ICESubCategories>> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
