import java.util.Scanner;


public class Boygirl { 
	
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);  
    
    Boy boy1 = new Boy();
    
    
    System.out.println("Nome Boy");
    boy1.name = scanner.nextLine();
    
    System.out.println("Lastname Boy");
    boy1.lastname = scanner.nextLine();
    
    System.out.println("Age Boy");
    boy1.age = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Strength Boy");
    boy1.strength = Integer.parseInt(scanner.nextLine());
    
    Girl girl1 = new Girl();
    
    System.out.println("Nome Girl");
    girl1.name = scanner.nextLine();
    
    System.out.println("Lastname Girl");
    girl1.lastname = scanner.nextLine();
   
    System.out.println("Age Girl");
    girl1.age = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Partner Girl");
    girl1.partner = scanner.nextLine();
    
    System.out.println("[ BOY ]\n"
                        + "Nome : " + boy1.name + " "+ "Cognome : "+ boy1.lastname + "\n"
                        + "Age :" + boy1.age+ "\n"
                        + "Strength :" + boy1.strength
                        );
    System.out.println("[ GIRL ]\n"
                        + "Nome : " + girl1.name + " "+ "Cognome : "+ girl1.lastname + "\n"
                        + "Age :" + girl1.age +"\n"
                        + "Girl :" + girl1.partner
                        );
    System.out.println("Vuoi che la girl cambi partner?");
    String answer = scanner.nextLine();
    
    switch(answer) {
      case "si":
    	  System.out.println("Dammi il nome del nuovo partner");
    	  girl1.setPartner(scanner.nextLine());
    	  break;
      case "no" :
    	  System.out.println("Il partner rimane lo stesso");
    	  break;
      default :
    	  System.out.println("la scelta non è consentita");
    }   	  
     System.out.println("Vuoi che aumenti la strength del boy?");
     String increase = scanner.nextLine();
     
     switch(increase) {
     case "si":
   	      System.out.println("Dammi il nuovo valore di strength");
   	      boy1.setStrength(Integer.parseInt(scanner.nextLine()));
   	      break;
     case "no" :
   	      System.out.println("lo strength rimane lo stesso");
   	      break;
     default :
   	  	  System.out.println("la scelta non è consentita");
     
 
    }
      System.out.println("il nuovo valore di strength è : ");
      
    scanner.close();
   }
 }
 
class Boy {
   
   String name;
   String lastname;
   int age;
   int strength;
   
   void setName(String n){
       name = n;
   }
   
   void setLastName(String n) {
       lastname = n;
   }
   void setAge(int n) {
        age = n;
   }
   void setStrength(int n) {
       strength = n;
   }
}
class Girl {
    
    String name;
    String lastname;
    int age;
    String partner;
    
     void setName(String n){
       name = n;
   }
   
   void setLastName(String n) {
       lastname = n;
   }
   void setAge(int n) {
        age = n;
   }
   void setPartner(String n) {
       partner = n;
   }
}