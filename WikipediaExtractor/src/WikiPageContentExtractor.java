import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

/**
 * Based on http://www.xyzws.com/Javafaq/how-to-use-httpurlconnection-post-data-to-web-server/139
 */

/**
 * @author macher1
 *
 */
public class WikiPageContentExtractor {

	public static final String WIKIPEDIA_BASE_URL = "http://en.wikipedia.org/w/api.php?";


	/**
	 * 
	 */
	public WikiPageContentExtractor() {
		// TODO Auto-generated constructor stub
	}
	
	public String getContent(String page) {
		String jsonContent = executeGet (WIKIPEDIA_BASE_URL, mkUrlParameters(page));
		// treat jsonContent
		
		WikipediaPage d = new Gson().fromJson(jsonContent, WikipediaPage.class); 
		/*
		 String json = 
		            "{"
		                + "'title': {'name': 'Computing and Information systems'},"
		                + "'id' : 1,"
		                + "'children' : 'true',"
		                + "'groups' : [{"
		                    + "'title' : 'Level one CIS',"
		                    + "'id' : 2,"
		                    + "'children' : 'true',"
		                    + "'groups' : [{"
		                        + "'title' : 'Intro To Computing and Internet',"
		                        + "'id' : 3,"
		                        + "'children': 'false',"
		                        + "'groups':[]"
		                    + "}]" 
		                + "}]"
		            + "}";

		        // Now do the magic.
		Data data = new Gson().fromJson(json, Data.class);
		*/
		// getNormalized().iterator().next().getTo()
		return d.query.pages.values().iterator().next().revisions.iterator().next().content +  "";
		//return d.getQuery().getNormalized().iterator().next().from + "\n :: " + jsonContent ; 
	}
	
		
	private String mkUrlParameters(String page) {
		return "action=query&prop=revisions&format=json&rvprop=content&rvlimit=1&titles=" + page ; 
		 //  "fName=" + URLEncoder.encode("???", "UTF-8") +
	     //  "&lName=" + URLEncoder.encode("???", "UTF-8") ;
	}
	

	public String executeGet(String targetURL, String urlParameters)
	  {
	    URL url;
	    HttpURLConnection connection = null;  
	    try {
	      //Create connection
	      url = new URL(targetURL);
	      connection = (HttpURLConnection)url.openConnection();
	      connection.setRequestMethod("GET");
	      connection.setRequestProperty("Content-Type", 
	           "application/x-www-form-urlencoded");
				
	      connection.setRequestProperty("Content-Length", "" + 
	               Integer.toString(urlParameters.getBytes().length));
	      connection.setRequestProperty("Content-Language", "en-US");  
				
	      connection.setUseCaches (false);
	      connection.setDoInput(true);
	      connection.setDoOutput(true);

	      //Send request
	      DataOutputStream wr = new DataOutputStream (
	                  connection.getOutputStream ());
	      wr.writeBytes (urlParameters);
	      wr.flush ();
	      wr.close ();

	      //Get Response	
	      InputStream is = connection.getInputStream();
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	      String line;
	      StringBuffer response = new StringBuffer(); 
	      while((line = rd.readLine()) != null) {
	        response.append(line);
	        response.append('\r');
	      }
	      rd.close();
	      return response.toString();

	    } catch (Exception e) {

	      e.printStackTrace();
	      return null;

	    } finally {

	      if(connection != null) {
	        connection.disconnect(); 
	      }
	    }
	  }

}
