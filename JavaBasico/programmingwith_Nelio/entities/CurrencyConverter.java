package entities;

public class CurrencyConverter {
	public static double priceDollar;
	public static double quantityToBuy;
	public static final double IOF = 0.6;
	
	
	public static double dollarOfReais() 
	{
		return (priceDollar * quantityToBuy)*IOF;
	}
	
	
	
}
