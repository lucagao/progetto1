package dst;

import java.util.ArrayList;
import java.util.HashMap;


public class Dipendenti {

	private ArrayList<HashMap<String, String>> lavoratori;
	
	private static String defaultParamValue = "default";
	
	public Dipendenti(ArrayList<HashMap<String, String>> lavoratori) {
		this.lavoratori =lavoratori;
	}
	
	public static HashMap<String, String> createLavoratori(String p1, String p2,String p3, String p4,String p5,String p6,String p7, String p8) {
		Lavoro work = new DefaultLavoro();
		
				switch(p8.toLowerCase()) {
				case "subordinato":
					work = new Subordinato(p1,p2,p3,p4,p5,p6,p7);
					break;
				case "autonomo":
					work = new Autonomo(p1,p2,p3,p4,p5,p6,p7);
					break;
				case "collaboratore":
					work = new Collaboratore(p1,p2,p3,p4,p5,p6,p7);
					break;
				case "stagista":
					work = new Stagista(p1,p2,p3,p4,p5,p6,p7);
				default:
					work = new DefaultLavoro();
					break;
			}

		String nome = work.getNome();
		String cognome = work.getCognome();
		String eta = work.getEtà();
		String sesso = work.getGender();
		String nazione = work.getNazione();
		String assenze = work.getAssenze();
		String presenze = work.getPresenze();
		String attivita = work.getAttività();
		
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
	
	
	
	
	
	public ArrayList<HashMap<String, String>> getLavoratori() { return this.lavoratori; }
	public HashMap<String, String> getLavoro(int n) { return this.lavoratori.get(n); }
	
	public static String verifica(String param) {
		return (param == null || param.equals("")) ? defaultParamValue : param;
	}
	public static String controllo(String c ) {
		 if(c.equalsIgnoreCase("maschio")) {
			c="maschio";
	} else {
		 	 c="femmina";
	}
		 return c;
	}
	public static String controllare(String [] parametro) {
		String para = "";
		for(int i = 0; i < parametro.length; i++) {
			para += (parametro[i] + ((i != (parametro.length-1))? ", " : ""));
			
		}
		return para;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}





}
class Lavoro {
	
	protected String nome;
	protected String cognome;
	protected String eta;
	protected String sesso;
	protected String nazione;
	protected String assenze;
	protected String presenze;
	protected String attivita;
	
	public Lavoro(String nome, String cognome, String eta,String sesso, String nazione, String assenze,
			String presenze) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
		this.nazione = nazione;
		this.assenze = assenze;
		this.presenze = presenze;
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
	public String getEtà() {
		return eta;
	}
	public void setEtà(String eta) {
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
	public String getAttività() {
		return attivita;
	}
	public void setAttività(String attività) {
		this.attivita = attività;
	}

	
	
}
class DefaultLavoro extends Lavoro {
	DefaultLavoro() {
		super("sconosciuto","sconosciuto","sconosciuto","sconosciuto","sconosciuto","sconosciuto","sconosciuto");
	}
}
class Subordinato extends Lavoro {
	Subordinato(String nome, String cognome, String eta,String sesso, String nazione, String assenze,
			String presenze) {
			super(nome,cognome,eta,sesso,nazione,assenze,presenze);
			attivita = "subordinato";
	}
}
class Autonomo extends Lavoro {
	Autonomo(String nome, String cognome, String eta,String sesso,  String nazione, String assenze,
			String presenze) {
			super(nome,cognome,eta,sesso,nazione,assenze,presenze);
			attivita = "autonomo";
	}
}
class Collaboratore extends Lavoro {
	Collaboratore(String nome, String cognome, String eta,String sesso, String nazione, String assenze,
			String presenze) {
			super(nome,cognome,eta,sesso,nazione,assenze,presenze);
			attivita = "collaboratore";
	}
}
class Stagista extends Lavoro {
	Stagista(String nome, String cognome, String eta,String sesso, String nazione, String assenze,
			String presenze) {
			super(nome,cognome,eta,sesso,nazione,assenze,presenze);
			attivita = "stagista";
	}
}