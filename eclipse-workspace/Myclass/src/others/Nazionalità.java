package others;
import java.util.ArrayList;


import java.util.Scanner;
import java.util.HashMap;

public class Nazionalità {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Quante persone vuoi?");
		int number = Integer.parseInt(in.nextLine());
		
		Student [] people = new Student [number];
		for( int i = 0; i < number; i++) {
			int k = i+1;
		System.out.println("Dammi nome persona "+k);
		String name = in.nextLine();
		System.out.println("Dammi cognome persona "+k);
		String surname = in.nextLine();
		System.out.println("Dammi nazionalità "+k);
		String nation = in.nextLine();	
		
		
		
		}
	}

}
class Student {
	String nome;
	String cognome;
	
	Student(String n, String c) {
	nome = n;
	cognome = c;
	}
	
}