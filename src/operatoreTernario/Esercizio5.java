/*
 * 🍰 Esercizio 5
	Scrivi un programma Java che verifica se un carattere è una lettera maiuscola 
	utilizzando l'operatore ternario.
 * */

package operatoreTernario;

public class Esercizio5 {

	public static void main(String[] args) {
	char c='A';
	
	System.out.print( ((c>='A')&&(c<='Z'))==true ? "lettera maiuscola" : "lettera minuscola" );
	}

}
