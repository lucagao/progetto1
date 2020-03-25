package Person;
import java.util.ArrayList;
import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		/*
		ArrayList<String> words = new ArrayList<String>();	//<Integer> classe wrap generici
		//{ add(valore) };
		
		words.add("Ciao");
		words.add("sono");
		words.add("Java");
		words.set(2, "Phyton");
		//words.remove(0);	//"sono" è il nuovo 0;
		//words.size();	//grandezza ArrayList

		for(String word : words)
			System.out.println(word);
		System.out.println(words);
		
		//Array di Array
		ArrayList< ArrayList<Integer> > sn = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
			tab1.add(i);
		sn.add(tab1);
		System.out.println(sn);
		*/
		/*
		HashSet a differenza della precedente non utilizza indici ma hascode, ha solo un valore (è numerico)
		E' possibile scorrere con l'iterator
		 */
		HashMap<String,String> student = new HashMap<String,String>() {{

			put("name", "luca");
			put("lastname", "gao");
			put("age", "20");
		
		}};
		System.out.println(student);
		/*
		HashMap: utile per accedere al valore senza l'importanza dell'ordine, ha piu valori (è associativo)
		words.get(riferimento);		//riferimento è il primo valore associato
		 */
		ArrayList<HashMap<String,String>> students = new ArrayList<HashMap<String,String>>() {{

			add(student);
			add(new HashMap<String,String>() {{
				put("name","ugo");
				put("lastname","ugolini");
				put("age","20");
			}} );
		}};
		System.out.println(students);
		
		sep(50);
		for(HashMap<String,String> st : students) {
			System.out.printf("Name: %s / lastname: %s / Age: %s \n",
							st.get("name"), st.get("lastname"), st.get("age")
							);
			sep(50);
			
		}
	}
	
	static void sep(int chars ) {
		String sep = "";
		for(int i =0; i < chars; i++) {
			sep += "-";
		}
		System.out.println(sep);
	}
}
