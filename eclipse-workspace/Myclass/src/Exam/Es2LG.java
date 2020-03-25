package Exam;
import java.util.Random;
import java.util.Scanner;

public class Es2LG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInfo();
		printIn();
    }
	public static void printInfo() {
		System.out.println("Quanti numeri random vuoi ?");
		
	}
	public static void printIn () {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int n =Integer.parseInt(in.nextLine());
		int [] x = new int[n];
		for( int i = 0; i<x.length; i++) {
			x[i] = random.nextInt();

		System.out.println(x[i]);
		}
		in.close();
	}
}