package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");
		x.a = tec.nextDouble();
		x.b = tec.nextDouble();
		x.c = tec.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = tec.nextDouble();
		y.b = tec.nextDouble();
		y.c = tec.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
		System.out.println("Larger area: X");
		}
		else {
		System.out.println("Larger area: Y");
		}
		
		tec.close();
	}

}
