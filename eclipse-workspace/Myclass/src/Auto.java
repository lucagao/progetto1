import java.util.*;

public class Auto {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String car = "";
      
      System.out.println("Which car do you want to create?");
      car = in.nextLine();
      
      switch(car) {
          case "punto":
              Punto p1 = new Punto("Punto", "Fiat", "Abarth", 10, 200, 100);
              System.out.println("Increase speed by?");
              double s = Double.parseDouble(in.nextLine());
              p1.boostSpeed(s);
              System.out.println( p1.speed );
              p1.printInfo();
          break;
      }
      
    }
}

class Car {
    int price;
    double maxSpeed;
    double speed;
    String model;
    
    Car(int p, double ms, double s) {
        price = p;
        maxSpeed = ms;
        speed = s;
    }
    
    // getters and setters
    void printInfo() {
        System.out.printf( 
            "Price: %d, maxSpeed: %.1f, speed: %.1f", 
            price, maxSpeed, speed
        );
    }
    
    void boostSpeed(double s) {
        speed += s;
    }
}

class Punto extends Car {
    String name;
    String brand;
    
    Punto(String n, String m, String md, int p, double ms, double s) {
        super(p, ms, s);
        name = n;
        brand = m;
        model = md;
    }
    
    void printInfo() {
        super.printInfo();
        System.out.printf(
            "\n Name: %s, Brand: %s, Model: %s \n", 
            name, brand, model);
    }
