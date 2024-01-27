/*
 * 🍰 Esercizio 5
	Scrivi un programma Java che verifichi se una stringa è vuota.
 * */


package operatoriDiComparazione;

public class Esercizio5 {

	public static void main(String[] args) {
		String s="";
		
		System.out.println((s.length()==0)? "stringa vuota" : 
			s+ " ha una lunghezza di "+s.length()+" caratteri");
		

	}

}
