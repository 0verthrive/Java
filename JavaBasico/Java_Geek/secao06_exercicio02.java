/*Elabore um algoritmo que lia um número. Se positivo armazene-o em 'a', se negativo em 'b'. 
 *Mostrar o resultado*/
package Learning_programmingJava.Java_Geek;

import java.util.Scanner;

public class secao06_exercicio02 {

	public static void main(String[] args) {
		int a, b, aux;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		aux = tec.nextInt();
		
		if(aux >= 0)
		{
			a = aux;
			System.out.println("Valor positivo: " + a);
		}
		else
		{
			b = aux;
			System.out.println("Valor negativo: " + b);
		}
		
		tec.close();
	}

}
