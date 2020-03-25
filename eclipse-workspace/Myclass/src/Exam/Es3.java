package Exam;
import java.io.*;
import java.util.Scanner;
public class Es3 {
final static int def = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 0;
		while(k == def) {
		Scanner in = new Scanner(System.in);
		
		File dati = new File("C:\\Users\\ADMIN\\Documenti\\testo.txt");
		
		System.out.println("Vuoi inserire dati in file,"
				+ " leggere il contenuto  o uscire ? "
				+ "[inserire,leggere,uscire]");
		String rips = in.nextLine();
		switch(rips) {
		case "inserire":
			try {
				FileWriter fo = new FileWriter(dati,true);
				System.out.println("Scrivi sul file");
				fo.write(in.nextLine() + " ");
				fo.close();
				System.out.println("Sei riuscito a scrivere con successo nel file");
		    } catch (IOException e) {
		    	System.out.println("C'è un problema");
		    	e.printStackTrace();
		    }
			break;
		case "leggere":
			  try {
			      Scanner myReader = new Scanner(dati);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("C'è un problema");
			      e.printStackTrace();    
			    }
			    break;
		case "uscire":
			System.out.println("L'operazione termina qui.");
		     k=1;
		}
		}
		
	}
	/* teoria a:
	 * Le interfacce funzionali sono delle interfacce con un solo metodo astratto
	 * e possono essere implementate attraverso le funzioni lambda.
	 * l'espressione lambda sono espressioni che non hanno nome e non appartengono 
	 * alla classe composte a nella prima parte dai parametri e nella seconda parte
	 * dal corpo.
	 * teoria b:
	 * le classi innestate sono delle classi(inner) che si trovano
	 * dentro a un'altra classe(outer). Per accedere alla classe interna
	 * si deve creare un oggetto della classe esterna e poi creare un 
	 * oggetto della classe interna.
	 * teoria c:
	 * 		Object[] ogetto = {14, 18.9,true,"domani si sta a casa", 'y',};
		
		for(int i = 0; i<oggetto.length;i++) {
			if(oggetto[i] instanceof String) {
				System.out.println(((String)oggetto[i]).toUpperCase());
			}else
				System.out.println(oggetto[i]);
		}
	}
}
	 * teoria d:
	 * il Casting consiste nel trasformare un valore di un tipo in un altro tipo
	 * Con il casting di oggetti permette a una sottoclasse di accedere alle proprietà
	 * della superclasse, esmpeio :
	 * class Animale {
	 * }
	 * class Falco extends Animale{
	 * }
	 * 
	 * Animale x = new Falco();
	 * ci permetterà di accedere anche alle propietà  e metodi 
	 * della superclasse Animale
	*/

}
 