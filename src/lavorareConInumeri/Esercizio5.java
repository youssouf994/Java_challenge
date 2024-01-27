package lavorareConInumeri;
import miscellaneus.*;

public class Esercizio5 {

	public static void main(String[] args) {
		Rand r = new Rand();
		
		int num1=r.intero();
		int num2=r.intero();
		
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println("ris "+(num1%num2));
	}

}
