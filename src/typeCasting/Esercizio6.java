package typeCasting;

public class Esercizio6 {
	public static void main(String[] args)
	{
		long numeroLungo=125485598778l;
		int numeroIntero;
		
		numeroIntero=(int) numeroLungo;//si rompe per overflow
		
		System.out.println(numeroIntero);
	}
}
