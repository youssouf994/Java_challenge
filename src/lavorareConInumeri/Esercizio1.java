package lavorareConInumeri;
import miscellaneus.Rand;

public class Esercizio1 {

	public static void main(String[] args) {
		int num1, num2;
		Rand r = new Rand();
		
		num1=r.intero();
		num2=r.intero();
		
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println("ris "+(num1+num2));
	}

}
