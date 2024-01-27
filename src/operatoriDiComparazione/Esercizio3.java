/*
 *🍰 Esercizio 3
	Scrivi un programma Java che confronti due stringhe e determini se sono uguali. 
 * */

package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio3 {

	public static void main(String[] args) {
		String s1, s2;
		int ris;
		s1="ciao";
		s2="ciao";
		
		ris=s1.compareTo(s2);
		
		if(ris==0)
			System.out.println("stringhe uguali");
		else
			System.out.println("stringhe diverse");
	}

}
