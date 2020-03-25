package Exam;


public class Casa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		formula();
		piramide();
		triangolodx();
		numeri();
		numbers();
	}
    public static void formula () {
    	for (int i=1; i<10; i ++)
    	{
    	    for (int j=0; j<i; j++)
    	    {
    	        System.out.print("*");
    	    }
    	    System.out.println("");
    	}
    	}
    public static void piramide() {
    	for (int i=1; i<10; i += 2)					// numero righe di '*'
    	{
    	    for (int k=0; k < (4 - i / 2); k++) 			//numero spazio ogni riga
    	    {
    	        System.out.print(" ");
    	    }									
    	    for (int j=0; j<i; j++)					//numero di '*' ogni riga
    	    {
    	        System.out.print("*");
    	    }
    	    System.out.println("");
    	}
    }
    public static void triangolodx()  {
    	for (int i = 0; i < 10; i++)
        {
            for (int j = 10; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    	System.out.println();
    }
    public static void numeri () {
    	  for(int i = 1; i<=10; i++ ) {
    		    for(int j = 1; j <= i; j++) {
    		        System.out.print(j);
    		    }
    		        System.out.println();
    		    }
    	  System.out.println();
    }
    public static void numbers() {
    	  int number = 1;
          for(int i = 1; i <= 10; i++) {
              for(int j = 1; j <= i; j++) {
                  System.out.print(number+" ");
                  number++;
              }
              System.out.println();
          }
    }
    }
    
