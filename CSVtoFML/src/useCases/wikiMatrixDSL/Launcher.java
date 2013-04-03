package useCases.wikiMatrixDSL;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

import CSVtoFML.FMLConvert;
import CSVtoFML.StoFMLReader;

public class Launcher {
    /**
    * Loads the specified file into a String representation
    * @author Stephane Nicoll - Infonet FUNDP
    * @version 0.1
    */
    public static String loadFile(File f) {
    	StringWriter out = new StringWriter();
        try {
           BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
           int b;
           while ((b=in.read()) != -1)
               out.write(b);
           out.flush();
           out.close();
           in.close();
           return out.toString();
        }
        catch (IOException ie)
        {
             ie.printStackTrace(); 
        }
		return out.toString();
    }
	    
	public static void main(String[] args) {
		String path = "Ressources/usesCases/wikiMatrixDSL/filters/small1.stofm";
		StoFMLReader stoFMR = new StoFMLReader();
		try {
			FMLConvert converter = stoFMR.execute(loadFile(new File(path)));
			System.out.println(converter.getFinalFAMILIARScript());
			System.out.println(converter.getFinalFeatureModel(false));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
