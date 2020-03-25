
public class Concessionario {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setPrice(7000);
		car1.setMaxSpeed(150);
		car1.setModel("Benzina");
		Punto p1 = new Punto("Gran Punto","Fiat");
		p1.setModel("Benzina");
		p1.printModel();
		//System.out.println(p1.name + " " + p1.marca);
		Bmw b1 = new Bmw("X3","Bmw");
		b1.setModel("Diesel");
		b1.printModel();
		//System.out.println(b1.name + " " + b1.marca);
	}   

}

class Car {
	
	double price;
	int maxSpeed;
	int speed;
	String model;
	String name;
	String marca;
	// setters
	void setPrice(double p) {
		price = p;
	}
	void setMaxSpeed(int m) {
		maxSpeed = m;
	}
	void setModel(String ml) {
	    model = ml;
	}
	void printModel(){
		System.out.println("the model is : "+ model);
	}
	void bustSpeed(int s) {
		
	}
	
}

class Punto extends Car {
	
	Punto(String n, String m) {
		this.name = n;
		this.marca = m;
	}		
	void printModel(){
		System.out.printf("This is a %s, brand %s and model %s \n",name,marca,model);
	
}
}
class Bmw extends Car {
	
	Bmw(String n, String m) {
		this.name = n;
		this.marca = m;
}	
		void printModel(){
			System.out.printf("This is a %s, brand %s and model %s high quality",name,marca,model);
		
	
}
}
