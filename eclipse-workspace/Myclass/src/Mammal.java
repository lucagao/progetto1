public class Mammal {
    public static void main(String args[]) {
        M m1 = new M("luca", "gao");
        m1.sayHello();
        m1.iAmMammal();
    }
}

abstract class Mammal1 {
    abstract void iAmMammal();
}

abstract class Human extends Mammal1 {
    String name;
    String lastname;
    String gender;
    
    Human(String n, String ln) {
        name = n;
        lastname = ln;
    }
    
    abstract void sayHello();
    abstract String getName();
    
    void sayCiao() {
        System.out.println("ciao");
    }
}

class M extends Human {
    
    M(String n, String ln) {
        super(n, ln);
        gender = "m";
    }
    
    @Override
    void sayHello() {
        System.out.printf(
            "hello im %s %s (%s) \n", name, lastname, gender);
    }
    
    String getName() {
        return name;
    }
    
    void iAmMammal() {
        System.out.println("I am mammal");
    }
}