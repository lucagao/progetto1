import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String[] parole = new String[4];
		
			for(int i = 0; i < parole.length; i++) {
				System.out.println("Scrivi una parola");
				parole[i] = in.nextLine();
			}
			
			in.close();
			
		getInvertedWord(parole);
		getLongestWord(parole);
		

	 
	}
	 
	public static void getInvertedWord(String[] x) {
		for(int a = 0; a < x.length; a++) {
			String inverted = "";
			for(int b = 1; b < x[a].length(); a++) {
				char otherCh = x[a].charAt(x[a].length() - b);
				inverted += otherCh;
			}
			
			System.out.println("La parola invertita è : " + inverted);
		}
	}
	
	public static void getLongestWord(String[] y) {
		int longer = y[0].length();
		String long = y[0];
		for(int c = 1; c < y.length; c++) {
		  if(y[c].length() > longer) {
			  longer = y[c].length();
			  long = y[c];
			  
	   System.out.printf("la parola più lunga ha letter: %d ed è %s",longer,long);
			  
		  } 
		  }
	}
}	  
	    
	    	
	    	 
	    	
	    	
