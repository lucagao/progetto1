package others;


public class Esseri {
    public static void main(String args[]) {
        //Human h1 = new Human();
        //h1.sayHello();
        //System.out.println( h1.race );
        
        Dog d1 = new Dog("milo", "husky");
        Cat c1 = new Cat("mila", "persiano");
        
        c1.iAmMammal();
        
        showAnimal(d1);
        showAnimal(c1);
    }
    
    static void showAnimal(Animal a) {
        a.printInfo();
    }
}

interface iHuman {
    public final static String race = "Human";
    
    void sayHello();
}

class Human implements iHuman {
    public void sayHello() {
        System.out.println("hello");
    }
}

interface iMammal {
    String objType = "Mammal";
    void iAmMammal();
}

interface iAnimal extends iMammal {
    void printInfo();
}

abstract class Animal implements iAnimal {
    String name;
    String breed;
    static String type = "Animal";
    
    Animal(String n, String b) {
        name = n;
        breed = b;
    }
    
    public void iAmMammal() {System.out.println("I am a "+objType+" ("+type+")");}
    
    public void printInfo() {
        System.out.printf("%s (%s) \n", name, breed);
    }
}

final class Dog extends Animal {
    
    Dog(String n, String b) {
        super(n, b);
        type = "Dog";
    }
    
    public void printInfo() {
        System.out.printf("I am a %s. \n", type);
        super.printInfo();
    }
}

final class Cat extends Animal {
    
    Cat(String n, String b) {
        super(n, b);
        type = "Cat";
    }
    
    public void printInfo() {
        System.out.printf("I am a %s. \n", type);
        super.printInfo();
    }
}