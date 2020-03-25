package esercizio;
import java.util.Scanner;

public class Matrice {
	static Scanner in;
	private String  x ="x";
	private String  o = "o";
	private String tratto = "-";
	String [][] array ;
	
	Matrice( String ix, String io) {
		ix  = x;
		io  = o;
	}


	public String getX() {
		return x;
	}



	public void setX(String x) {
		this.x = x;
	}



	public String getO() {
		return o;
	}



	public void setO(String o) {
		this.o = o;
	}
	
	public String getTratto() {
		return tratto;
	}


	public void setTratto(String tratto) {
		this.tratto = tratto;
	}
	
	public void formula() {
		in = new Scanner(System.in);
		System.out.println("Quante colonne e righe vuoi");
		int numero = Integer.parseInt(in.nextLine());
		array = new String[numero][numero];
	}
	
	public void aumentoArray() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j< array[i].length; j++) {
			if(i == 0 && j == 0) {
				System.out.print(x);
			}else {
				System.out.println(o);
			}
			}
			System.out.println();
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrice matrix = new Matrice("x","o");
		matrix.formula();
		matrix.aumentoArray();
		
		
		
	}


}
