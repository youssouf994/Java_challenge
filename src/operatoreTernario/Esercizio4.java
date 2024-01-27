/*
 * 🍰 Esercizio 4
	Scrivi un programma Java che determina il valore massimo tra due numeri utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio4 {

	public static void main(String[] args) {
		Rand r=new Rand();
		int num1, num2;
		
		num1=r.intNeg();
		num2=r.intNeg();
		
		System.out.println("numero 1= "+num1+"\nnumero 2= "+num2);
		System.out.print((num1>num2)? "numero 1 maggiore"
				:(num2>num1)? "numero 2 maggiore"
				: "i numeri estratti sono uguali");

	}

}
