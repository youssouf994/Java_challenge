/*
 * 🍰 Esercizio 1
	Scrivi un programma Java che verifica se un numero è 
	pari o dispari utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio1 {

	public static void main(String[] args) {
		Rand r= new Rand();
		int n, n2;
		
		n=r.intero();
		n2=r.intNeg();
		
		System.out.print(n%2==0?n+" numero pari":n+" numero dispari");
		System.out.print("\n"+n2);

	}

}
