package esercizio;
import java.util.Scanner;
public class Esercizi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dammi il nome che vuoi inserire?");
		String name = in.nextLine();
		System.out.println("Dammi il numero di trattini");
		int number = Integer.parseInt(in.nextLine());
		
		Formula f = new Formula(name,number);

		f.defTratto(name,number);
		System.out.println();
		f.defNome(name,number);
		f.defTratto(name,number);
		
		
		in.close();
	}
	

}
class Formula {
	
	private String nome;
	private int numero;
	private String tratto ="-";
	private String linea = "|";
	private String spazio = " ";
	
	 Formula(String no, int nu) {
		
		 nome = no;
		 numero = nu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTratto() {
		return tratto;
	}

	public void setTratto(String tratto) {
		this.tratto = tratto;
	}
	
	public void defTratto(String a, int t) {
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < t ; j++) {
				System.out.print(tratto);
			}
				System.out.print(linea);
		}
	}
	public void defNome(String a, int t) {
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j< t; j++) {
				System.out.print(a.charAt(i));
			}
		}
				System.out.print(linea);
	}


	 
}
