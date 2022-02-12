/*Fazer um programa para que o usuário informe um número e a tabuada 
daquele valor seja calculada e exibida na tela. 
 *As multiplicações começam no valor 1 até o valor 10. 
 *O número informado pelo usuário não pode ser zero e nem negativo. 
 *Exemplo: 2 x 1 = 2*/
package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio3_listaAula3 {

	private static Scanner tec;

	public static void main(String[] args) {
		// variável
		int [] tabuada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int mult = 0, numero;
		
		tec = new Scanner (System.in);
	do 
	{
		System.out.println("Qual tabuada deseja ver? ");
		numero = tec.nextInt();
		if(numero <= 0) 
		{
			System.err.println("Não permitido valores menores ou iguais a zero, tente novamente!\n");
		}
	}
	while(numero <= 0);
	
		for(mult = 0; mult < tabuada.length; mult++) 
		{
			System.out.println(" "+(numero * tabuada[mult]));
		}
		
		tec.close();

	}

}
