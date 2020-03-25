package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Contatto {
	Scanner in = new Scanner(System.in);
	private String nome;
	private String cognome;
	private long numero;
	private String email;
	private String indirizzo;
	private String nascita;
	private int id;
	private boolean preferiti;
	// Commento
	public Contatto(String nome, String cognome, long numero, String email, String indirizzo, String nascita,
			boolean preferiti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.email = email;
		this.indirizzo = indirizzo;
		this.nascita = nascita;
		this.id = id;
		this.preferiti = preferiti;
	}

	public Contatto() {};

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public long getNumero() {
		return numero;
	}

	public String getEmail() {
		return email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getNascita() {
		return nascita;
	}

	public int getId() {
		return id;
	}

	public boolean isPreferiti() {
		return preferiti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setNascita(String nascita) {
		this.nascita = nascita;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPreferiti(boolean preferiti) {
		this.preferiti = preferiti;
	}


	public void ricercaPerNome(ArrayList<Contatto> array,String nameToSearch,String lastnameToSearch) {
		for(Contatto cont : array){
	        if((cont.getNome() != null && cont.getNome().contains(nameToSearch))&&(cont.getCognome() != null && cont.getCognome().contains(lastnameToSearch))) {
	        	  System.out.println(cont.getNome());
	        	  System.out.println(cont.getCognome());
	        	  System.out.println(cont.getNumero());
	        	  System.out.println(cont.getEmail());
	        	  System.out.println(cont.getIndirizzo());
	        	  System.out.println(cont.getNascita());
	        }
	    }
	}

	public Contatto addContact() {
		System.out.println("Inserisci il nome: ");
		String currentName = in.nextLine();
		System.out.println("Inserisci il cognome: ");
		String currentLastname = in.nextLine();
		System.out.println("Inserisci il numero di telefono: ");
		long currentNumber = Long.parseLong(in.nextLine());
		System.out.println("Inserisci la e-mail: ");
		String currentMail = in.nextLine();
		System.out.println("Inserisci indirizzo: ");
		String currentAddress = in.nextLine();
		System.out.println("Inserisci la data di nascita: ");
		String currentDate = in.nextLine();
		System.out.println("Fa parte dei contatti preferiti? [true/false]");
		boolean currentPref = Boolean.parseBoolean(in.nextLine());

		Contatto currentCont = new Contatto(currentName,currentLastname,currentNumber,currentMail,currentAddress,currentDate,currentPref);
		return currentCont;
	}



	public void modificaContatto(ArrayList<Contatto> array) {
		System.out.println("Seleziona il nome del contatto da modificare:");
		String nameToSearch = in.nextLine();
		System.out.println("Seleziona il cognome del contatto da modificare:");
		String lastnameToSearch = in.nextLine();
		for(Contatto cont : array){
			if((cont.getNome() != null && cont.getNome().contains(nameToSearch))&&(cont.getCognome() != null && cont.getCognome().contains(lastnameToSearch))) {
				boolean x = true;
				while(x == true) {

					System.out.println("Quale campo vuoi modificare? Inserisci un numero da [1 - 8]");
					System.out.print("1. Nome \n"
							+ "2. Cognome \n"
							+ "3. Numero \n"
							+ "4. Email \n"
							+ "5. Indirizzo \n"
							+ "6. Data di nascita \n"
							+ "7. Preferiti \n"
							+ "8. Esci \n "
					);
					int choice = Integer.parseInt(in.nextLine());
					switch(choice) {
						case 1:
				        	 System.out.println("Nuovo nome");
				        	 String newName = in.nextLine();
				        	 cont.setNome(newName);
						break;
						case 2:
				        	 System.out.println("Nuovo cognome");
				        	 String newLastName = in.nextLine();
				        	 cont.setCognome(newLastName);
						break;
						case 3:
				        	 System.out.println("Nuovo numero");
				        	 long newNumber = Long.parseLong(in.nextLine());
				        	 cont.setNumero(newNumber);
						break;
						case 4:
				        	 System.out.println("Nuova mail");
				        	 String newMail = in.nextLine();
				        	 cont.setEmail(newMail);
						break;
						case 5:
				        	 System.out.println("Nuovo indirizzo");
				        	 String newAddress = in.nextLine();
				        	 cont.setIndirizzo(newAddress);
						break;
						case 6:
							System.out.println("Nuovo data di nascita");
							String newDate = in.nextLine();
				        	cont.setNascita(newDate);
				        	System.out.println(cont.getNascita());
						break;
						case 7:
				        	 System.out.println("Nuovo preferito [true - false]");
				        	 boolean newPreferite = Boolean.parseBoolean(in.nextLine());
				        	 cont.setPreferiti(newPreferite);
						break;
						case 8:
							System.out.println("Grazie, Arrivederci!");
							x = false;
						break;
						default:
							System.out.println("La scelta non � valida");
					}
				}
	        }
	    }
	}

	   public void eliminaContatto(ArrayList<Contatto> array) {
			System.out.println("Seleziona il nome del contatto da eliminare:");
			String nameToSearch2 = in.nextLine();
			System.out.println("Seleziona il cognome del contatto da eliminare:");
			String lastnameToSearch2 = in.nextLine();
			Iterator<Contatto> itr = array.iterator();
			while(itr.hasNext()){
				Contatto cont = itr.next();
				if((cont.getNome() != null && cont.getNome().contains(nameToSearch2))&&(cont.getCognome() != null && cont.getCognome().contains(lastnameToSearch2))) {
					itr.remove();
				}
			}
			System.out.println("Contatto eliminato \n");
	   }

	   public void mostraPreferiti(ArrayList<Contatto> array) {

		   for(Contatto cont : array) {
				if(cont.isPreferiti() == true) {
					toString(cont);
				}
			}

	   }
	   
	   public void mostraRubrica(ArrayList<Contatto> array) {
		   for(Contatto cont : array) {
					  toString(cont);
			}
	   }	  
	   
	   public void toString(Contatto cont) {		   
		   System.out.printf("Nome: %s \n"
		   		+ "Cognome: %s \n"
		   		+ "Numero: %d \n"
		   		+ "Email: %s \n"
		   		+ "Indirizzo: %s \n"
		   		+ "Data di nascita: %s \n",	   		
		   		cont.getNome(), cont.getCognome(), cont.getNumero(), cont.getEmail(), cont.getIndirizzo(), cont.getNascita()
		   );
		   System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		   System.out.println();
	   }
	   
	   public void printContatti(ArrayList<Contatto> c) {
			  
		   try {
				FileWriter writer = new FileWriter(System.getProperty("user.dir") + ".txt");
				for(int j = 0; j < c.size(); j++) {
					Contatto cont = c.get(j);	
					String spattern = "%s - %s - %d - %s - %s - %s - %b \n";
						writer.write(String.format(spattern, cont.getNome(), cont.getCognome(), cont.getNumero(), cont.getEmail(), cont.getIndirizzo(), cont.getNascita(), cont.isPreferiti()));				
				}
				writer.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace(); 
			}		 
		}	
	   
	   public void populateArrayFromFile(ArrayList<Contatto> array) {
		   Scanner s;
		try {
			s = new Scanner(new FileReader(System.getProperty("user.dir") + ".txt"));
			
			   while (s.hasNextLine()) {
			       String[] split = s.nextLine().split(" - ");
			       // TODO: make sure the split has correct format
	
			       // x.charAt(0) returns the first char of the string "x"
			       array.add(new Contatto(split[0], split[1], Long.parseLong(split[2]), split[3], split[4], split[5], Boolean.parseBoolean(split[6])));
			   }			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
}
