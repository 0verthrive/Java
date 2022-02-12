/*Fazer um programa para calcular a área de um retângulo. 
A fórmula é: area = base * altura.
Os valores devem ser digitados pelo usuário, bem como deve ser
informado o que ele irá digitar.*/
package Learning_programmingJava.Recode_programasJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio1_aula1 {

	public static void main(String[] args) {
		//Declaração de variáveis e objeto
		int area, base, altura;
		Scanner tec = new Scanner(System.in);	
		
		try 
		{
		//Entradas de dados
			System.out.println("Informe o valor da base: ");
			base = tec.nextInt();
			System.out.println("Informe o valor da altura: ");
			altura = tec.nextInt();		
		//Processamento
			area = base * altura;
		
		//Saída de dados
			System.out.println("O valor da área do retângulo é: "+ area);
		}
		catch (InputMismatchException ex) 
		{
			System.err.println("Não aceita letras, reinicie o programa e tente novamente."+ ex.getMessage());
		}
	
		//fechamento do objeto Scanner
		tec.close();
	}

}
