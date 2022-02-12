/*	Desenvolver um programa para ler o código de:

	    uma peça 1, 
	    o número de peças 1, 
	    o valor unitário de cada peça 1, 
	    o código de uma peça 2, 
	    o número de peças 2 
	    o valor unitário de cada peça 2.   

	Calcule e mostre o valor a ser pago.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio_ead1 {
	public static void main(String [] args) {
		int cod1, cod2, qte1, qte2;
		float preco1, preco2, total;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o código da peça 1: ");
		cod1 = entrada.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		qte1 = entrada.nextInt();
		System.out.println("Digite o preço da peça 1: ");
		preco1 = entrada.nextFloat();
		
		System.out.println("Digite o código da peça 2: ");
		cod2 = entrada.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		qte2 = entrada.nextInt();
		System.out.println("Digite o preço da peça: ");
		preco2 = entrada.nextFloat();
		
		total = (preco1 * qte1) + (preco2 * qte2);

		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		entrada.close();
	}

}
