package Exam;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Es1 {
		final static int def = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<ProduzioneCinematografica> film1 = new ArrayList<ProduzioneCinematografica>();
		
		
		int k = 0;
		
		while( k == def) {
		System.out.println("Inserisci un film o cartone");
		String risposta = in.nextLine();
		
		
		switch (risposta) {
		case "film" :
			System.out.println("dammi id del film");
			String i = in.nextLine();
			System.out.println("dammi titolo del film");
			String title = in.nextLine();
			System.out.println("dammi genere del film");
			String type = in.nextLine();
			System.out.println("dammi autore del film");
			String autor = in.nextLine();
			Film movie = new Film(i,title,type,autor);
			film1.add(movie);
			
			break;
		case "cartone":
			boolean manga = false;
			System.out.println("dammi id del cartone");
			String ic = in.nextLine();
			System.out.println("dammi titolo del cartone");
			String titlec = in.nextLine();
			System.out.println("dammi genere del cartone");
			String typec = in.nextLine();
			System.out.println("dammi autore del cartone");
			String autorc = in.nextLine();
			System.out.println("Proviene da un manga? [y/n]");
			String an = in.nextLine();
			if(an.equals("y")) {
			  manga = true;
			Cartoni anime = new Cartoni(ic,titlec,typec,autorc,an);
			film1.add(anime);
			}
			break;
		default:
			System.out.println("La scelta selezionata non è valida");
	
		}
		System.out.println("Vuoi continuare ad inserire? [y/n]");
		String chose = in.nextLine();    
        
        if(chose.equalsIgnoreCase("n")){           
        
        k=1;
        }
		}
		uscita(film1);
		in.close();
	}
	public static void uscita(ArrayList<ProduzioneCinematografica> film1) {
		for(int j = 0; 0 < film1.size(); j++) {
			ProduzioneCinematografica z = film1.get(j);
			System.out.println(z.printInfo());
		}
	}

}
abstract class ProduzioneCinematografica {
	String id;
	String titolo;
	String genere;
	String autore;
	
	ProduzioneCinematografica(String i,String t,String g,String a) {
		id = i;
		titolo = t;
		genere = g;
		autore = a;
			
	}
	
	String printInfo(){
		return String.format("Id: %s | Titolo: %s | Genere: %s | Autore: %s ", id, titolo,genere,autore);
	}

}
class Film extends ProduzioneCinematografica {
	
	Film(String i,String t,String g,String a) {
		super(i,t,g,a);
	}
	
	String printInfo(){
		return String.format("Id: %s | Titolo: %s | Genere: %s | Autore: %s ", id, titolo,genere,autore);
	}
	
}
class Cartoni extends ProduzioneCinematografica {
	String manga ;
	Cartoni(String i,String t,String g,String a,String m) {
		super(i,t,g,a);
		manga = m;
	}
	
	String printInfo(){
		return String.format("Id: %s | Titolo: %s | Genere: %s | Autore: %s Is a manga [y/n] : %s", id, titolo,genere,autore,manga);
	}
	
}