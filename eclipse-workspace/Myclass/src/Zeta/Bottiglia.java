package Zeta;



	public class Bottiglia {
	    public static void main(String args[]) {
	      
	      Water w1 = new Water();
	      
	      Bottle<Water> bw = new Bottle<Water>(w1);
	      bw.getLiquid().printLiquidType();
	      
	      Bottle<String> bs = new Bottle<String>(new String("hello"));
	      System.out.println( bs.getLiquid().toUpperCase() );
	      
	    }
	}

	class Bottle<T> {
	    
	    private T liquid;
	    
	    Bottle(T liquid) {
	        this.liquid = liquid;
	    }
	    
	    T getLiquid() {
	        return this.liquid;
	    }
	}

	class Water {
	    final static String type = "water";
	    
	    void printLiquidType() {
	        System.out.println(type);
	    }
	}
