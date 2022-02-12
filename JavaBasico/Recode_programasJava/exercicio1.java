package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio1 
{

	public static void main(String[] args)
	{
		int idade;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		idade = tec.nextInt();
		
		if(idade > 20) 
		{
			System.out.println("Você está apto para a doação de sangue.");
		}
		else 
		{
			System.out.println("Idade permitida apenas a partir de 20 anos, volte para casa!");
		}
		tec.close();
	}

}
