public class Overloading {
    public static void main(String args[]) {
      
        //Super s1 = new Super();
        //Super s2 = new Super(50);
        //Super s3 = new Super("hello");
        
        String x = new String("ciao");
        String y = new String( new char[] {'c', 'i', 'a', 'o'} );
        
        //System.out.printf("%s : %s", x, y);
        
        Sub s2 = new Sub(20);
      
    }
}

class Super {
    
    Super() {
        this(50);
        System.out.println("you have passed 0 args");
    }
    
    Super(int x) {
        this("ciao");
        System.out.println("you have passed 1 args");
        System.out.println(x);    
    }
    
    Super(String x) {
        System.out.println("you have passed 1 args, type String");
    }
    
}

class Sub extends Super {
    Sub() {
        System.out.println("from Sub");
    }
    
    Sub(int x) {
        super(x);
        System.out.println("from Sub: type int");
    }
}