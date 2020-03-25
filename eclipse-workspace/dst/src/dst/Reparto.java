package dst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class Reparto{

	private ArrayList<HashMap<String, String>> lavoratori;			// arraylist di hashmap che riceve i valori della fieldset
	
	private static String defaultParamValue = "default";     // Stringa richiamata in caso di valori nulli
	
	public Reparto(ArrayList<HashMap<String, String>> lavoratori) {    // costruttore dell'arraylist
		this.lavoratori =lavoratori;
	}
	
	public static HashMap<String, String> createReparto(String p1,String p2,String p3, String p4,String p5,String p6,String p7,String p8) {
		Labour work = new Labour(p1,p2,p3,p4,p5,p7,p6,p8);   // instanzio classe

		String nome = work.getNome();
		String cognome = work.getCognome();
		String eta = work.getEta();
		String sesso =  work.getGender();
		String nazione = work.getNazione();
		String assenze = work.getAssenze();
		String presenze = work.getPresenze();
		String attivita = work.getAttivita();
		
		

		
		return new HashMap<String, String>() {{
			put("nome", nome);
			put("cognome", cognome);
			put("eta", eta);
			put("sesso", sesso);
			put("nazione",nazione);
			put("assenze",assenze);
			put("presenze", presenze);
			put("attivita",attivita);
			
			
		}};
	}
	
	
	
	
	
	public ArrayList<HashMap<String, String>> getLavoratori() { return this.lavoratori;	//ritorno arraylist
	}
	public HashMap<String, String> getLavoro(int n) { return this.lavoratori.get(n); }			// ritorno hashmap
	
	public static String verifica(String param) {												// metodo che si attiva nel caso valori null
		return (param == null) ? defaultParamValue : param;
	}
	public static String controllo(String [] parametro) {										// metodo che ritorna una stringa da un array di stringhe
		String para = "";
		for(int i = 0; i < parametro.length; i++) {
			para += (parametro[i] + ((i != (parametro.length-1))? ", " : ""));
			
		}
		return para;
	}
	public static String ritorno(String r) {
		return (r == null) ? "20" : r;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}





}
class Labour {
	
	protected String nome;			// valori protected che possono essere visti solo dalla classe
	protected String cognome;
	protected String eta;
	protected String sesso;
	protected String nazione;
	protected String assenze;
	protected String presenze;
	protected String attivita;
	
	public Labour(String nome, String cognome, String eta,String sesso, String nazione, String assenze,
			String presenze,String attivita) {			// costruttore classe
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
		this.nazione = nazione;
		this.assenze = assenze;
		this.presenze = presenze;
		this.attivita = attivita;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public String getGender() {
		return sesso;
	}
	public void setGender(String sesso) {
		this.sesso = sesso;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getAssenze() {
		return assenze;
	}
	public void setAssenze(String assenze) {
		this.assenze = assenze;
	}
	public String getPresenze() {
		return presenze;
	}
	public void setPresenze(String presenze) {
		this.presenze = presenze;
	}
	public String getAttivita() {
		return attivita;
	}
	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}
}

