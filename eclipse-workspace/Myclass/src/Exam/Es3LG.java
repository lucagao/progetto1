package Exam;
import java.util.*;
public class Es3LG {
static Scanner in;
final static int def = 0;
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		printInfo();
		int dim = Integer.parseInt(in.nextLine());
		int[][] vettore = new int[dim][dim];
		inserisciMatrice(vettore);
		leggeMatrice(vettore);
		somma(vettore);
		diagonaleSx(vettore);
		diagonaleDx(vettore);
		selezionaDiagonale(vettore);
		
		in.close();
	}
	public static void printInfo() {
		System.out.println("Dammi la lunghezza della matrice");
		
	}
	
	public static void inserisciMatrice(int[][] a) {
		in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Dammi la gamma dei numeri");
		int max = Integer.parseInt(in.nextLine());
		
		for(int i=0; i < a.length; i++)
			for(int j=0; j < a[i].length; j++)
				a[i][j] = random.nextInt(max);
	}
	public static void leggeMatrice(int[][] a) {
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++)
				System.out.print("| " + a[i][j] + " ");
			System.out.println("|");
		}
		System.out.println();
	}
	
	public static void somma(int[][] a) {
		int sum = 0;
		
		for(int i=0; i < a.length; i++)
			for(int j=0; j < a[i].length; j++)
				sum += a[i][j];
		System.out.println("La somma dei valori è: " + sum);
	}

	public static void diagonaleSx(int[][] a) {
		int sumSx = 0;
		
		for(int i=0; i < a.length; i++)
			sumSx += a[i][i];
		System.out.println("La somma dei valori della diagonale destra: " + sumSx);
	}
	public static void diagonaleDx(int[][] v) {
		int sumDx = 0;
		int j = 0;
		for(int i = v.length-1; i > -1; i--) {
				sumDx += v[j][i];
				j++;
		}
		System.out.println("la somma dei valori della diagonale sinistra: " + sumDx);
	}
	public static void selezionaDiagonale(int[][] a) {
		in = new Scanner(System.in);
		int d = 0;
		
		try {
		int k = 0;
		while (k == def) {
		System.out.println("Quale somma della diagonale vuoi?");
		int n = Integer.parseInt(in.nextLine());
		
		int i = 0;
		for(int j = (n-1); i < a.length; j++) {
			if(j == a.length)
				j=0;
			d += a[i][j];
			i++;
		}
		System.out.println("Le somme dei valori della diagonale scelta è: " + d);
		System.out.println("Vuoi continuare a scegliere ? [si/no]");
		String r = in.nextLine();
		if(r.contentEquals("si")) {
		k=0;
		} else if (r.contentEquals("no")) {
			k=1;
		}	else {
			System.out.println("La risposta non è valida");
		}
		}
		}  catch (Exception e) {
			System.out.println("La diagonale scelta non esiste");
		}
	}
}
