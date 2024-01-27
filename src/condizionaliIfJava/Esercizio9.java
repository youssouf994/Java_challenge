/*
 * 🍰 Esercizio 9
	Scrivi un programma Java che verifica se una persona è 
	maggiorenne o minorenne in base all'età.
 * */

package condizionaliIfJava;
import miscellaneus.Rand;

public class Esercizio9 {

	public static void main(String[] args) {
		Rand r=new Rand(100);
		int anni=r.intero();
		
		if(anni<18)
			System.out.print(anni+" il soggetto è minorenne");
		else
			System.out.print(anni+" il soggetto è maggiorenne");

	}

}
