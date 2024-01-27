/*
 * 🍰 Esercizio 4
	Scrivi un programma Java che verifica se un anno è bisestile.
 * */

package condizionaliIfJava;

public class Esercizio4 {

	public static void main(String[] args) {
		int anno=2024;
		
		if((anno%4==0)&&(anno%100!=0)||(anno%400==0))
			System.out.print("l'anno "+anno+" è un anno bisestile");
		
		else
			System.out.print("l'anno "+anno+" non è un anno bisestile");
	}

}
