/*
 * 🍰 Esercizio 10
	Scrivi un programma Java che calcola il prezzo 
	scontato di un prodotto in base all'importo e al tasso di sconto.
 * */

package condizionaliIfJava;
import miscellaneus.Rand;


public class Esercizio10 {

	public static void main(String[] args) {
		Rand r=new Rand();
		float prezzo, sconto=27, prezzoScontato;
		
		prezzo=r.flo();
		prezzoScontato=prezzo-(prezzo*(sconto/100));
		
		System.out.print("prezzo originale: "+prezzo+
						"\nsconto in percentuale: "+sconto+" %"+
						"\nprezzo finale: "+prezzoScontato);
	}

}
