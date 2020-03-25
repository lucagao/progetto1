package Creature;
import java.util.ArrayList;
import java.util.Scanner;

	public class Creanimal {
		
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			int n = 0;
			System.out.println("Dammi il numero degli animali?");
			n = Integer.parseInt(in.nextLine());
			
			
			
			for(int i = 0; i < n; i++) {
				int k = i+1;
				System.out.println("Dammi nome animale "+k);
				String name = in.nextLine();
				System.out.println("Leone o Tigre? dell'animale "+k);
				String tipo = in.nextLine();
			
				
			    try {
			        String[] types = {"lion","tiger"};
			        for(int z = 0; z < types.length; z++) {
			        	String nt = types[z];
			        if(tipo.equalsIgnoreCase(nt)) {
			        System.out.println("Name :" + name+ "Type :" + tipo);
			        }
			        }
			      } catch (Exception e) {
			        System.out.println("Something went wrong.");
			      }
				
			}       
			    
				
				
			    
			
	
			
			
			
			in.close();
			
}
	}
