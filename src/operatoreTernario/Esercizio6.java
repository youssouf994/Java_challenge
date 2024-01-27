/*
 * 🍰 Esercizio 6
	Scrivi un programma Java che verifica se una stringa è vuota utilizzando l'operatore ternario.
 * */

package operatoreTernario;

public class Esercizio6 {

	public static void main(String[] args) {
	String s=null;
	
	System.out.print(s==null||s==""?"stringa vuota" : "stringa contiene: "+s);

	}

}
