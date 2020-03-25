import java.util.*;

public class Nuovo1 {
    	public static void main(String[] args) {
    		// chiedete all'utente di inserire una vocale finchè non inserisce una vocale.
    		
    		Scanner in = new Scanner(System.in);
    		
    		String letter = " ";
    		
    		
    		
    		while(!isVowel(letter) ) {
    			 System.out.println("enter vowel");
    			 letter = in.nextLine();
    			 		 
    		}
    		System.out.println("letter okay : " + letter);
    		
    		in.close();
    		}   	
    	static boolean isVowel(String v) {
    		boolean isOkay = false;
    		
    		switch(v) {
    		case"a":
    		case"e":
    		case"i":
    		case"o":
    		case"u":
    		    isOkay = true;
    		break;
    		}
    		return(isOkay) ? true : false;
    	}
}
			