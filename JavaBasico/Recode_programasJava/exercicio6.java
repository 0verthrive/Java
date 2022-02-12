/*Fazer um programa para que o usuário digite um número e o programa verifique se o número é múltiplo 
de 2 ou de 5 ou de 10.
 * Exibir mensagem de erro caso o número digitado não seja múltiplo de nenhum destes. 
 * O programa não poderá permitir que o número zero seja digitado, nem negativo e nem maior do que 100.*/


package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio6
{
	public static void main(String[] args) 
	{
	//variáveis
	int num;
	Scanner tec = new Scanner(System.in);
	
	//entrada
	System.out.println("Informe um número: ");
	num = tec.nextInt();
	if(num == 0)
	{
		System.out.println("Não permitido valor 0");
	}
	else if(num < 0)
	{
		System.out.println("Não permitido valores negativos");
	}
	else
	{
		if(num % 2 == 0) 
		{
			System.out.println("Número múltiplo de 2");
			if(num % 5 == 0 && num % 10 ==0) 
			{
				System.out.println("Número múltiplo de 2, de 5 e de 10");
			} else if(num % 5 == 0) 
			{
				System.out.println("Número múltiplo de 5 também");
			} else if(num % 10 == 0) 
			{
				System.out.println("Número múltiplo de 10 também");
			}
		}
		else if(num % 5 == 0) 
		{
			System.out.println("número múltiplo de 5");
			if(num % 10 == 0) 
			{
				System.out.println("Número múltiplo de 5 e de 10");
			}
		}
		else if(num % 10 == 0) 
		{
			System.out.println("Numero múltiplo de 10");
		}
		else 
		{
			System.out.println("Não é múltiplo nem de 2, nem de 5 e nem de 10");
		}
	}
	
	tec.close();
	}
}
