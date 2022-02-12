
/*Fazer um programa para preencher dois vetores de 5 posições cada com números quaisquer.
 *Na sequência, verificar quais número do primeiro vetor existem no segundo e informar 
no final do programa quantos números foram encontrados.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio2_listaAula3 {

	public static void main(String[] args) {
		// variaveis
		int soma = 0;
		int [] vetor1 = new int [5];
		int [] vetor2 = new int [5];
		Scanner tec = new Scanner(System.in);

		System.out.println("Preenchimento do primeiro vetor");
		for(int um = 0; um < vetor1.length; um++) 
		{
			System.out.println((um+1)+"/5: ");	
			vetor1[um] = tec.nextInt();
			
		}
		
		System.out.println("Preenchimento do segundo vetor");
		for(int dois = 0; dois < vetor2.length; dois++) 
		{
			System.out.println((dois+1)+"/5: ");
			vetor2[dois] = tec.nextInt();
				
		}	
	
		for(int um = 0; um < vetor1.length; um++) 
		{			
			for(int dois = 0; dois< vetor2.length; dois++) 
			{
				if(vetor1[um] == vetor2[dois]) 
				{
					soma += 1;
				}
			}
		}
		System.out.println("Foram encontrados "+ soma +" números iguais");
	
		tec.close();
	}

}
