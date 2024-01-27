/*
 * 🍰 Esercizio 4
	Scrivi un programma Java che confronti due numeri interi e 
	determini se sono diversi.
 * */

package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio4 {

	public static void main(String[] args) {
		Rand r=new Rand(10);
		int num1, num2;
		
		num1=r.intero();
		num2=r.intero();
		
		System.out.print((num1==num2)? num1+" è uguale a "+num2 : num1+" è diverso da "+num2); 
	}

}
