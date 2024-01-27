package lavorareConInumeri;
import miscellaneus.*;

public class Esercizio9 {

	public static void main(String[] args) {
		float num1, num2, num3, temp;
		Rand r=new Rand();
		
		num1=r.flo();
		num2=r.flo();
		num3=r.flo();
		
		temp=num1;
		
		if(num2<temp)
		{
			temp=num2;
		}
		else if (num3<temp)
		{
			temp=num3;
		}
		
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
		System.out.println("num2 "+num3);
		System.out.println("il minore è "+temp);

	}

}
