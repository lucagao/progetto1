package others;
import java.util.Scanner;

public class Ex5LG {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti docenti vuoi inserire?");
		int numero = Integer.parseInt(in.nextLine());
		Docente[] doc = new Docente[numero];
		int id = 0;
		for (int i = 0; i < doc.length; i++) {
			try {
			System.out.println("Inserisci il nome");
			String nome = in.nextLine();
			System.out.println("Inserisci il cognome");
			String cognome = in.nextLine();
			System.out.println("Inserisci età");
			int età = Integer.parseInt(in.nextLine());
			System.out.println("Inserisci il codice");
			String codice = in.nextLine();
			id++;
			doc[i] = new Docente(nome, cognome, id, età);
			System.out.printf("Name:%s Cognome:%s Età:%d Codice:%s \n",nome,cognome,età,codice);
			} catch (Exception e) {
				System.out.println("Hai sbagliato qualcosa");
			}
		}
		Universita uni = new Universita(doc);
		System.out.println("L'età minima è: " + uni.etaMinima());
		
		in.close();
	}
	
}
class Docente{
	private String nome;
	private String cognome;
	private int codice;
	private int eta;
	
	Docente(){
		
	}
	
	public Docente(String n, String c, int codi, int e){
		nome=n;
		cognome=c;
		codice=codi;
		eta=e;
	}
	public Docente(Docente doce){
		nome=doce.getNome();
		cognome=doce.getCognome();
		codice=doce.getCodice();
		eta=doce.getEta();
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public int getCodice(){
		return codice;
	}
	public int getEta(){
		return eta;
	}
	
	
	
}
class Universita{
	 Docente[] docenti;
	
	public Universita(Docente[] d){
		docenti=new Docente[d.length];
		for(int i=0; i<d.length; i++)
			docenti[i] = d[i];
	}

	public int etaMinima(){
		int min = docenti[0].getEta();
		for(int i=1; i < docenti.length; i++)
			if(docenti[i].getEta() < min)
				min=docenti[i].getEta();
		return min;
		}
	}