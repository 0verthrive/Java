/*Faça um algoritmo que peça dois números e imprima a soma.*/
package Learning_programmingJava.Java_Geek;

import java.util.Scanner;

public class secao03_exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, soma;
		Scanner tec = new Scanner(System.in);
		
		A = tec.nextInt();
		B = tec.nextInt();
		
		soma = A + B;
		
		System.out.println(soma);
		tec.close();
	}

}
