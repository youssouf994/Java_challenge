/*
 * 🍰 Esercizio 2
	Scrivi un programma Java che calcola il valore assoluto 
	di un numero utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio2 {

	public static void main(String[] args) {
		Rand r = new Rand();
		int n=r.intNeg();
		//int n=-5;
		
		System.out.print(n>=0
				? n+" in valore assoluto è "+n
				: n+" in valore assoluto è "+ -n);
	}

}
