package Exam;

public class Es1LG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cicloFor();
		cicloWhile();
		cicloDo();
	}
	
	public static void cicloFor(){		
		int k = 0;
		for(int i = 0; i<=30; i++) {
			if( i%3 == 0)  
		     k += i;
		}
			System.out.println("for " + k);
	}	
	public static void cicloWhile() {
		int a = 0;
		int j = 0;
		while(j<=30) {
		 if(j%3 == 0) 
			a += j;
			j++;
		}
		System.out.println("while " + a);
	}		
	public static void cicloDo() {	
		int b = 0;
		int c = 0;
		do {
			if(b %3 ==0) 
		    c += b;
		    b++;		
			
		}
		while(b <= 30); 
		System.out.println("do " + c);		
	}	

}
