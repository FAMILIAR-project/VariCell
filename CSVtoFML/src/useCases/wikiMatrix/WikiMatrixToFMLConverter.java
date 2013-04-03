package useCases.wikiMatrix;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import CSVtoFML.CSVParser;
import CSVtoFML.CSVWriter;
import CSVtoFML.ConversionModelArray;
import CSVtoFML.FMLConvert;
import CSVtoFML.ToFMLConverter;
import Exceptions.NotValidCSVFileException;

/**
 * @author Charles Vanbeneden
 */
public class WikiMatrixToFMLConverter extends ToFMLConverter {

	protected Map<String, CSVWriter> _csvFiles;
	protected Document _items;
	protected Document _products;

	public WikiMatrixToFMLConverter(String itemsPath, String productsPath, String defaultCharacter, String separator,
			String rootFeatureName, Boolean showID) throws Exception {
		super(defaultCharacter, separator, rootFeatureName, showID);
		SAXBuilder sxb = new SAXBuilder();
		_items = sxb.build(new File(itemsPath));
		_products = sxb.build(new File(productsPath));
		_csvFiles = new HashMap<String, CSVWriter>();
		generateConversionModel();
	}

	protected void generateConversionModel() throws Exception {
		if (_verbose) {
			System.out.println("**************");
			System.out.println("STRUCTURE");
			System.out.println("**************");
		}
		List viewNames = _items.getRootElement().getChildren("itemgroup");
		Iterator viewNamesIterator = viewNames.iterator();
		CSVWriter csv;
		Element viewName;
		List children;
		Iterator childrens;
		Element child;
		while (viewNamesIterator.hasNext()) {
			viewName = (Element) viewNamesIterator.next();
			csv = new CSVWriter("Identifior", _separator, _defaultCharacter, viewName.getAttributeValue("name"));
			if (_verbose)
				System.out.println(FMLConvert.makeNameValid(viewName.getAttributeValue("name")));
			_csvFiles.put(FMLConvert.makeNameValid(viewName.getAttributeValue("name")), csv);
			children = viewName.getChildren();
			childrens = children.iterator();
			while (childrens.hasNext()) {
				child = (Element) childrens.next();
				if (_verbose)
					System.out.println("> " + FMLConvert.makeNameValid(child.getAttributeValue("name")));
				csv.addLabel(FMLConvert.makeNameValid(child.getAttributeValue("name")));
			}
		}

		if (_verbose) {
			System.out.println("**************");
			System.out.println("CONTENT");
			System.out.println("**************");
		}
		List productNames = _products.getRootElement().getChildren();
		Iterator productNamesIterator = productNames.iterator();
		Element product;
		String productName;
		Iterator productChildrensIterator;
		Element childrenProduct;
		List productChildrens;
		String tmp;
		Iterator itemsIterator;
		List items;
		String tmpX;
		while (productNamesIterator.hasNext()) {
			product = (Element) productNamesIterator.next();
			productName = product.getAttributeValue("name");
			if (_verbose)
				System.out.println(productName);
			productChildrens = product.getChildren();
			productChildrensIterator = productChildrens.iterator();
			while (productChildrensIterator.hasNext()) {
				childrenProduct = (Element) productChildrensIterator.next();
				tmp = FMLConvert.makeNameValid(childrenProduct.getAttributeValue("name"));
				if (_verbose)
					System.out.println(tmp);
				if (childrenProduct.getName().compareTo("general_info") != 0) {
					if (_csvFiles.containsKey(tmp)) {
						csv = _csvFiles.get(tmp);
						csv.addRow(FMLConvert.makeNameValid(productName));
						items = childrenProduct.getChildren();

						itemsIterator = items.iterator();
						while (itemsIterator.hasNext()) {
							Element item = (Element) itemsIterator.next();
							tmpX = FMLConvert.makeNameValid(item.getText());
							if (tmpX == null || tmpX.compareTo("") == 0)
								tmpX = "N_A";
							if (_verbose) {
								System.out.println("> " + FMLConvert.makeNameValid(item.getAttributeValue("name")));
								System.out.println("> > " + tmpX);
							}
							csv.addValueToRowLabel(FMLConvert.makeNameValid(productName),
									FMLConvert.makeNameValid(item.getAttributeValue("name")), tmpX);
						}
					}
				}
			}
		}
		convertCSVWritersToConversionModel();
	}

	private void convertCSVWritersToConversionModel() throws Exception {
		Set<String> viewNames = _csvFiles.keySet();
		for (String viewName : viewNames) {
			_conversionModel.addView(_csvFiles.get(viewName).toCSVParserDeepCopy());
		}
	}

	public void writeFinalCSVFilestoFolder(String directory) throws NotValidCSVFileException {
		Iterator<ConversionModelArray> viewIT = _conversionModel.getViewsIterator();
		CSVParser view;
		while (viewIT.hasNext()) {
			view = (CSVParser) viewIT.next();
			view.toCSVWriterDeepCopy().writeCSVToFile(directory + view.getViewName() + ".csv");
		}
	}
}
