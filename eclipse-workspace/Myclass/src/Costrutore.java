import java.util.*;

public class Costrutore {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("how many dogs do you want to create");
		
		int quantity = Integer.parseInt(in.nextLine());
		
		Cane[] dogs = new Cane[quantity];
		
			for(int i = 0; i<quantity;i++) {
				System.out.println("Dog "+(i+1)+""+"Name : ");
				String name =in.nextLine();
			    
				System.out.println("Dog "+(i+1)+""+"Breed : ");
				String breed = in.nextLine();
			}
         //dogs[i] = new Dog(name, breed);
         
         for(int i = 0; i<dogs.length; i++) {
        	 dogs[i].printInfo();
         }
	}

}

class Cane {
	
	String name;
	String breed;
	
	Cane(String n, String b) {
		name = n.toUpperCase();
		breed = b;
		System.out.println("A dog is born");
	}		
		void printInfo() {
			System.out.println(name + " "+ breed);
		}
	}
