/*Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Homens: (72,7 * altura) - 58
Mulheres: (62,1 * altura) - 44,7 */

package Learning_programmingJava.Java_Geek;


import java.util.Scanner;

public class secao06_exercicio04 {

	public static void main(String[] args) {
		
		double altura, recomendado;
		char sexo;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = tec.nextDouble();
		System.out.println("Você é do sexo:\nF - feminino\nM - masculino");
		sexo = tec.next().charAt(0);
		
		if(sexo == 'F' || sexo == 'f') 
		{
			recomendado = (62.1 * altura) - 44.7;
			System.out.printf("O peso recomendado é: %.1fkg", recomendado);
		}
		else if(sexo == 'M' || sexo == 'm') 
		{
			recomendado = (72.7 * altura) - 58;
			System.out.printf("O peso recomendado é: %.1fkg", recomendado);
		}
		else 
		{
			System.err.print("Argumento inválido, reinicie!");
		}
		
		tec.close();
	}

}
