/*
 * 
 * 🍰 Esercizio 5
	Scrivi un programma Java che verifica se un numero è positivo e pari.
*/

package condizionaliIfJava;
import miscellaneus.Rand;

public class Esercizio5 {

	public static void main(String[] args) {
		Rand r= new Rand();
		int num;
		
		num=r.intNeg();
		
		System.out.print( ( (num>0) && (num%2==0) )?num+" è sia pari che maggiore di zero":
			num+" manca o la parità o il maggiore di zero");
		
	}

}
