import java.util.*;

 public class Esercizio1 {

	public static void main(String[] args) {
	
    Scanner in = new Scanner(System.in);
    
    int age = 0;
   
    
    
    while( age<18 ) {
    System.out.println("How old are you ?");
    age = Integer.parseInt(in.nextLine());
    
    }
     if( age>=18 && age<=35) {
	   System.out.println("you are young");
    }
    else if ( age>= 35 && age <=70) {
    	System.out.println("you are mature");
    }	
    else if( age>=70) {
    	System.out.println("you are too old");
    }
    
    in.close();
 
	
   

    

 }
 
 }
 
 