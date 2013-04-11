import java.util.List;
import java.util.Map;


import com.google.gson.annotations.SerializedName;


public class WikipediaPage {
	
	
	
	
	public Query query ; 
	
	class Query {
		
		
		public Map<Integer, Pages> pages ;
		
		
		class Pages {
			public String pageid ;
			public String title ; 	
			public List<Revision> revisions; 
			
			class Revision {
				
				@SerializedName("*")
				public String content ; 
				public String contentformat ; 
				public String contentmodel ; 
			}
		}
			
		
		public List<Normalized> normalized ; 
		
		
		class Normalized {			
			
			public String from ; 
			public String to ;
			
		}




	}


	
	

	

	

	
}
