package typeCasting;

public class Esercizio4 {
	public static void main(String[] args)
	{
		String numeroStringa="5";
		int numeroIntero;
		
		try
		{
			System.out.print(numeroIntero=Integer.parseInt(numeroStringa));
		}
		catch(NumberFormatException e)
		{
			System.err.println("inserimento errato");
			e.printStackTrace();/*aggiunge il percorso delle chiamate o meglio
			il percorso dello stack, quindi oltre al system.err viene aggiunto al
			messaggio anche il classico percorso dal metodo figlio al package*/ 
			
		}
	}
}
