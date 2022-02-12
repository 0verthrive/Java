package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ComparingPrice {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
			
		System.out.println("What is the dollar price? ");
		CurrencyConverter.priceDollar = tec.nextDouble();
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.quantityToBuy = tec.nextDouble();		
		
		System.out.printf("Amount to be paid in reais = R$%.2f%n", CurrencyConverter.dollarOfReais());	
		
		tec.close();
	}

}
