package Test;
import java.util.Scanner;

public class Ruolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       
       System.out.println("Quante persone vuoi creare?");
       int numero =Integer.parseInt(in.nextLine());
       
       //Persona[] gruppo = new Persona[numero];
       for(int i = 0; i< numero; i++) {
    	   int k= i+1;
       
       
       System.out.println("Scegli il ruolo tra direttore, docente e studente della persona "+k);
       String tipo = in.nextLine();
       System.out.println("Dammi il nome "+k);
       String nome = in.nextLine();
       System.out.println("Dammi il cognome "+k);
       String cognome = in.nextLine();
              
       Direttore director = new Direttore(nome,cognome,"primo livello di accesso");
       Docente professor = new Docente(nome,cognome,"secondo livello di accesso");
       Studente student = new Studente(nome,cognome,"terzo livello di accesso");
       
       switch(tipo) {
    	   case "direttore":
    		   director.printInfo();
    		   break;
    	   case "docente":
    		   professor.printInfo();
    		   break;
    	   case "studente":
    		   student.printInfo();
    		   break;
    	   default:
    		   System.out.println("Non è compreso nella scelta");
       }
    		   
       }
       
       in.close();
	}

}
class Persona {
	String name;
	String surname;
	String livello;
	
	Persona(String n, String s,String l) {
		name = n;
		surname = s;
		livello = l;
	}
		
	
	void printInfo () {
		System.out.println(name+" "+surname+" "+livello);
	}
}
class Direttore extends Persona {
	
	Direttore(String n, String s,String l) {
		super(n,s,l);
	}	
	void printInfo () {
		System.out.println("Direttore "+name+" "+surname+" "+livello);
	}
}
class Docente extends Persona {

	Docente(String n, String s,String l) {
		super(n,s,l);
	}	
	
	void printInfo () {
		System.out.println("Docente "+name+" "+surname+" "+livello);
}
}
class Studente extends Persona {
	
	Studente(String n, String s,String l) {
		super(n,s,l);
	}	
	
	void printInfo () {
		System.out.println("Studente "+name+" "+surname+" "+livello);
	}
}