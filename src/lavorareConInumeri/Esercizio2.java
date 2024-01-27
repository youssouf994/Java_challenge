package lavorareConInumeri;
import miscellaneus.Rand;

public class Esercizio2 {
	public static void main(String[] args)
	{
		double num1, num2;
		Rand r =new Rand();
		
		num1=r.doubble();
		num2=r.doubble();
		
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println("ris "+(num1-num2));
	}
}
