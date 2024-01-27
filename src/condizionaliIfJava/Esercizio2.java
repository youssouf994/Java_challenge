/*
 * 🍰 Esercizio 2
	Scrivi un programma Java che verifica se un numero è pari o dispari.
 * */

package condizionaliIfJava;
import miscellaneus.Rand;;


public class Esercizio2 {

	public static void main(String[] args) {
		Rand r=new Rand();
		int num;
		
		num=r.intero();
		
		System.out.print((num%2==0)?num+" pari":num+" dispari");

	}

}
