package Exam;
import java.util.regex.*;
public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(
	    	        Pattern.matches("[a-zA-Z]{3}-[\\d]{2}-[a-zA-Z]{3}-[\\d]{3}", "aaa-10-aaa-255"));
		
	      System.out.println(
	    	        Pattern.matches("[\\d]{2}-[a-zA-Z]{3}", "10-AAA"));
	}

}
