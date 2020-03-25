

	import java.util.*;
	public class Xinnian {
	    
	    static String exitWord = "exit";
	    
	    public static void main(String args[]) {
	         // continuare a chiedere di inserire le parole, continuando a chiedere se è palindroma. L'esercizio deve
	         //incluedere degli spazi in mezzo alle parole, che se sono palindrome dovrà far uscire è palindromo con o senza
	         //gli spazi
	         
	         Scanner in = new Scanner(System.in);
	         String current = "";
	         
	         while( !current.equals(exitWord) ) {
	             System.out.println("Inserisci una parola: ");
	             current = in.nextLine();
	             Palindrome.checkPalindrome(current);
	         }
	         
	         
	         
	    }
	    
	    
	}

	class Palindrome {
	    final static String is = "E' palindroma ";
	    final static String isNot = "Non e' palindroma ";
	    final static String isBut = "E' palindroma, ma togliendo gli spazi ";
	    
	    static void checkPalindrome(String w) {
	         
	         String wReverse = createReverse(w);
	      
	         if (w.equals(wReverse))
	            System.out.println(is);
	         else {
	             
	             String wReverse2 = createReverse(w, ' ');
	             
	             String w2 = createReverse(wReverse2);
	             System.out.println(
	                ( wReverse2.equals(w2) ) 
	                ? isBut
	                : isNot
	             );
	            
	         }
	            
	    }
	    
	    static String createReverse(String s) {
	        String wReverse = "";
	        for(int i = s.length() -1; i >= 0; i-- ) {
	            wReverse = wReverse + s.charAt(i);    
	         }
	         
	         return wReverse;
	    }
	    
	    
	    static String createReverse(String s, char skip) {
	        String wReverse = "";
	        for(int i = s.length() -1; i >= 0; i-- ) {
	            wReverse = wReverse + ((s.charAt(i) == skip) ? "" : s.charAt(i));    
	         }
	         
	         return wReverse;
	    }
	}
