/*Fazer um programa para preencher um vetor de 10 posições. 
 *O vetor só poderá receber números pares.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio1_listaAula3 {

	public static void main(String[] args) {
		// variáveis
		int p;
		int [] pares = new int [10];
		try (Scanner tec = new Scanner(System.in)) {
			for(p = 0; p < pares.length; p++) 
			{
				System.out.println((p+1)+"/10");
				pares[p] = tec.nextInt();
				if(pares[p] % 2 != 0) 
				{
					p--;
				}
			}
			for(p = 0; p < pares.length; p++) 
			{		
			System.out.println("Vetor na posição "+ (p+1) +"/10: "+ pares[p]);		
			}
			
			tec.close();
		}

	}

}
