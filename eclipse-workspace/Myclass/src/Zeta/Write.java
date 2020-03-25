package Zeta;


	import java.io.FileWriter; 
	import java.io.IOException;

	public class Write {

		public static void main(String[] args) {
			
			try {
				FileWriter fo = new FileWriter("filename.txt");
				fo.write("content");
				fo.close();
		      
				System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      
		    	System.out.println("An error occurred.");
		    	e.printStackTrace();
		    }
			
		}

	}