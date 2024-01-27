/*
 * 🍰 Esercizio 9
	Scrivi un programma Java che determina il valore minimo 
	tra tre numeri utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio9 {

	public static void main(String[] args) {
		Rand r= new Rand();
		int num1, num2, num3;
		
		System.out.println(num1=r.intNeg());
		System.out.println(num2=r.intNeg());
		System.out.println(num3=r.intNeg());
		
		System.out.print( ( (num1<(num2&num3))?num1+"è il minore" 
						:(num2<(num1&num3))? num2+"è il minore"
						: num3+"è il minore"
						));
	}

}
