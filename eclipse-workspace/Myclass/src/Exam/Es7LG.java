package Exam;
import java.util.*;
import java.util.regex.*;
import java.time.Instant;
import java.time.Duration;


public class Es7LG {
	static Scanner in;

	public static void main(String[] args) {
		Cell phone = new Cell(0,0);
		//in = new Scanner(System.in);
		phone.caso();
		

	}
}

class Cell {
	static Scanner in;
	int k = 0;
	static int def = 0;
	double credito;
	int nChiamate;
	ArrayList<String> numeri = new ArrayList<String>();
	
	Cell(double creditoiniziale, int chiamateiniziali) {
		credito = creditoiniziale;
		nChiamate = chiamateiniziali;
	}
	public void rica(double ricarica) {
		credito += ricarica;
	}
	public void chiamate(double durata) {
		credito -= 0.00020*durata;
		nChiamate = nChiamate +1;
	}
	public double saldo() {
		return credito;	
	}
	public int getNumeroChiamate() {
		return nChiamate;
	}
	public void azzeraChiamate() {
		nChiamate = 0;
	}
	public void printInfo() {
		
		System.out.println("Buongiono, benvenuti in Smartphone");
        System.out.println();
        System.out.println("1) fai una ricarica");
        System.out.println("2) fai una chiamata");
        System.out.println("3) controlla saldo");
        System.out.println("4) controlla chiamate");
        System.out.println("5) azzera chiamate");
        System.out.println("6) registro chiamate");
        System.out.println("7) esci");
        System.out.println();
        System.out.print("Inserisci una scelta [1-7]: ");
		
	}
	public void caso() {
		in = new Scanner(System.in);
		int x = 0;
		while(k==def) {
		    printInfo();
		  try {
		    x = Integer.parseInt(in.nextLine());
     		switch(x) {
			case 1 :
				System.out.println("Quanto vuoi ricaricare?");
				double ricar = Double.parseDouble(in.nextLine());
				if(ricar <= 0) {
					System.out.println("ricarica non valida");
				} else {
					rica(ricar);
					System.out.println("Hai appena ricaricato: "+ ricar);
				} 
				break;
			case 2 :
				if (credito <= 0) {
					System.out.println("Non hai credito");
					//k = 1;
				} else {
				System.out.println("Inserisci il numero che vuoi chiamare");
				String numero = in.nextLine();
				if(Pattern.matches("[0-9]{7}",numero)==true) {
					System.out.println( "Hai chiamato il numero: "+numero);			
					Instant start = Instant.now();
					System.out.println("Chiamata partita per terminare premere 1");
					while(Double.parseDouble(in.nextLine()) != 1);
					Instant end = Instant.now();
					double dura = Duration.between(start, end).toMillis();
					//double durata = Double.parseDouble(in.nextLine());
				 if ( dura > 0) {
					chiamate(dura);
					numeri.add(numero);
					double c = dura*0.00020;
					System.out.printf("il tuo credito verrà scalato di euro: %.2f \n",c);
				}else {
					 System.out.println("Il minutaggio inserito non è valido");
				}
				} else {
					System.out.println("Numero selezionato non valido");
					//k = 1;
				}
				}
				break;
			case 3 :
				saldo();
				System.out.printf("Il tuo saldo è: %.2f \n", credito);
				break;
			case 4 :
				getNumeroChiamate();
				System.out.println("Chiamate fatte: "+ nChiamate);
				break;
			case 5 :
				azzeraChiamate();
				System.out.println("Azzeramento avvenuto con successo");
				break;
			case 6 :
				System.out.printf("numeri chiamati: %s \n", numeri);
				break;
			case 7 :
				System.out.println("Grazie e Arrivederci");
				k = 1;
				break;
			default :
				System.out.println("Scelta non valida, riprova");
		}
		    	
	    } catch(NumberFormatException e) {
            System.out.println( "Non puoi usare caratteri" );
		}
	 }   
   }
}
