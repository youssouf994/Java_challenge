/*
 * 🍰 Esercizio 3
	Scrivi un programma Java che verifica se un anno è bisestile utilizzando l'operatore ternario.
 * */

package operatoreTernario;

public class Esercizio3 {

	public static void main(String[] args) {
		int anno=2052;
		
		System.out.print(
				(((anno%4==0)&&(anno%100!=0)) || (anno%400==0)) ? "Anno bisestile" : "Anno non bisestile"
				);
	}

}
