/*
 * 🍰 Esercizio 6
	Scrivi un programma Java che verifica se una stringa è vuota o null.
 * */

package condizionaliIfJava;

public class Esercizio6 {

	public static void main(String[] args) {
		String s="";
		
		System.out.print((s==null)?"la stringa è null":
								(s.isEmpty())?"la stringa è vuota":
								"la stringa contiene "+s);

	}

}
