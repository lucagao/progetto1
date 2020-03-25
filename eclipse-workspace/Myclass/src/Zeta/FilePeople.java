package Zeta;

import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 
import java.util.ArrayList;

public class FilePeople {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Gimme quantity:");
		int q = Integer.parseInt(in.nextLine());
		
		ArrayList<Essere> people = new ArrayList<Essere>();
		ArrayList<String> cities = new ArrayList<String>();
		
		for(int i = 0; i < q; i++) {
			System.out.printf("Gimme person %d name: \n", i+1);
			String name = in.nextLine();
			System.out.printf("Gimme person %d location: \n", i+1);
			String city = in.nextLine();
			
			Essere person = new Essere(name, city);
			
			if(!cities.contains(city)) cities.add(city);
			people.add(person);
		}
		
		in.close();
		
		String toWrite = "";
		for(int i = 0; i < people.size(); i++) {
			Essere current = people.get(i);
			toWrite += String.format("%s (%s) \n", current.name, current.city);
		}
		
		/*
		System.out.println(cities);
		System.exit(0);
		*/
		
		String toWrite2 = "";
		for(int i = 0; i < cities.size(); i++) {
			String city = cities.get(i);
			toWrite2 += "\n" + city + "\n";
			
			for(int j = 0; j < people.size(); j++) {
				Essere current = people.get(j);
				if( current.city.equals(city) ) {
					toWrite2 += current.name + ", ";
				}
			}
			toWrite2 += "\n";
			
		}
		
		try {
			FileWriter fo = new FileWriter("file-people.txt");
			fo.write(toWrite + toWrite2);
			fo.close();
			System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		
	}

}

class Essere {
	String name;
	String city;
	
	Essere(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
}

