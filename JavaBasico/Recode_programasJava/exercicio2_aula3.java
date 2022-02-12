/*Fça um programa que leia 10 números sequenciais de trás para frente*/
package Learning_programmingJava.Recode_programasJava;
import java.util.Scanner;
public class exercicio2_aula3 {

	public static void main(String[] args) {
		// variável
		int i = 0; 
		int vet[]=new int[10];
		
		try (Scanner tec = new Scanner(System.in)) {
			for(i = 0; i < 10; i++) 
			{
				vet[i] = tec.nextInt();
			}
			for(i = 9; i >= 0; i--)
			{
				System.out.println("valor = "+ vet[i]);
			}
			tec.close();
		}
		
	}

}
