package Zeta;

import java.util.ArrayList;
import java.util.Collections;
public class My {
	
	   public static void main(String args[]) {
		      
		      ArrayList<Person> people = new ArrayList<Person>() {{
		          add( new Person("luca", "bambola", 25) );
		          add( new Person("ugo", "amabile", 50) );
		          add( new Person("anna", "ciderma", 14) );
		      }};
		      
		      System.out.println( people );
		      
		      Collections.sort( people );
		      
		      System.out.println( "Sorted:" );
		      System.out.println( people );
		      
		    }
		}

		class Person implements Comparable<Person> {
		    String name;
		    String lastname;
		    int age;
		    
		    Person(String n, String ln, int a) {
		        this.name = n;
		        this.lastname = ln;
		        this.age = a;
		    }
		    
		    public String toString() {
		        return String.format("[%s %s %d]", lastname, name, age);
		    }
		    
		    @Override
		    public int compareTo(Person p1){
		        /*
		        if( this.age < p1.age ) return -1;
		        else if( this.age > p1.age ) return 1;
		        else return 0;
		        */
		        
		        int myLastname = (int)this.lastname.charAt(0);
		        int p1Lastname = (int)p1.lastname.charAt(0);
		        
		        if( myLastname < p1Lastname ) return -1;
		        else if( myLastname > p1Lastname ) return 1;
		        else return 0;
		        
		        
		    }
		}