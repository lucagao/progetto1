package esercizio;
import java.io.FileWriter;
import java.io.IOException;

public class FxParola {
	static String name = "luca";
	static int num = 4;
	static String space = "-";
	static String sep = "|";
	
	public static void main(String[] args) {
		
		
		FxWords(name, num);
		writeFile(SaveFxWords("anthony", 3));
	}
	
	public static void FxWords(String word, int n) {
		int i, j;
		if(n%2==0) n++;
		int x = (n-1)/2;	//numero spazi prima e dopo la parola
		//first line
		FxSpace(word.length(), n);
		//second line
		for(i=0; i<word.length(); i++) {
			for(j=0; j<x; j++)
				System.out.print(" ");	//spazi prima la parola
			System.out.print(word.charAt(i));
			for(j=0; j<x; j++)
				System.out.print(" ");	//spazi dopo la lettera
			if(i!=word.length()-1) System.out.print(sep);
		}
		System.out.println();
		//third line
		FxSpace(word.length(), n);
	}
	public static void FxSpace(int wordlength, int n) {
		for(int i=0; i<wordlength; i++) {
			for(int j=0; j<n; j++)
				System.out.print(space);
			if(i!=wordlength-1) System.out.print(sep);
		}
		System.out.println();
	}
	
	//same as FxWords() but returns a String.
	public static String SaveFxWords(String word, int n) {
		String stamp = "";
		
		int i, j;
		if(n%2==0) n++;
		int x = (n-1)/2;
		//first line
		for(i=0; i<word.length(); i++) {
			for(j=0; j<n; j++)
				stamp += space;
			if(i!=word.length()-1) stamp += sep;
		}
		stamp += "\n";
		//second line
		for(i=0; i<word.length(); i++) {
			for(j=0; j<x; j++)
				stamp += " ";
			stamp += word.charAt(i);
			for(j=0; j<x; j++)
				stamp += " ";
			if(i!=word.length()-1) stamp += sep;
		}
		stamp += "\n";
		//third line
		for(i=0; i<word.length(); i++) {
			for(j=0; j<n; j++)
				stamp += space;
			if(i!=word.length()-1) stamp += sep;
		}
		stamp += "\n";
		return stamp;
	}
	public static void writeFile(String phrase) {

		try {
			FileWriter bw = new FileWriter("C:\\Users\\ADMIN\\Desktop\\filename.txt"); 
		            bw.write(phrase);
		            bw.write("\n");
		            bw.close(); 

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace(); 
		}
	}
}