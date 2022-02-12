/*Fazer um programa para que o usuário informe uma temperatura em
graus Celsius e transforme em graus Fahrenheit. Exibir o resultado
da conversão.
Formula:
F = (9*C+160)/5*/

package Learning_programmingJava.Recode_programasJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio3_aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		double fahr, celsius;
		Scanner tec = new Scanner(System.in);
	
do 
{
	try 
	{
		System.out.println("Informe qual conversão você gostaria de realizar");
		System.out.println("1 - ªCelsius para Fahrenheit\n2 - Fahrenheit para ªCelsius\n0 - Encerrar o programa");
		opc = tec.nextInt();
		
		switch(opc) 
		{
			case 1 : 
			{
				System.out.println("Informe o valor em ªC: ");
				celsius = tec.nextDouble();
			
				fahr = (9 * celsius + 160) / 5;

				System.out.printf("Fahrenheit = %.2f%n\n", fahr);
			break;
			}
			case 2 : 
			{
				System.out.println("Informe o valor em F: ");
				fahr = tec.nextDouble();
			
				celsius = (fahr - 32) * 5 / 9;

				System.out.printf("ªCelsius = %.2f%n\n", celsius);
			break;
			}
			case 0 :
			{
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			default :
			{
				System.out.println("Opção inválida!\n");
			break;
			}
		}
	}
	catch (InputMismatchException ex)
	{
		System.err.print("Não permitido letras! Reinicie o programa!\n");
	}
} 
while(opc != 0);

		tec.close();	
	}

}
