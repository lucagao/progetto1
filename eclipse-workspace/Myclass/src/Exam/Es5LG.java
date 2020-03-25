package Exam;
import java.util.*;
public class Es5LG {
static Scanner in;
final static int def = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		
		
		//min(ArrayList<Docente> doc);
		ArrayList<Docente> doc = new ArrayList<Docente>();
		
		int v = 0;
		while(v == def) {
		System.out.println("Dammi il nome del docente");
		String nome = in.nextLine();
		System.out.println("Dammi il cognome del docente");
		String cognome = in.nextLine();
		System.out.println("Dammi il codice del docente");
		String codice = in.nextLine();
		System.out.println("Dammi il età del docente");
		int età = Integer.parseInt(in.nextLine());
		Docente prof = new Docente(nome,cognome,codice,età);
		doc.add(prof);
		System.out.println("vuoi inserire un nuovo docente [si/no]");
		String r = in.nextLine();
		if(r.equalsIgnoreCase("si")) {
			v= 0;
		} else if (r.equalsIgnoreCase("no")) {
			v = 1;
			prof.printInfo();
			minAge(doc);
		} else {
			System.out.println("scelta non valida");
		}
		}
	
		in.close();
	}
    public static void minAge(ArrayList<Docente> v) { 	
		int min =v.get(0).age;
		for(int i = 0; i< v.size(); i++ ) {
			if(v.get(i).age < min) {
				min = v.get(i).age;
			}
		}
		System.out.println("L'età minima è : "+ min);
	}

}
class Docente {
	String name;
	String lastname;
	String code;
	int age;
	
	Docente(String n, String l,String c,int a) {
		name = n;
		lastname = l;
		code = c;
		age = a;
	}
	public Docente(Docente d){
		name=d.getName();
		lastname=d.getLastname();
		code=d.getCode();
		age=d.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String printInfo() {
		return String.format("Nome : %s Cognome : %s Codice : %s Età : %d"+"\n",name,lastname,code,age);
	}
	
}

