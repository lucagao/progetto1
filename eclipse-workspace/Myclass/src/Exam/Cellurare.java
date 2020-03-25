package Exam;
import java.util.Scanner;

public class Cellurare {

	private double credito;
	private int numeroChiamate;
	/**Creo un oggetto della classe Cellulare.
	 creditoIniziale Credito iniziale.
	nChiamateIniziali Numero di chiamate iniziali.
	 * @return */
	public void Cellulare(double creditoIniziale, int nChiamateIniziali)
	{
	credito = creditoIniziale;
	numeroChiamate = nChiamateIniziali;
	}
	/**Ricarica il cellulare.
	 unaRicarica Importo della ricarica.*/
	public void ricarica(double unaRicarica)
	{
	credito = credito + unaRicarica;
	}
	/**Effettua una chimata, aggiorna il credito, incrementa di una unità il
	numeroChiamate.
	 minutiDurata Durata della chiamata.*/
	public void chiamata(double minutiDurata)
	{
	credito = credito - (0.20*minutiDurata);
	numeroChiamate = numeroChiamate + 1;
	}
	/**Restituisce il valore del credito.
	 Credito.*/
	public double numero404()
	{
	return credito;
	}
	
	/**Restituisce il numero di chiamate.
	 Numero di chiamate.*/
	public int getNumeroChiamate()
	{
	return numeroChiamate;
	}
	/**Azzera il numero di chiamate.*/
	public void azzeraChiamate()
	{
	numeroChiamate = 0;
	}



	public static void main(String[] args)
	{
	/**Creo un oggetto della classe Cellulare,
	con 20€ di credito e 0 chiamate effettuate.*/
	Cellulare nokia = new Cellulare(20.0,0);
	/**Ricarico il cellure di 50€.*/
	nokia.ricarica(50.0);
	/**Effettuo una chiamata di 13 minuti.*/
	nokia.chiamata(13.0);
	/**Stampo il credito.*/
	System.out.println(nokia.numero404());
	/**Stampo l'aspettativa di credito.*/
	System.out.println("Credito, mi aspetto: 67.4");
	/**Stampo il numero di chiamate effettuate.*/
	System.out.println(nokia.getNumeroChiamate());
	/**Stampo l'aspettativa del numero di chiamate effettuate.*/
	System.out.println("Numero Chiamate, mi aspetto: 1");
	/**Azzero il numero di chiamate effettuate.*/
	nokia.azzeraChiamate();
	/**Stampo il numero di chiamate effettuate.*/
	System.out.println(nokia.getNumeroChiamate());
	/**Stampo l'aspettativa del numero di chiamate effettuate.*/
	System.out.println("Numero Chiamate, mi aspetto: 0");
	}
	}
