package theclasses;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowAnimals {
	
	private ArrayList<HashMap<String, String>> animals;
	
	private static String defaultParamValue = "default";
	
	public ShowAnimals(ArrayList<HashMap<String, String>> animals) {
		this.animals = animals;
	}
	
	public static HashMap<String, String> createAnimal(String p1, String p2, String p3) {
		Animal animal = new DefaultAnimal();
		
		switch(p2.toLowerCase()) {
			case "dog":
				animal = new Dog(p1, p3);
				break;
			case "cat":
				animal = new Cat(p1, p3);
				break;
			case "lion":
				animal = new Lion(p1, p3);
				break;
			default:
				animal = new DefaultAnimal();
				break;
		}
		
		String name = animal.getName();
		String type = animal.getType();
		String age = animal.getAge();
		String roar = animal.roar();
		
		return new HashMap<String, String>() {{
			put("name", name);
			put("type", type);
			put("age", age);
			put("roar", roar);
		}};
	}
	
	public ArrayList<HashMap<String, String>> getAnimals() { return this.animals; }
	public HashMap<String, String> getAnimal(int n) { return this.animals.get(n); }
	
	public static String checkParameterNull(String param) {
		return (param == null || param.equals("")) ? defaultParamValue : param;
	}
	
}

abstract class Animal {
	protected String name;
	protected String type;
	protected String age;
	
	Animal(String n, String a) {
		name = n;
		age = a;
	}
	
	abstract String roar();
	
	public String getName() { return name; }
	public String getAge() { return age; }
	public String getType() { return type; }
}

class DefaultAnimal extends Animal {
	DefaultAnimal() {
		super("undefined", "undefined");
		type = "DefaultAnimal";
	}
	
	String roar() {
		return "dontknow dontknow";
	}
}

class Dog extends Animal {
	Dog(String n, String a) {
		super(n, a);
		type = "Dog";
	}
	
	String roar() {
		return "Woof woof";
	}
}

class Cat extends Animal {
	Cat(String n, String a) {
		super(n, a);
		type = "Cat";
	}
	
	String roar() {
		return "Meow meow";
	}
}

class Lion extends Animal {
	Lion(String n, String a) {
		super(n, a);
		type = "Lion";
	}
	
	String roar() {
		return "Roar roar";
	}
}