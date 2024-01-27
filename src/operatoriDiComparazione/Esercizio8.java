/*
 * 🍰 Esercizio 8
	Scrivi un programma Java che confronti due stringhe e determini se la 
	prima stringa è più lunga della seconda.
 * */


package operatoriDiComparazione;

public class Esercizio8 {

	public static void main(String[] args) {
		String s1, s2;
		
		s1="ksfdndkf";
		s2="kjsndw";
		
		System.out.print((s1.length()>s2.length())? s1+" più lunga di "+s2
						:(s1.length()<s2.length())? s1+" più corta di "+s2
						:s1+" uguali a "+s2);
	}

}
