
public class Casa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Human umano = new Human("Mario","Rossi",new double [] { 1.70 ,79});
	
	System.out.println(umano.sizes[1]);
	}

}

class Human {
	String name;
	String lastname;
	double[] sizes;
	
	Human(String n,String ln,double[] s){
		name = n;
		lastname = ln;
		sizes = s;
	}
}