package Exam;


	//Provate ad eseguire il seguente codice per usare nextInt al posto di parseInt:

import java.util.Scanner;




		public class Prova {

		public static void main(String args[]) {

		int x;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter any number: ");

		try{

		x = input.nextInt();

		System.out.println("Num is = " + x);
		System.out.println("Enter any word: ");
		String a = input.nextLine();
		System.out.println(a);
		
		}

		catch (Exception e) {

		System.out.println("Error!");


		}

		}

		}	
