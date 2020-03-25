import java.util.*;

   public class Test1 {
	    
	   public static void main(String[] args) {
		   
		Scanner in = new Scanner(System.in);
		
		Dog showDog = new Dog();
		Dog showDog1 = new Dog();
		Dog showDog2 = new Dog();
		
		System.out.println("Dimmi il nome del cane");
	    showDog.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showDog.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showDog.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il primo cane : " + showDog.name +"\n"
							+ "La sua razza : " +showDog.race +"\n"
							+ "Il suo costo : " +showDog.cost +"\n");
		
		System.out.println("Dimmi il nome del secondo cane");
	    showDog1.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showDog1.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showDog1.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il secondo cane : " + showDog1.name +"\n"
							+ "La sua razza : " +showDog1.race +"\n"
							+ "Il suo costo : " +showDog1.cost +"\n");
		
		System.out.println("Dimmi il nome del  terzo cane");
	    showDog2.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showDog2.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showDog2.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il terzo cane : " + showDog2.name +"\n"
							+ "La sua razza : " +showDog2.race +"\n"
							+ "Il suo costo : " +showDog2.cost + "\n" );
		
		Cat showCat = new Cat();
		Cat showCat1 = new Cat();
		Cat showCat2 = new Cat();
		
		System.out.println("Dimmi il nome del gatto");
	    showCat.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showCat.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showCat.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il primo gatto : " + showCat.name +"\n"
							+ "La sua razza : " +showCat.race +"\n"
							+ "Il suo costo : " +showCat.cost +"\n" );
		
		System.out.println("Dimmi il nome del secondo gatto");
	    showCat1.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showCat1.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showCat1.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il secondo gatto : " + showCat1.name +"\n"
							+ "La sua razza : " +showCat1.race +"\n"
							+ "Il suo costo : " +showCat1.cost +"\n" );
		
		System.out.println("Dimmi il nome del  terzo gatto");
	    showCat2.name = in.nextLine();
	    
	    System.out.println("Questo è la razza di appartenenza");
	    showCat2.race = in.nextLine();
	    
	    System.out.println("Il suo costo è di : ");
	    showCat2.cost  = Integer.parseInt(in.nextLine());
		
		System.out.println("Il primo cane : " + showCat2.name +"\n"
							+ "La sua razza : " +showCat2.race +"\n"
							+ "Il suo costo : " +showCat2.cost +"\n" );
		
		   
		   
		   
       in.close();
}
}
   
   
 class Dog {
	
	 String name;
	 String race;
	 int cost;
	 
	 void setName( String n) {
		 name = n;
	 }	 
	 void setRace( String n ) {
		 name = n; 
	 }
	 void setCost ( String n )  {
		 name = n;
	 }
	
 }
 
  class Cat {
	  
	  String name;
		 String race;
		 int cost;
		 
		 void setName( String n) {
			 name = n;
		 }	 
		 void setRace( String n ) {
			 name = n; 
		 }
		 void setCost ( String n )  {
			 name = n;
		 }
  }