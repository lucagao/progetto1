package Zeta;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class X {
	 
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			int n = 0;
			System.out.println("Gimme number of animals:");
			n = Integer.parseInt(in.nextLine());
			ArrayList<Animall> animals = new ArrayList<Animall>();
			for(int i = 0; i < n; i++) {
	       	 int k = i+1;
	       	 
	       	 System.out.println("INSERT THE TYPE " +k+":");
	       	 String type = in.nextLine();
	       	 try 
	       	 {
	       		if( !type.equalsIgnoreCase("Tiger") && !type.equalsIgnoreCase("Lion")) {
	    			throw new WrongGenderException("Type must be 'Lion' or 'Tiger'");
	    		} else {
	    			System.out.println("INSERT THE NAME " +k+":");
	           	 	String name = in.nextLine();
	    		
	    			if(type.equalsIgnoreCase("Lion")) {
	    				animals.add(new Lionn(type,name));
	    			}
	    			else if(type.equalsIgnoreCase("Tiger")){
	    				animals.add(new Tiger(type,name));
	    			}
	    		}
	       		
	       	 }
	       	 catch(WrongGenderException e) {
	       		System.out.println( e );
	       	 }
				
				
			}
			
			System.out.println(animals);
			in.close();

		}

	}


	class Animall{
		public String type;
		public String name;
		
		Animall(String t, String n){
			type = t;
			name = n;
		}
		
		public String toString() {
			return "[ " + type + " " + name + " ]";
		}
		
	}

	class Lionn extends Animall{
		
		Lionn(String t,String n){
			super(t,n);
		}
		
		public String toString() {
			return "[ " + type + "," + name + " ]";
		}
	}

	class Tiger extends Animall{
		
		Tiger(String t,String n){
			super(t,n);
		}
	}

	class WrongGenderException extends Exception{
		String msg;
		
		WrongGenderException(String ms){
			msg = ms;
		}
		
		public String toString() {
			return ("Wrong gender! Why? Beacause " + msg);
		}
		
	}