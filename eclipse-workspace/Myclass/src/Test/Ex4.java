package Test;
import Zeta.*;

public class Ex4 extends Exam4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
				Ex4 oggetto = new Ex4();
				System.out.println(oggetto.aggiunggiNumeri(11, 22));
				System.out.println(oggetto.sottraiNumeri(42, 22));
				oggetto.printInfo();
			   }

	}

		/* Risposta Teoria 1
		   In programmazione, è detta overloading la creazione di una seria di funzioni che hanno tutte lo stesso nome,
		   ma che accettino un diversa serie di argomenti,
		   e che eventualmente restituiscano un diverso valore di ritorno.
		   Per Overriding si intende la sovrascrizione da parte della classe figlio di un metodo ereditato dalla classe madre.
		   Esempio Overloading Costruttori in cui sovrascrive i valori iniziali:  class Socio {

  			 String nome;
  		     String partitaIva;
  			 int telefono;
  			 int fax;
    
  			public Socio (String n, String p, int t, int f) {
    				nome=n;
    				partitaIva=p;
    				telefono=t;
    				fax=f;
  				} 
				}
			Risposta Teoria 2
			Per polimorfismo si intende la capacità di assumere più forme, infatti
			Java ha questa caratteristica in quanto la sua struttura può assumere più forme.
			Per esempio se una classe madre e fglio hanno metodo che si chiama allo stesso modo ma
			con funzioni diversi, java permette di richiamare la funzione scelta.
			Risposta Teoria 3
			Nella visibilità default le proprietà e metodi di una classe sono accessibili
			alle altre classi presenti nello stesso package mentre nella visibilità 
			private le propietà e metodi non sono accessibili ad altre classi.
		 */

