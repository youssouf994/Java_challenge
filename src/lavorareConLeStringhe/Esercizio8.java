/*
 * 🍰 Esercizio 8
	Scrivi un programma Java che verifica se una stringa contiene 
	una determinata sequenza di caratteri utilizzando il metodo contains.
 * */

package lavorareConLeStringhe;

public class Esercizio8 {

	public static void main(String[] args) {
		String s="continua il corso java", cerca="corso";
		
		System.out.print((s.contains(cerca))?s+" contiene "+cerca:s+" non contiene "+cerca);

	}

}
