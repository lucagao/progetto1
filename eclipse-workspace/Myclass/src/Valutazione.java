import java.util.*;

public class Valutazione {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dammi il numero dei studenti");
		int maxnum = Integer.parseInt(in.nextLine());
		Student [] array = new Student[maxnum];
		int vaz = 0;
		for(int i = 0; i< maxnum ; i++) {
			System.out.println("Student "+(i+1)+" name : ");
			String name =in.nextLine();
			
		for (int j = 1; j <= 3; j++)	{
		
			System.out.println("student "+ name+" voto"+ j);
	
			int voti = Integer.parseInt(in.nextLine());
			 int [] vil = new int [voti];
			 for(int z = 0; z < vil.length; z++) {
				  vaz += vil[z];
			 }
		}
		
		
	    int var += vaz;
		int average = 0;
		average = var/3;
		System.out.println(var);
		System.out.println("la media è : " + average);
		}
		
		
		
		in.close();
	}

}

class Student {
	String name;
	String lastname;
	
	Student(String n, String ln) {
		name = n;
		lastname = ln;
		

		
	}
}
class Vol {
	
}

class Voto extends Student {
	int voto;
	
	Voto(String n, String ln, int v) {
		super(n,ln);
		voto = v;
		
	}
	
}
