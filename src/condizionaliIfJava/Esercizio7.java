/*
 * 🍰 Esercizio 7
	Scrivi un programma Java che verifica se un numero è compreso tra due valori.
 * */

package condizionaliIfJava;
import miscellaneus.Rand;

public class Esercizio7 {

	public static void main(String[] args) {
		Rand r =new Rand();
		
		int min=627, max=756, num;
		
		num=r.intero();
		
		System.out.print(( (num>=min) && (num<=max) )?num+" il numero è compreso":
														num+" non è compreso");

	}

}
