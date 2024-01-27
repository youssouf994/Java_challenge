package lavorareConInumeri;
import miscellaneus.Rand;

public class Esercizio4 {

	public static void main(String[] args) {
		float num1, num2;
		Rand r = new Rand();
		
		num1=r.flo();
		num2=r.flo();
		
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println("ris "+(num1/num2));

	}

}
