package Zeta;



	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Scanner;

	public class Delta {
	    public static void main(String args[]) {
	     
	        Scanner in = new Scanner(System.in);
	        HashMap<String, Integer> nationalities = new HashMap<String, Integer>();
	        
	        ArrayList<HashMap<String, String>> people = new ArrayList<HashMap<String, String>>();
	        
	        int quantity = 0;
	        System.out.println("Quantity to insert:");
	        quantity = Integer.parseInt(in.nextLine());
	        
	        for(int i = 0; i < quantity; i++) {
	            String name = "";
	            System.out.println("Name:");
	            name = in.nextLine();
	            
	            String n = "";
	            System.out.println("Nationality:");
	            n = in.nextLine();
	            
	            HashMap<String, String> person = new HashMap<String, String>();
	            person.put("name", name);
	            person.put("nationality", n);
	            
	            
	            people.add(person);
	            
	            if( !foundNationality(nationalities, n) ) {
	                nationalities.put( n, 1 );
	            }
	            else {
	                nationalities.put( n, nationalities.get(n)+1 );
	            }
	        }
	        
	        print(nationalities);
	        sep();
	        print2(nationalities, people);
	     
	    }
	    
	    static boolean foundNationality(HashMap<String, Integer> list, String nt) {
	        return ( list.get(nt) != null ) ? true : false; 
	    }
	    
	    static void print(HashMap<String, Integer> nts) {
	        
	        int most = 0;
	        String mostN = "";
	        
	        for (String k : nts.keySet()) {
	            if( nts.get(k) > most ) {
	                most = nts.get(k);
	                mostN = k;
	            }
	        }
	        
	         System.out.printf("The nation with most people is: %s (%d) \n", mostN, most);
	      
	    }
	    
	   static void print2(HashMap<String, Integer> nts, ArrayList<HashMap<String, String>> people) {
	        
	        for (String k : nts.keySet()) {
	            System.out.println(k + ": ");
	            System.out.print("\t");
	            for(int i = 0; i < people.size(); i++) {
	                if( people.get(i).get("nationality").equals(k) )
	                System.out.print( 
	                    people.get(i).get("name") 
	                    + ( (i < people.size()-1) ? ", " : "" )  
	                );
	            }
	            System.out.println();
	        }
	        
	    }
	    
	    static void sep() {
	        System.out.println("-------------------------------------");
	    }
	}
