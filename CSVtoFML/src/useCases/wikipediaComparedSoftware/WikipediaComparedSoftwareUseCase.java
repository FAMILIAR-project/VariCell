package useCases.wikipediaComparedSoftware;

import CSVtoFML.UseCase;

/**
 * 
 * @author Charles Vanbeneden
 * 
 */
public class WikipediaComparedSoftwareUseCase extends UseCase {

	public WikipediaComparedSoftwareUseCase(Boolean debug, Boolean viewIDs) {
		super(debug, viewIDs);
	}

	public void conversion() throws Exception {
		super.conversion();
		_converter = new WikipediaComparedSoftwareToFMLConverter("Ressources/usesCases/wikipediaComparedSoftware/CSV/", "N_A", ",",
				"WikipediaComparedSofware", _viewIDs);
		_converter.setVerbose(_debug);
	}

	public void filterCSVParsers() throws Exception {
		_converter.getConversionModel().filterKeepOnlyXViews(2);
		_converter.getConversionModel().filterKeepOnlyXFirstRows(5);
	}


}
