
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VariCellStandaloneSetup extends VariCellStandaloneSetupGenerated{

	public static void doSetup() {
		new VariCellStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

