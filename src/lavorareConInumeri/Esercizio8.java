package lavorareConInumeri;
import miscellaneus.*;

public class Esercizio8 {

	public static void main(String[] args) {
		int num1, num2;
		Rand r = new Rand(10);
		
		num1=r.intero();
		num2=r.intero();
		
		if(num1>num2)
		{
			System.out.println(num1+" è maggiore di "+ num2);
		}
		else if(num1<num2)
			System.out.println(num1+" è minore di "+ num2);
		else
			System.out.println(num1+" e "+ num2+" sono uguali");
	}

}
