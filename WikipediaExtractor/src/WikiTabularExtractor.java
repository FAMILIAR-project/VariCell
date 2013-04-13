import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.sweble.wikitext.engine.CompiledPage;
import org.sweble.wikitext.engine.Compiler;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.engine.PageId;
import org.sweble.wikitext.engine.PageTitle;
import org.sweble.wikitext.engine.utils.HtmlPrinter;
import org.sweble.wikitext.engine.utils.SimpleWikiConfiguration;
import org.sweble.wikitext.lazy.LinkTargetException;

import CSVtoFML.CSVWriter;


/**
 * 
 */

/**
 * http://sweble.org/projects/swc/swc-example-basic/
 * @author macher1
 *
 */
public class WikiTabularExtractor {

	/**
	 * 
	 */
	public WikiTabularExtractor() {
		// TODO Auto-generated constructor stub
	}
	
	public String run(String wikitext, String fileTitle) throws FileNotFoundException, IOException, LinkTargetException, CompilerException
	{
		 // Set-up a simple wiki configuration
        SimpleWikiConfiguration config = new SimpleWikiConfiguration(
                "classpath:/org/sweble/wikitext/engine/SimpleWikiConfiguration.xml");
        
        // Instantiate a compiler for wiki pages
        Compiler compiler = new Compiler(config);
        
        // Retrieve a page
        PageTitle pageTitle = PageTitle.make(config, fileTitle);
        
        PageId pageId = new PageId(pageTitle, -1);
        
        
        // Compile the retrieved page
        CompiledPage cp = compiler.postprocess(pageId, wikitext, null);
        
       
        
        final int wrapCol = 80;
        StringWriter w = new StringWriter();
        
        

        HtmlPrinter p = new HtmlPrinter(w, pageTitle.getFullTitle());
        p.setCssResource("/org/sweble/wikitext/engine/utils/HtmlPrinter.css", "");
        p.setStandaloneHtml(true, "");
        
        p.go(cp.getPage());
        
        
        return w.toString();
        /*
        TextConverter p = new TextConverter(config, wrapCol);
		String str =  (String) p.go(cp.getPage());
		
		Collection<CSVWriter> csvs = p.get_csvs() ;
		for (CSVWriter csvWriter : csvs) {
			System.err.println("csvWriter(" + csvWriter.getIdentifior()+ ")=");
			System.err.println("" + csvWriter.getCSVString()); 
			csvWriter.writeCSVToFile("/Users/macher1/Documents/SANDBOX/" + csvWriter.getIdentifior() + ".csv");
			}*/
			
		/*
			Iterator<String> itLabels = csvWriter.getHeadLabelsIterator() ;
			while(itLabels.hasNext()) {
				String label = itLabels.next() ; 
				System.err.println("" + label);
			}*/			
			
		
		
		//return str ; 
		
	}


}
