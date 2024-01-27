package lavorareConInumeri;
import miscellaneus.*;
import java.math.*;

public class Esercizio6 {

	public static void main(String[] args) {
		int num1;
		Rand r = new Rand(10);
		
		num1=r.intero();
		
		System.out.println("num1 "+num1);
		System.out.print(num1+" elevato alla 5 fa "+(Math.pow(num1, 5)));
	}

}
