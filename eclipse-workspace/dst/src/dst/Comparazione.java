package dst;

import java.util.Comparator;
import java.util.HashMap;

public class Comparazione implements Comparator<HashMap<String, String>> {
    private final String c = "assenze";



   // ordine discendente
    @Override
   public int compare(HashMap<String, String> uno, HashMap<String, String> due) {
       
   	Integer primoval = 0;
   	Integer secondoval = 0;
   	
   	try {
   		primoval = Integer.parseInt(uno.get(c));
   		secondoval = Integer.parseInt(due.get(c));
   		
   	} catch(Exception exc) {}
       
       return  secondoval.compareTo(primoval);
   	
   
   }
}
