/*Fazer um programa para preencher um array com informações numéricas.*/
package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio5_aula3 {
	public static void main(String[] args) throws Exception 
	{
		//variáveis
		int vet[] = new int [5];
		Scanner tec = new Scanner(System.in);
		//entrada
		System.out.println("informe 5 valores: ");
		for(int i = 0; i <5; i++) 
		{
			System.out.print(""+(i+1)+"/5: \n");
			vet[i] = tec.nextInt();
			vet[i] = i;
		}
		for(int i = 0; i <= 5; i++) {
		System.out.println("O valor na posição "+(i+1)+"/5 é: "+vet[i]);
		}
		
		tec.close();
	}
}
