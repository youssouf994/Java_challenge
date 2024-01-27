/*
 * 🍰 Esercizio 8
	Scrivi un programma Java che verifica se un numero è positivo, 
	negativo o zero utilizzando l'operatore ternario.
 * */

package operatoreTernario;
import miscellaneus.Rand;

public class Esercizio8 {

	public static void main(String[] args) {
		Rand r=new Rand();
		int num=r.intNeg();
		
		System.out.print(num +"\n"+(num<0?"numero negativo"
						: num>0?"numero positivo"
						: "numero uguale a "+num));

	}

}
