package Learning_programmingJava.Recode_programasJava;
/*Faça um programa onde o usuário irá digitar um inteiro e exiba se o número é par ou ímpar.
*Se for par, o número deverá ser multiplicado por 4 e a informação deverá ser exibida. */
import java.util.Scanner;

public class exercicio2 
{
	public static void main(String[] args) 
	{
		int num, aux;
		Scanner tec = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		num = tec.nextInt();
		
		if(num % 2 == 0)
		{
		 aux = num * 4;	
		System.out.println("Número "+ num +" informado é par e vezes 4 fica: "+aux);
		}
		else
			System.out.println("Número "+ num +" informado é par");
		
		tec.close();
	}

}
