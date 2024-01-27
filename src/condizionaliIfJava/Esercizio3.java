/*
 * 🍰 Esercizio 3
	Scrivi un programma Java che verifica se un 
	carattere è una lettera maiuscola o una lettera minuscola.
 * */

package condizionaliIfJava;

public class Esercizio3 {

	public static void main(String[] args) {
		char c='A';
		
		System.out.print((Character.isUpperCase(c)==true)?"il carattere è maiuscolo":
			"il carattere è minuscolo");
	}

}
