package Test;
import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Creiamo la tua macchina");
		System.out.println("Quante porte deve avere la tua macchina ?");
		int por = Integer.parseInt(in.nextLine());
		System.out.println("Quanto vuoi spendere ?");
		double cos = Integer.parseInt(in.nextLine());
		System.out.println("Quale colore vuoi ?");
		String col = in.nextLine();
		System.out.println("Quanti cavalli vuoi per la tua macchina ?");
		double cav = Integer.parseInt(in.nextLine());
		System.out.println("Quanti cilindri vuoi per la tua macchina ?");
		double cil = Integer.parseInt(in.nextLine());
		System.out.println("Benzina o Diesel ?");
		String mot = in.nextLine();
		
		Motore motor = Motore.benzina;
		String mo = motor.toString();
		mo.equalsIgnoreCase(mot);
		
		Veicolo auto = new Veicolo(por,cos,col,cav,cil);
		auto.getinfo();
		
		 switch(mo) {
	      case "Benzina":
	        System.out.println("Hai scelto Benzina");
	        break;
	      case "Diesel":
	         System.out.println("Hai scelto Diesel");
	        break;
		 }
		 
		 in.close();
	}

}
class Veicolo {
	int porte;
	double costo;
	String colore;
	double cavalli;
	double cilindrata;
	
	Veicolo(int p,double c,String cl,double ca,double ci) {
		porte = p;
		costo = c;
		colore = cl;
		cavalli = ca;
		cilindrata = ci;
	}
	void getinfo() {
        System.out.printf( 
            "La macchina che hai creato ha %d porte, costa %.2f euro, è di colore %s, ha %.2f cavalli , ha cilindrata di %.2f \n",
            porte,costo,colore,cavalli,cilindrata);
            
}
}
enum Motore {
	
	benzina,
	diesel;
}
