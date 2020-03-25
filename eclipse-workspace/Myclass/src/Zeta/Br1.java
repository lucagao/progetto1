package Zeta;

import java.io.*;  
import java.util.*;

public class Br1 {
	
	static String filename = "filename.txt";

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me the text to insert in the file '" + filename + "':");
		String text = in.nextLine();
		
		System.out.println("Give me the second text:");
		String text2 = in.nextLine();
		
		in.close();
		
		read();
		write(text, text2);
		read();

	}
	
	public static void read() throws Exception {
		
		FileReader fr = new FileReader(filename);    
        BufferedReader br = new BufferedReader(fr);    

        int i;    
        while(	(i=br.read()) !=-1	){  
        	System.out.println( (char)i );  
        }  
        
        br.close();    
        fr.close(); 
	
	}
	
	public static void write(String txt, String txt2) throws Exception {
		FileWriter writer = new FileWriter(filename);  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    
	    String finalTxt = txt + "\n---------------\n";
	    String tab = "\t";
	    
	    buffer.write(finalTxt);  
	    
	    for(int i = 0; i < txt2.length(); i++) {
	    	buffer.write( tab + "" + txt2.charAt(i) + "\n" );
	    	tab += tab;
	    }
	    
	    buffer.close();  
	    
	    System.out.println("*** Success in writing ***");  
	}

}