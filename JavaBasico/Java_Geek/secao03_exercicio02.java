/*Faça um algoritmo para "calcular o estoque médio de uma peça", sendo que:
estoque_medio = (quantidade_minima + quantidade_maxima)/2*/
package Learning_programmingJava.Java_Geek;

import java.util.Scanner;

public class secao03_exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int quantMinima, quantMaxima;
		double media = 0;
		String nome;
		
		System.out.println("Nome: ");
		nome = entrada.next();
		
		System.out.println("Qual a quantidade mínima do estoque: ");
		quantMinima = entrada.nextInt();
		System.out.println("Qual a quantidade mínima do estoque: ");
		quantMaxima = entrada.nextInt();
		
		media = (quantMinima + quantMaxima) / 2;
		
		System.out.println(""+ nome +" a média em estoque é: "+ media);
		
		entrada.close();
	}

}
