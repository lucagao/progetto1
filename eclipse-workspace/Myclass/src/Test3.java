import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Quadrato quadro = new Quadrato();
		
		System.out.println("Inserici il lato del quadrato");
		quadro.lato =Double.parseDouble(in.nextLine());
		System.out.println("L'area del quadrato è : " + quadro.areaQuadrato(quadro.lato));
		System.out.println("Il perimetro è : " + quadro.perimetroQuadrato(quadro.lato) +"\n");
		
		Rettangolo retta = new Rettangolo();
		
		System.out.println("Inserici la base e l'altezza del rettangolo ");
		retta.base = Double.parseDouble(in.nextLine());
		retta.altezza = Double.parseDouble(in.nextLine());
		System.out.println("L'area del rettangolo è : " + retta.areaRettangolo(retta.base + retta.altezza));
		System.out.println("Il perimetro del rettangolo è : " + retta.perimetroRettangolo(retta.base + retta.altezza));
		 
		
		
		in.close();
       /*
        * le proprietà e metodi statici vengono viste dal programma prima del Runtime,
        * inoltre essendo statica le sue caratteristiche vengono prese anche dalle altre classi.
        * A differenza di quelle statiche, le prorietà e metodi non statici vengono viste solo al Runtime
        * e determina una caratterista di una determinata classe che non è presente nelle altre classi.
        * 
        */
	}
	    /* String[][] città = {{"roma","venenzia"}{"oslo"}{"dublino"};
	     * In un array multidimensionale è presente una migiore allocazione dei dati,
	     * che diventa a forma tabellare a differenza di quella sequenziale 
	     * dell'array normale e permette di una migliore selezione e esclusione di determinati elementi.
	     */

}
 class Quadrato {
	 
	double lato;
	
	void setLato(double n) {
		lato = n;
	}
	double areaQuadrato(double x) {
    return  x =  lato*lato;
	}
    double perimetroQuadrato(double y) {
	return y = lato*4;
	}
}
 
 
 class Rettangolo {
	 
	 double altezza;
	 double base;
	 
	 void setAltezza( double n) {
		 altezza = n;	 
	 }
	 
	 void setBase( double n) {
		 base = n;
	 }
	 double areaRettangolo( double a) {
		 return a = altezza*base;
	 }
	 double perimetroRettangolo( double b) {
		 return b = 2*(altezza + base);
	 }
 }