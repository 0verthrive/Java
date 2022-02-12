/*Tendo como dados de entrada a altura de uma pessoa construa um algoritmo que 
calcule seu peso ideal, usando a seguinte fórmula: (72.7 * altura)+58*/
package Learning_programmingJava.Java_Geek;

import java.util.Scanner;

public class secao03_exercicio07 {

	public static void main(String[] args) {
		double altura, recomendado;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = tec.nextDouble();
		

		recomendado = (72.7 * altura) - 58;
		
		System.out.printf("Para sua altura, recomenda-se o peso: %.2fkg", recomendado);
		
		tec.close();
	}

}
