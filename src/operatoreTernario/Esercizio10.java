/*
 * 🍰 Esercizio 10
	Scrivi un programma Java che verifica se una persona è maggiorenne o 
	minorenne in base all'età utilizzando l'operatore ternario.
 * */

package operatoreTernario;

public class Esercizio10 {

	public static void main(String[] args) {
		int eta=28;
		String check;
		
		check=(eta<18?"minorenne":"maggiorenne");
		
		System.out.println(check);
	}

}
