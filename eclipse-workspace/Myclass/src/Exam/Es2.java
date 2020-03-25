package Exam;
import java.util.function.Function;
public class Es2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stringfun dis = x -> { String strings = "";
		for(int j = 0; j < x.length(); j+=2) {
			strings += x.charAt(j);
		}
		return strings;
		};
		System.out.println(dis.printCar("hello"));
		
		Stringfun des = x -> { String strings = "";
		for(int j = 1; j < x.length(); j+=2) {
			strings += x.charAt(j);
		}
		return strings;
		};
		System.out.println(des.printCar("hello"));
		
		Stringfun das = x -> { String strings = "";
		for(int j = x.length()-1; j > -1; j--) {
			strings += x.charAt(j);
			
		}
		return strings.toUpperCase();
		};
		System.out.println(das.printCar("hello"));
		
		
	}
		}

interface Stringfun {
	
	    String printCar(String strings);

}

		