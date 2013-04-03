package useCases.wikiMatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import CSVtoFML.CSVAbstract;
import CSVtoFML.ConversionModelArray;
import CSVtoFML.UseCase;

/**
 * 
 * @author Charles Vanbeneden
 */
public class WikiMatrixUseCase extends UseCase {

	public WikiMatrixUseCase(Boolean debug, Boolean viewIds) {
		super(debug, viewIds);
	}

	public void conversion() throws Exception {
		super.conversion();
		_converter = new WikiMatrixToFMLConverter("Ressources/usesCases/wikiMatrix/XML/items.xml",
				"Ressources/usesCases/wikiMatrix/XML/products.xml", "N_A", ",", "WikiCompare", true);
		_converter.setVerbose(_debug);
	}

	public void filterCSVParsersPaperExampleSmall() throws Exception {
		ConversionModelArray convModArr = _converter.getConversionModel().getView("GeneralFeatures");
		ArrayList<String> colList = new ArrayList<String>();
		colList.add("License");
		colList.add("ProgrammingLanguage");
		colList.add("DataStorage");
		colList.add("LicenseCost_Fee");
		convModArr.filterKeepOnlyColumns(colList);

		colList = new ArrayList<String>();
		colList.add("UnicodeSupport");
		convModArr = _converter.getConversionModel().getView("SpecialFeatures");
		convModArr.filterKeepOnlyColumns(colList);
		
		colList = new ArrayList<String>();
		colList.add("RSSFeeds");
		convModArr = _converter.getConversionModel().getView("Output");
		convModArr.filterKeepOnlyColumns(colList);

		CSVAbstract csvAggragate = (CSVAbstract) _converter.getConversionModel().getView("GeneralFeatures");
		csvAggragate.aggregateWith((CSVAbstract) _converter.getConversionModel().getView("SpecialFeatures"));
		csvAggragate.aggregateWith((CSVAbstract) _converter.getConversionModel().getView("Output"));
		csvAggragate.setViewName("General");
		ArrayList<String> viewNamesToKeep = new ArrayList<String>();
		viewNamesToKeep.add("General");
		_converter.getConversionModel().filterKeepOnlyViews(viewNamesToKeep);
		
		ArrayList<String> rows = new ArrayList<String>();
		rows.add("DokuWiki");
		rows.add("MediaWiki");
		rows.add("PmWiki");
		rows.add("TWiki");
		rows.add("DrupalWiki");
		rows.add("Confluence");
		rows.add("MoinMoin");
		rows.add("PBwiki");
		_converter.getConversionModel().filterKeepOnlyEntities(rows);
		
		HashMap<String, String> remplaceMap = new HashMap<String, String>();
		remplaceMap.put("GPL2", "GPL2");
		remplaceMap.put("Commercial", "Commercial");
		remplaceMap.put("StartingatUS10", "US10");
		remplaceMap.put("Level1Level2Level3Level4Level5Level6", "Yes");
		remplaceMap.put("X3", "Yes");
		remplaceMap.put("PerlJavaScript", "Perl");
		remplaceMap.put("Communityrelease0feeforsubscriptionsforsupportorhosting", "Community");
		_converter.getConversionModel().filterReplaceValuesBy(remplaceMap);
	}

