package others;

import java.util.*;

import Person.*;
import animals.Animal;

public class Gruppo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = 0;
		
		System.out.println("how many people?");
		n = Integer.parseInt(in.nextLine());
		
		Person [] people = new Person[n];
		
		for(int i = 0; i < n; i++ ) {
		int k = i+1;	
		System.out.println("Inserisci il nome della person "+ k);
		String name = in.nextLine();
		Person current = new Person(name);
		people[i] = current;
		}
		
		
		int quantity =0;
		for(int j = 0; j <= people.length; j++) {
		System.out.println("Quanti animali ha " + people[j].getName() +"?");
		quantity = Integer.parseInt(in.nextLine());
		}
		
		
		Animal[] animals = new Animal[quantity];
		for(int y = 0; y < quantity; y++ ) {
			int k = y+1;	
			System.out.println("Inserisci il tipo dell'animalo "+ k +"della persona" + people[y].getName());
			String typeAnimal = in.nextLine();
			
			System.out.println("Inserisci il tipo dell'animalo "+ k +"della persona" + people[y].getName());
			String nameAnimal = in.nextLine();
	
			Animal currentAnimal = new Animal(typeAnimal, nameAnimal);
			animals[y] = currentAnimal;
			
		}
		
			
		in.close();
		

	}

}
