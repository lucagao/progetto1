package Person;
import java.util.ArrayList;
import java.util.Scanner;

public class Bestie {
	
	public static final int max = 3;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Persona[] people = new Persona[max];
		
		for(int j = 0; j < max; j++) {
			System.out.println("Dammi nome persona: ");
			String name = in.nextLine();
			System.out.println("Dammi cognome persona: ");
			String lastName = in.nextLine();
			System.out.println("Quanti animali ha?");
			int count = Integer.parseInt(in.nextLine());
		
			ArrayList<Animal> animals = new ArrayList<Animal>(count);
			for(int i = 0; i < count; i++) {
				System.out.println("|cane| o |gatto|?");
				String typeAn = in.nextLine();
				if(typeAn.equalsIgnoreCase("cane")) {
					System.out.println("Come si chiama?");
					String nameAn = in.nextLine();
					animals.add(new Dog(nameAn, "dog"));
				}
				else if (typeAn.equalsIgnoreCase("gatto")) {
					System.out.println("Come si chiama?");
					String nameAn = in.nextLine();
					animals.add(new Cat(nameAn, "cat"));
				}
			}
			
			people[j] = new Persona(name, lastName, count, animals);
		}
			
		in.close();
		
		getHigher(people);
	}
	
	static void getHigher(Person[] people) {
		int higher = people[0].animals.size();
		Person p = people[0];
		
		for(int i = 1; i < people.length; i++) {
			int subsize = people[i].animals.size();
			if( subsize > higher ) {
				higher = subsize;
				p = people[i];
			}
		}
		
		System.out.println("The person with more animals ("+higher+") is " + p.nameP);
	}
}

class Persona {
	String nameP;
	String lastName;
	int count;
	ArrayList<Animal> animals;
	
	Persona() {}
	
	Persona (String n, String ln, int c, ArrayList<Animal> a) {
		nameP = n;
		lastName = ln;
		count = c;
		animals = a;
	}
	
	public String toString() {
		return nameP + " " + lastName;
	}
}

class Animal {
	String type;
	String nameA;
}
class Dog extends Animal {
	
	
	Dog(String n, String t){
		nameA = n;
		type = t;
	}
}
class Cat extends Animal {
	
	Cat(String n, String t){
		nameA = n;
		type = t;
	}
}