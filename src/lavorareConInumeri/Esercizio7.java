package lavorareConInumeri;
import miscellaneus.*;
import java.math.*;

public class Esercizio7 {

	public static void main(String[] args) {
		double num1;
		
		Rand r = new Rand();
		
		num1=r.doubble();
		
		System.out.println("num1 "+num1);
		System.out.print("la radice quadrata di "+num1+" è "+(Math.sqrt(num1)));
	}

}
