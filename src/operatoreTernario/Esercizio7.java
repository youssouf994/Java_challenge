/*
 * 🍰 Esercizio 7
	Scrivi un programma Java che calcola il prezzo scontato di un prodotto 
	in base all'importo e al tasso di sconto utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio7 {

	public static void main(String[] args) {
		Rand r=new Rand();
		float prezzo, sconto=27, prezzoScontato;
		
		prezzo=r.flo();
		prezzoScontato=(prezzo-(prezzo*(sconto/100)) >0 ? (prezzo-(prezzo*(sconto/100))) :0);
		
		System.out.println("prezzo pieno: "+prezzo);
		System.out.print("prezzo scontato: "+prezzoScontato);
	}

}
