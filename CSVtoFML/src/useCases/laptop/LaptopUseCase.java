package useCases.laptop;

import fr.unice.polytech.modalis.familiar.interpreter.FMLShell;
import CSVtoFML.UseCase;

public class LaptopUseCase extends UseCase {

	public LaptopUseCase(Boolean debug, Boolean viewIDs, FMLShell shell) {
		super(debug, viewIDs, shell);
	}

	public LaptopUseCase(Boolean debug, Boolean viewIDs) {
		super (debug, viewIDs);
	}

	public void conversion() throws Exception {
		super.conversion();
		_converter = new LaptopConverter("Ressources/usesCases/laptop/CSV/", "N_A", ",", "Laptop", _viewIDs);
		_converter.setVerbose(_debug);
	}

	public void filterCSVParsers() throws Exception {
		_converter.getConversionModel().filterKeepOnlyXViews(2);
	}

	public void filterFMLConverter() {

	}

}
