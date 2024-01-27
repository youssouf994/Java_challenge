/*
 *🍰 Esercizio 2
  Scrivi un programma Java che verifichi se un numero intero è pari. 
  
  */

package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio2 {

	public static void main(String[] args) {
		int num;
		Rand r =new Rand();
		
		num=r.intero();
		
		if(num%2==0)
			System.out.println(num+ " numero pari");
		
		else
			System.out.println(num+" numero dispari");

	}

}
