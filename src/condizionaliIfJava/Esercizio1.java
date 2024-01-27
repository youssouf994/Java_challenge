/*
 * 🍰 Esercizio 1
	Scrivi un programma Java che verifica se 
	un numero intero è positivo, negativo o zero.
 * */

package condizionaliIfJava;
import miscellaneus.Rand;


public class Esercizio1 {

	public static void main(String[] args) {
		Rand r=new Rand();
		int num;
		
		num=r.intNeg();
		
		System.out.print((num<0)?num+": negativo":
							(num>0)?num+": positivo":
							num+": uguale a zero");

	}

}
