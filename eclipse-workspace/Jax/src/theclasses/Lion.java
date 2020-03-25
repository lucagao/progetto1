package theclasses;

public class Lion extends Anijsp {
	
	
	private  String name;
	private int age;
	private String type;
	
	public Lion(String n, int a,String t) {
         name = n;
         age = a;
         type = t;  
	}     
   
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return String.format(
				"Name: %s | Age: %d | Type: %s \n", name, age,type);
	}
	
	public String roar() {
		return "ruggito";
	
    }
	
}
