package esercizio;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  ---|---|---|---
     l | u | c | a
    ---|---|---|---
 * 
 */
public class FxWords {

	private String word;
	private int seps = 3;
	private String sep = "-";
	private String vsep = "|";
	private String nl = "\n";
	private String space = " ";
	private String thetxt = "";
	
	private int age;
	private String x;
	
	public void setAge(int a) {
		if( a > 0 && a < 150 ) age = a;
	}
	
	public static void main(String[] args) {
		
		FxWords fx1 = new FxWords( "luca", 4 );
		fx1.doFx();
		
		fx1.setAge(190);
		
		FxWords fx2 = new FxWords( "gelsomino", 4 );
		fx2.setSep("#");
		fx2.doFx();
		fx2.saveToFile("fxwords.txt");
		
	}
	
	FxWords(String w) {
		word = w;
	}
	
	FxWords(String w, int s) {
		this(w);
		seps = ( s%2 == 0 ) ? s+1 : s;
	}
	
	public void setSep(String s) { sep = s; }
	public void setVsep(String vs) { vsep = vs; }
	public void setSpace(String s) { space = s; }
	
	public void doFx() {
		int l = word.length();
		String txt = "";
		
		// first line
		for(int i = 0; i < l; i++) {
			txt += doSeps() + (( i < l-1 ) ? vsep : "" );
		}
		txt+=nl;
		
		// center line
		for(int i = 0; i < l; i++) {
			txt += doLetter(word.charAt(i)) + (( i < l-1 ) ? vsep : "" );
		}
		txt+=nl;
		
		// last line
		for(int i = 0; i < l; i++) {
			txt += doSeps() + (( i < l-1 ) ? vsep : "" );
		}
		
		thetxt = txt;
		System.out.println(txt + nl);
	}
	
	public String doSeps() {
		String txt = "";
		for(int i = 0; i < seps; i++) {
			txt += sep;
		}
		return txt;
	}
	
	public String doLetter(char c) {
		String txt = "";
		String htxt = "";
		int half = (seps-1)/2;
		
		for(int i = 0; i < half; i++) htxt += space;
		
		txt += htxt + c + htxt;
		
		return txt;
	}
	
	public void saveToFile(String fpath) {
		try {
			FileWriter fo = new FileWriter(fpath);
			fo.write(thetxt);
			fo.close();
			System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	}

}