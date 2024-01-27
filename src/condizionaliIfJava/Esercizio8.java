/*
 * 🍰 Esercizio 8
	Scrivi un programma Java che verifica se 
	un carattere è una vocale o una consonante.
 * */

package condizionaliIfJava;

public class Esercizio8 {

	public static void main(String[] args) {
		char a= 'g';
		
		if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u')
			System.out.print("il carattere "+a+" è una vocale");
		else
			System.out.print("il carattere "+a+" è una consonante");
	}

}