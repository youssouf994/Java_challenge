/*
 * 	🍰 Esercizio 1
 *	Scrivi un programma Java che determini se un numero intero è positivo.
 *
 **/

package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio1 {

	public static void main(String[] args) {
		int num1;
		Rand r= new Rand();
		
		num1=r.intNeg();
		
		if(num1<0)
		{
			System.out.println(num1+" è un numero negativo");
		}
		else if(num1==0)
		{
			System.out.println(num1+" è pari a zero");
		}
		else if(num1>0)
		{
			System.out.println(num1+" è un numero positivo");
		}
			
		
	}

}
