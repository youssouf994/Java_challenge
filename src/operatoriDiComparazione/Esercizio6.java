/*
 *🍰 Esercizio 6
	Scrivi un programma Java che confronti due numeri interi e determini
	se il primo numero è maggiore del secondo. 
	
	
	🍰 Esercizio 7
	Scrivi un programma Java che confronti due numeri interi e determini se
	il primo numero è minore o uguale al secondo.
	
 * */


package operatoriDiComparazione;
import miscellaneus.*;

public class Esercizio6 {

	public static void main(String[] args) {
		Rand r= new Rand(5);
		int num1, num2;
		
		num1=r.intero();
		num2=r.intero();
		
		System.out.print((num1-num2>0)? num1+" maggiore di "+num2 
				:(num1-num2<0) ? num1+" minore di "+num2
				:num1+" è uguale a "+num2);
		
	}

}
