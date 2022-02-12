package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcRadius;

public class radiusSecondVersion 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
/*Quando o membro é do tipo estático, 
 * não precisa instanciar um objeto, 
 * chamando os métodos pelo nome da classe pertencente
 * nesse caso a classe CalcRadius.*/
		
		System.out.print("Enter radius: ");
		double radius = tec.nextDouble();
		double c = CalcRadius.circumference(radius);
		double v = CalcRadius.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalcRadius.PI);

		tec.close();
	}

}
