/*Fazer um programa para exibir o saldo com reajuste de 1%. 
 *O usuário deverá informar via teclado o valor do saldo.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio2_aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saldo;
		double reajuste;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe o saldo: ");
		saldo = tec.nextInt();
		
		reajuste = saldo + (saldo * 0.01);
		
		System.out.printf("O saldo atualizado é: %.2f%n", reajuste);
		
		tec.close();
	}

}
