package Test;
import java.util.Scanner;
import java.util.HashMap;

public class Mappa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quante case vuoi vedere?");
		int numero = Integer.parseInt(in.nextLine());
		
		//Casa[]  jia = new Casa[numero];
		
		for(int j = 0; j<numero;j++) {
		int k = j+1;
		System.out.println("Che  zona vuoi per tua casa "+ k +"?");
		String nom =in.nextLine();
		System.out.println("Che prezzo vuoi "+ k +"?");
		double pre = Double.parseDouble(in.nextLine());
		System.out.println("In che citt� vuoi trova " + k +"?");
		String cit =in.nextLine();
		String prez = pre +"";
		
		Casa cas = new Casa(nom,pre,cit);
		
        HashMap<String,String> house = new HashMap<String,String>();
        house.put("Zona ", nom);
        house.put("Prezzo in euro ", prez);
        house.put("Citt� ", cit);
        
        System.out.println("la casa "+k+" che hai scelto � : " + house);
		}
		
		in.close();
	}

}
class Casa {
	String nome;
	double prezzo;
	String citt�;
	
	Casa(String no, double pr, String ci) {
		nome = no;
		prezzo = pr;
		citt� = ci;
		
		
	}
}

