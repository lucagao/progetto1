package db;
import java.util.*;

public class Piatto {
	final static int def = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ArrayList<Spaghetti> pasta = new ArrayList<Spaghetti>();
		ArrayList<Pizza> pizzetta = new ArrayList<Pizza>();
		ArrayList<Pesce> pesci = new ArrayList<Pesce>();
		
		
		int k = 0;
		
		while(k == def){
			
		System.out.println("Qual è il tuo piatto preferito? [spaghetti/pizza/pesce]");
		String piatto = in.nextLine();
		switch(piatto) {
		case "spaghetti":
			System.out.println("Dammi i grammi");
			String grammi = in.nextLine();
			System.out.println("Dammi il tipo di sugo?");
			String sugo = in.nextLine();
			Spaghetti food = new Spaghetti(sugo,grammi);
			pasta.add(food);
			break;
		case "pizza" :
			System.out.println("Dammi il tipo");
			String tipo = in.nextLine();
			System.out.println("Dammi la bibita");
			String bibita = in.nextLine();
			Pizza pizas = new Pizza(tipo,bibita);
			pizzetta.add(pizas);
			break;
		case "pesce" :
			System.out.println("Dammi il tipo");
			String type = in.nextLine();
			System.out.println("Dammi i grammi");
			String gram = in.nextLine();
			System.out.println("Dammi il contorno");
			String contorno = in.nextLine();
			Pesce fish = new Pesce(type,gram,contorno);
			pesci.add(fish);
			break;
	     default :
			System.out.println("Non fa parte della selezione");
		}	
		
		System.out.println("Vuoi inserire un nuovo piatto? [si/no]");
		String np = in.nextLine();
		if(np.equalsIgnoreCase("no")){
            k=1;
		}
			in.close();
		}
			
		public static void printPesce(ArrayList<Pesce> p) {
			  
			try {
				FileWriter writer = new FileWriter("C:\\Users\\LucaGao\\Desktop\\filename.txt");
				for(int j = 0; j < p.size(); j++) {
					Pesce p = p.get(j);	
					String spattern = "%s %s \n";
						writer.write(
							(j % 2 == 0) 
							? String.format(spattern, p.name, p.model)
							: String.format(spattern, p.model, p.name)
						);				
				}
				writer.close();
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace(); 
			}		 
    	  
      }
	}
	
}
class Cibo {
	String tipo;
}
class Spaghetti extends Cibo {
	String grammi;
	Spaghetti(String t, String g) {
		this.tipo = t;
		this.grammi =g;
	}
}
class Pizza extends Cibo {
	String bibita;
	
	Pizza(String t,String b) {
		this.tipo = t;
		this.bibita = b;
	}
}
class Pesce extends Cibo {
	String grammi;
	String contorno;
	
	Pesce(String t,String g,String c) {
		tipo = t;
		grammi = g;
		contorno = c;
	}
}