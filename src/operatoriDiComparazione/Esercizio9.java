/*
 * 🍰 Esercizio 9
	Scrivi un programma Java che verifichi se un numero intero
	è compreso tra due valori specifici.
 * 
 * */


package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio9 {

	public static void main(String[] args) {
		int num, min=0, max=25;
		Rand r =new Rand(50);
		
		num=r.intero();
		
		System.out.print(( (num>=min) && (num<=max))? num+" rientra nel range "+min+" "+max
						:num+" non rientra nel range "+min+" "+max);
	}

}
