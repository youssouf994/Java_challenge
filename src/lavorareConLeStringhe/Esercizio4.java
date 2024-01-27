/*
 * 🍰 Esercizio 4
	Scrivi un programma Java che verifica se una 
	stringa termina con un determinato suffisso.
 * */

package lavorareConLeStringhe;

public class Esercizio4 {

	public static void main(String[] args) {
		String s="ciao sto imparando java", suff="java";
		
		System.out.print((s.endsWith(suff)?"la stringa "+s+" termina con "+suff:"la stringa "+s+" non termina con "+suff));

	}

}
