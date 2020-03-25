package Zeta;



	import java.util.function.Function;

	@FunctionalInterface
	interface Hello {
	    public String sayHello(String name);
	}

	public class Alpha {
	    public static void main(String args[]) {
	      
	      Function<Integer, Integer> sum = (n) -> { return n + 10; };
	      doSum( 50, sum );
	      
	      Function<Integer[], String> printNumbers = (nums) -> {
	          String txt = "[";
	          for(int i = 0; i < nums.length; i++) {
	              txt += nums[i] + ( (i < nums.length-1) ? ", " : "") ;
	          }
	          
	          return txt + "]"; 
	      };
	      
	      Integer[] numbers = {1,2,3,4};
	      System.out.println( printNumbers.apply(numbers) );
	      
	      Hello h1 = (n) -> "Hello " + n;
	      System.out.println( h1.sayHello("Luca") );
	      
	      Hello h2 = (n) -> "Hello again " + n;
	      System.out.println( h2.sayHello("Luca") );
	      
	    }
	    
	    public static void doSum(int n, Function<Integer, Integer> fn) {
	        System.out.println(   fn.apply(n)   ); 
	    }
	}
