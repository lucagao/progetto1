
package animal;

public abstract class Animal {
	private String name;
	private String type;
	private int age;
	
	public Animal(String n, String t, int a) {
		name = n;
		type = t;
		age = a;
	}
	
	public abstract String roar ();
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}	
	
	public int getAge() {
		return age;
	}	
}

