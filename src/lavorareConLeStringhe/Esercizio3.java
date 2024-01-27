/*
 * 🍰 Esercizio 3
	Scrivi un programma Java che verifica se una 
	stringa inizia con un determinato prefisso.
 * */

package lavorareConLeStringhe;

public class Esercizio3 {

	public static void main(String[] args) {
		String s="cia sto imparando java", pre="ciao";
		
		System.out.print((s.startsWith(pre))? "la stringa "+s+" inizia con "+pre:"la stringa "+s+" non inizia con "+pre);

	}

}
