public class Usooveride {
    public static void main(String args[]) {
      
      Sub s1 = new Sub(30);
      s1.sayHello(true);
      s1.printX();
      
    }
}

class Super {
    int x = 10;
    
    Super(int inX) {
        this.x = inX;
    }
    
    void sayHello(boolean x) {
        System.out.println("hello, i am from Super");
    }
}

class Sub extends Super {
    int x = 15;
    
    Sub(int inX) {
        super(inX);
        System.out.println("do something...");
    }
    
    @Override
    void sayHello(boolean callSuper) {
        if(callSuper) super.sayHello(false);
        else System.out.println("hello, i am from Sub");
    }
    
    void printX() {
        System.out.println(super.x);
    }
}

class A {
    A() {
        //System...
    }
}