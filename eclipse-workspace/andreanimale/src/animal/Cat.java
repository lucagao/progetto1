
package animal;

public class Cat extends Animal {	
	public Cat(String n, String t, int a) {
		super(n, t, a);
	}		
	
	public String roar() {
		return "The sound is miao miao";
	}
}