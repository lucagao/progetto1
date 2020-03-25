package Zeta;

import java.io.*;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class FileWithScanner {
	public static void main(String[] args) {
		readFile( "FileWithScanner.txt" );
	}
	
	public static void readFile(String fn) {
		 try {
	      File file = new File(fn);
	      Scanner scan = new Scanner(file);
	      int i = 0;
	      
	      while (scan.hasNextLine()) {
	   
	    	String data = scan.nextLine();
	    	if( i == 0 )
	    		System.out.println(data);
	    	else if( i%2==0 ) 
	    		System.out.println("\t" + data);
	    	else 
	    		System.out.println(data);
	    	
	    	i++;
	      }
	      
	      scan.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}