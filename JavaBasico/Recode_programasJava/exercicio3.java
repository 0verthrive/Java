/*Fazer um programa para que o usuário digite um número e o programa verifique se os números 
estão entre o intervalo de valores de 10 e 20. 
 * Exibir mensagem se está ou não entre o intervalo de valores. */

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	//variáveis
		int num;
		Scanner tec = new Scanner(System.in);
	//entradas
		System.out.println("Informe um número: ");
		num = tec.nextInt();
		
		if(num > 10 && num < 20) 
			System.out.println("Número entre 10 e 20!");
		else if (num > 20) 
		{
			System.out.println("Número maior que 20!");
		}
			else 
		{
			System.out.println("Número abaixo de 10!");
		}
		tec.close();
	}

}
