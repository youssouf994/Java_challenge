package miscellaneus;

import java.util.Random;


public class Rand 
{
	private int generatoInt;
	private double generatoDoub;
	private float generatoFloat;
	private Random rand= new Random(); 
	private Integer limite=null;
	
	public Rand()
	{
		
	}
	
	public Rand(int limite)
	{
		this.limite=limite;
	}
	
	public int intero()
	{
		if(limite==null)
			generatoInt=rand.nextInt(1000);
		else
			generatoInt=rand.nextInt(limite);
		
		return generatoInt;
	}
	
	public double doubble()
	{
		if(limite==null)
			generatoDoub=rand.nextDouble(1000);
		else
			generatoInt=rand.nextInt(limite);
		
		return generatoDoub;
	}
	
	public float flo()
	{
		generatoFloat=rand.nextFloat(1000);
		return generatoFloat;
	}
	
	public int intNeg()
	{
		generatoInt=rand.nextInt(1000-(-1000)+1)+(-1000);
		return generatoInt;
	}
	
	public double doubNeg()
	{
		generatoDoub=rand.nextDouble(1000-(-1000)+1)+(-1000);
		return generatoDoub;
	}
}
