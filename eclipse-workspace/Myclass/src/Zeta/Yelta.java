package Zeta;


	import java.util.ArrayList;
	import java.util.HashMap;

	public class Yelta {
	    
	    final static String sepString = "---------------------------------";
	    
	    public static void main(String args[]) {

	        ArrayList<String> words = new ArrayList<String>() {{
	            add("ciao");
	            add("sono");
	            add("java");
	        }};
	        
	        System.out.println( words );
	      
	        HashMap<String,String> student = new HashMap<String,String>() {{
	            put("name", "luca");
	            put("lastname", "gao");
	            put("age", "20");
	        }};
	        
	        System.out.println( student );
	        
	        ArrayList<HashMap<String,String>> students = new ArrayList<HashMap<String,String>>() {{
	            add(student); 
	            add( new HashMap<String,String>() {{ 
	                put("name", "ugo");
	                put("lastname", "ugolini");
	                put("age", "20");
	            }} );
	        }};
	        
	        System.out.println( students );
	        
	        sep(50);
	        for(HashMap<String,String> st : students) {
	            printStudent(st, "||");
	        }
	      
	    }
	    
	    static void printStudent(HashMap<String,String> st, String _sep) {
	         System.out.printf("Name: %s %s Lastname: %s %s Age: %s \n", 
	            st.get("name"), 
	            _sep,
	            st.get("lastname"),
	            _sep,
	            st.get("age")
	        );
	        sep(50);
	    }
	    
	    static void sep(int chars) {
	        String sep = "";
	        for(int i = 0; i < chars; i++) {
	            sep += "-";
	        }
	        System.out.println(sep);
	    }
	    
	    static void sep() {
	        System.out.println(sepString);
	    }

}
