/*
 * 🍰 Esercizio 7
	Scrivi un programma Java che estrae una sottostringa da una stringa.
 * 
 * */package lavorareConLeStringhe;

public class Esercizio7 {
	public static void main(String[] args)
	{
		String s="con java si può programmare in molti ambiti", sotto;
		
		sotto=s.substring(8, 15);
		
		System.out.print(sotto);
	}	
}