	public void filterCSVParsersPaperExampleBig() throws Exception {

		ConversionModelArray csv = _converter.getConversionModel().getView("GeneralFeatures");
		ArrayList<String> colList = new ArrayList<String>();
		colList.add("License");
		colList.add("ProgrammingLanguage");
		colList.add("DataStorage");
		colList.add("LicenseCost_Fee");
		csv.filterKeepOnlyColumns(colList);
		csv.setViewName("General");

		csv = _converter.getConversionModel().getView("SpecialFeatures");
		colList = new ArrayList<String>();
		colList.add("UnicodeSupport");
		csv.filterKeepOnlyColumns(colList);

		ConversionModelArray csv2 = _converter.getConversionModel().getView("Output");
		colList = new ArrayList<String>();
		colList.add("RSSFeeds");
		csv2.filterKeepOnlyColumns(colList);
		((CSVAbstract) csv).aggregateWith(((CSVAbstract) csv2));
		csv.setViewName("Functionalities");

		csv2 = _converter.getConversionModel().getView("MediaandFiles");
		colList = new ArrayList<String>();
		colList.add("EmbeddedFlash");
		colList.add("ImageEditing");
		csv.filterReplaceValuesBy("Number1Number2", "Yes");
		csv2.filterKeepOnlyColumns(colList);
		((CSVAbstract) csv).aggregateWith(((CSVAbstract) csv2));

		csv = _converter.getConversionModel().getView("SystemRequirements");
		csv.filterColumn("Webserver");
		csv.filterReplaceValuesBy("X4", "Yes");
		csv.filterReplaceColumnValuesBy("WindowsMacLinuxandUnixvariants", "No", "OperatingSystem");
		csv.setViewName("Requirements");

		ArrayList<String> viewNamesToKeep = new ArrayList<String>();
		viewNamesToKeep.add("General");
		viewNamesToKeep.add("Requirements");
		viewNamesToKeep.add("Functionalities");
		_converter.getConversionModel().filterKeepOnlyViews(viewNamesToKeep);

		ArrayList<String> rows = new ArrayList<String>();
		rows.add("DokuWiki");
		rows.add("MediaWiki");
		rows.add("PmWiki");
		rows.add("TWiki");
		rows.add("DrupalWiki");
		rows.add("Confluence");
		rows.add("MoinMoin");
		rows.add("PBwiki");
		_converter.getConversionModel().filterKeepOnlyEntities(rows);

		HashMap<String, String> remplaceMap = new HashMap<String, String>();
		remplaceMap.put("GPL2", "GPL2");
		remplaceMap.put("Commercial", "Commercial");
		remplaceMap.put("StartingatUS10", "US10");
		remplaceMap.put("Level1Level2Level3Level4Level5Level6", "Yes");
		remplaceMap.put("X3", "Yes");
		remplaceMap.put("PerlJavaScript", "Perl");
		remplaceMap.put("Communityrelease0feeforsubscriptionsforsupportorhosting", "Community");
		_converter.getConversionModel().filterReplaceValuesBy(remplaceMap);
	}
	/*
	 * private void viewsDivideBy2() throws Exception {
	 * CSVParser csv2;
	 * int i = 0;
	 * int w = _converter.getCSVParsers().size();
	 * while (i < w) {
	 * if (i >= w / 2) {
	 * csv2 = _converter.getCSVParsers().get(i);
	 * _converter.filterCSVRemoveView(csv2);
	 * w--;
	 * i--;
	 * }
	 * i++;
	 * }
	 * }
	 * private void filterCSVParsersBigDivided2NaFiltered() throws Exception {
	 * filterCSVParsersBig();
	 * viewsDivideBy2();
	 * HashMap<String, String> remplaceMap = new HashMap<String, String>();
	 * remplaceMap.put("N_A", "Yes");
	 * _converter.filterCSVRemplaceValuesBy(remplaceMap);
	 * }
	 * private void filterCSVParsersBigDivided2() throws Exception {
	 * filterCSVParsersBig();
	 * viewsDivideBy2();
	 * }
	 * private void filterCSVParsersBigFiltered() throws Exception {
	 * filterCSVParsersBig();
	 * HashMap<String, String> remplaceMap = new HashMap<String, String>();
	 * remplaceMap.put("N_A", "Yes");
	 * remplaceMap.put("No", "Yes");
	 * _converter.filterCSVRemplaceValuesBy(remplaceMap);
	 * }
	 * private void filterCSVParsersBig() throws Exception {
	 * Boolean entityAdded = true;
	 * int i = 0;
	 * int j = _converter.getCSVParsers().size();
	 * CSVParser csv;
	 * while (i < j) {
	 * csv = _converter.getCSVParsers().get(i);
	 * if (csv.getViewName().compareTo("GeneralFeatures") == 0) {
	 * ArrayList<String> colList = new ArrayList<String>();
	 * colList.add("License");
	 * colList.add("ProgrammingLanguage");
	 * colList.add("DataStorage");
	 * colList.add("LicenseCost_Fee");
	 * csv.filterKeepOnlyColumns(colList);
	 * } else if (csv.getViewName().compareTo("CommonFeatures") == 0) {
	 * csv.filterColumn("PageHistory");
	 * } else if (csv.getViewName().compareTo("Datastorage") == 0) {
	 * _converter.filterCSVRemoveView(csv);
	 * i = i - 1;
	 * j = j - 1;
	 * } else if (csv.getViewName().compareTo("Development_Support") == 0) {
	 * csv.filterColumn("PreconfiguredHosting");
	 * csv.filterColumn("CodeRepository");
	 * csv.filterColumn("SupportForum");
	 * } else if (csv.getViewName().compareTo("Extras") == 0) {
	 * _converter.filterCSVRemoveView(csv);
	 * i = i - 1;
	 * j = j - 1;
	 * } else if (csv.getViewName().compareTo("HostingFeatures") == 0) {
	 * ArrayList<String> colList = new ArrayList<String>();
	 * colList.add("CorporateBranding");
	 * colList.add("OwnDomain");
	 * colList.add("Adsallowed");
	 * csv.filterKeepOnlyColumns(colList);
	 * } else if (csv.getViewName().compareTo("Links") == 0) {
	 * // good
	 * } else if (csv.getViewName().compareTo("MediaandFiles") == 0) {
	 * ArrayList<String> colList = new ArrayList<String>();
	 * colList.add("EmbeddedFlash");
	 * colList.add("ImageEditing");
	 * colList.add("FileAttachments");
	 * csv.filterKeepOnlyColumns(colList);
	 * } else if (csv.getViewName().compareTo("Output") == 0) {
	 * csv.filterColumn("MobileFriendly");
	 * csv.filterColumn("ThemesSkins");
	 * csv.filterColumn("AutoTOC");
	 * csv.filterColumn("PDFExport");
	 * csv.filterColumn("XMLexport");
	 * } else if (csv.getViewName().compareTo("Security_AntiSpam") == 0) {
	 * ArrayList<String> colList = new ArrayList<String>();
	 * colList.add("PagePermissions");
	 * colList.add("ACL");
	 * colList.add("MailEncryption");
	 * csv.filterKeepOnlyColumns(colList);
	 * } else if (csv.getViewName().compareTo("SpecialFeatures") == 0) {
	 * csv.filterColumn("InterfaceLanguages");
	 * csv.filterColumn("Search");
	 * } else if (csv.getViewName().compareTo("SyntaxExamples") == 0) {
	 * _converter.filterCSVRemoveView(csv);
	 * i = i - 1;
	 * j = j - 1;
	 * } else if (csv.getViewName().compareTo("SyntaxFeatures") == 0) {
	 * csv.filterColumn("Scripting");
	 * csv.filterColumn("EmoticonImages");
	 * } else if (csv.getViewName().compareTo("SystemRequirements") == 0) {
	 * csv.filterColumn("Webserver");
	 * csv.filterColumn("OtherRequirements");
	 * } else if (csv.getViewName().compareTo("Usability") == 0) {
	 * csv.filterColumn("AutoSignature");
	 * }
	 * i++;
	 * }
	 * ArrayList<String> rows = new ArrayList<String>();
	 * rows.add("DokuWiki");
	 * rows.add("MediaWiki");
	 * rows.add("PmWiki");
	 * rows.add("TWiki");
	 * rows.add("DrupalWiki");
	 * rows.add("Confluence");
	 * rows.add("MoinMoin");
	 * rows.add("PBwiki");
	 * if (entityAdded) {
	 * rows.add("JaWiki");
	 * rows.add("Gazest");
	 * }
	 * _converter.filterCSVKeepOnlyRows(rows);
	 * HashMap<String, String> remplaceMap = new HashMap<String, String>();
	 * remplaceMap.put("GPL2", "GPL2");
	 * remplaceMap.put("Commercial", "Commercial");
	 * remplaceMap.put("StartingatUS10", "US10");
	 * remplaceMap.put("Level1Level2Level3Level4Level5Level6", "Yes");
	 * remplaceMap.put("X2", "Yes");
	 * remplaceMap.put("X3", "Yes");
	 * remplaceMap.put("X4", "Yes");
	 * remplaceMap.put("Http", "Yes");
	 * remplaceMap.put("opensource", "opensource");
	 * remplaceMap.put("Communityrelease0feeforsubscriptionsforsupportorhosting",
	 * "Community");
	 * _converter.filterCSVRemplaceValuesBy(remplaceMap);
	 * }
	 * private void filterFMLConverter() {
	 * // TODO : filtrage ici
	 * }
	 */
	/*
	 * public void finalCSVToDisk(String directory) throws Exception {
	 * if (!_hasConverted)
	 * conversion();
	 * _converter.writeFinalCSVFilestoFolder(directory);
	 * }
	 */
}
