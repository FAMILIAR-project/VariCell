package useCases.general;

import CSVtoFML.UseCase;

/**
 * 
 * @author Oleksandr Taran
 * 
 */
public class GeneralUseCase extends UseCase {
	protected String varicellFileName;
	protected String folder;
	protected Boolean multivaluesMovement;

	public GeneralUseCase(Boolean debug, Boolean viewIds, Boolean multivaluesMovement, String folder, String varicellFileName) {
		super(debug, viewIds);
		this.varicellFileName = varicellFileName;
		this.folder = folder;
		this.multivaluesMovement = multivaluesMovement;
		setExcelPath("Ressources/usesCases/" + folder + "/EXCEL/");
	}
	
	public void conversion() throws Exception {
		super.conversion();
		_converter = new GeneralToFMLConverter(_viewIDs, folder, multivaluesMovement, varicellFileName);
		_converter.setVerbose(_debug);
	}
	
}
