package Zeta;



	import java.util.Scanner;

	public class Eccezione {
	    public static void main(String args[]) {
	     
	        int[] x = {17,5,87,11};
	        
	        Scanner in = new Scanner(System.in);
	        System.out.println( "Gimme an index from 0 to 3:" );
	        
	        try {
	            int index = Integer.parseInt( in.nextLine() );  
	            
	            try {
	                System.out.println( x[index] );
	            }
	            catch(ArrayIndexOutOfBoundsException e) {
	                System.out.println( "ArrayOUB: Non puoi usare 10" );
	            }
	            catch(Exception e) {
	                System.out.println( "Generic: Non puoi usare 10" );
	            }
	            
	        }
	        catch(NumberFormatException e) {
	            System.out.println( "NumberFormatException: Non puoi usare stringhe" );
	        }
	        
	        System.out.println("here");
	        
	        try {
	            String a = null;
	            a.toUpperCase();
	        }
	        catch(NullPointerException e) {
	            //e.printStackTrace(); 
	            //System.out.println(e.toString());
	            //System.out.println(e.getMessage());
	            
	            System.out.println( "NullPointer: Non puoi usare metodi su null" );
	        }
	        
	        try {
	            int res = 100 / 0;
	            System.out.println(res);
	        }
	        catch(ArithmeticException e) {
	            System.out.println( "Non puoi dividere per zero!" );
	        }
	        
	        try {
	            System.out.println( "Gimme a gender [m/f]:" );
	            String g = in.nextLine();
	            
	            if( !g.equals("m") || !g.equals("f") ) {
	                throw new WrongGenderExeption("Gender must be 'm' or 'f'");
	            }    
	        }
	        catch(WrongGenderExeption e) {
	            System.out.println( e.helloLuca() );
	        }
	        
	     
	    }
	}

	class WrongGenderExeption extends Exception {
	   String msg;
	   
	   WrongGenderExeption(String ms) {
	        msg = ms;
	   }
	   
	   public String toString(){ 
	        return ("Wrong Gender! Why? Because " + msg) ;
	   }
	   
	   public String helloLuca() {
	       return "hello luca";
	   }
	}