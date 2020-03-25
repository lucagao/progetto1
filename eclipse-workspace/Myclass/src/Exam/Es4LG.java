package Exam;
import java.util.Scanner;
import java.util.Arrays;
public class Es4LG {
static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       in = new Scanner(System.in);
      
      System.out.println("i valori di v1 sono :");
      int [] v1= {6,3,1,2,9};
      for(int a : v1) {
      System.out.print("|"+a+"|");     
      }
      System.out.println();
      sum(v1);
      average(v1);
      evenAve(v1);
      evenOdd(v1);
      max(v1);
      min(v1);
      secondMin(v1);
      System.out.println("Dammi la lunghezza del vettore dei valori che vuoi inserire");
      int r = Integer.parseInt(in.nextLine());
      int [] v2 = new int[r];
      insertValue(v2);
      sum(v2);
      average(v2);
      evenAve(v2);
      evenOdd(v2);
      max(v2);
      min(v2);
      secondMin(v2);
      
      in.close();
	}
	public static void insertValue(int [] v) {
		in = new Scanner(System.in);
		System.out.println("Inserisci i valori");
		for(int i = 0; i < v.length; i++) {
			v[i] = in.nextInt();	
		}
		//System.out.print("I valori scelti sono : "+ v[i]);
	}
	public static void sum(int [] v) {
		int sum = 0;
		for(int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		System.out.println("la somma è : "+ sum);
	}
	public static void  average(int [] v) {
		int som = 0;
		float average = 0;
		for(int i = 0; i < v.length; i++) {
			som += v[i];
		}
		 average =  (float) som/v.length;
		 System.out.println("la media è : "+average);
	}
	public static void evenAve(int [] v) {
		int even = 0;
		int counter = 0;
		float average = 0;
		for(int i = 0; i< v.length; i++ ) {
			if(v[i]% 2 == 0) {
				even += v[i];
				counter++;
			}
		}
		average = even/counter;
		System.out.println("la media dei valori pari è : " + average);
	}
	public static void evenOdd(int [] v) {
		int odd = 0;
		int counter = 0;
		float average = 0;
		for(int i = 0; i< v.length; i++ ) {
			if(v[i]% 2 != 0) {
				odd += v[i];
				counter++;
			}
		}
		average = odd/counter;
		System.out.println("la media dei valori dispari è : " + average);
	}
	public static void max(int [] v) {
		int max = v[0];
		for(int i = 0; i< v.length; i++ ) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		System.out.println("il valore massimo è : "+ max);
	}
	public static void min(int [] v) {
		int min =v[0];
		for(int i = 0; i< v.length; i++ ) {
			if(v[i] < min) {
				min = v[i];
			}
		}
		System.out.println("il valore minimo è : "+ min);
	}
	public static void secondMin(int [] v) {
	    Arrays.sort(v);
	    int a = v.length < 2 ? Integer.MAX_VALUE : v[1];
	    System.out.println("il secondo valore minimo è : "+a);
	}
		
	}
