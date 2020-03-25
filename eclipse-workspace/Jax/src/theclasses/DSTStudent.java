package theclasses;

public class DSTStudent {
	
	private String name;
	private String lastname;
	private int age;
	
	public DSTStudent(String n, String ln, int a) {
		name = n;
		lastname = ln;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String toString() {
		return String.format(
			"Name: %s | Lastname: %s | Age: %d", name, lastname, age);
	}
	
}