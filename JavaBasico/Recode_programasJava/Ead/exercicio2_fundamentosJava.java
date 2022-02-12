/*Desenvolva um código em Java que comece com a declaração de duas 
variáveis do tipo double, “acumulador” e “media”.
 *Em “acumulador” deverá ser atribuída a soma de três notas que 
 serão digitadas pelo usuário, usando uma instância da classe Scanner.
 *O código deverá gerar a média das notas e depois, usando a condicional if,
 o programa precisa verificar em que faixa o aluno ficou e imprimir
 no console a mensagem de acordo com a tabela abaixo: 
 “media” acima de 6 – “APROVADO DIRETO”; 
 “media” entre 5 e 6, incluindo 5 e 6 - “APROVADO COM RECUPERAÇÃO”; 
 "media” abaixo de 5 – “REPROVADO”; */
package Learning_programmingJava.Recode_programasJava.Ead;

import java.util.Scanner;

public class exercicio2_fundamentosJava {

	public static void main(String[] args) {
		double soma = 0, media, notas;
		
		Scanner tec = new Scanner (System.in);
		
		for(int i = 0; i < 3; i++) 
		{
			System.out.println("Nota "+(i+1)+"/3: ");
			notas = tec.nextDouble();
			soma += notas;
		}
		media = soma/3f;

		System.out.printf("Soma das notas: "+soma+"\nMédia: %.1f%n", media);
		if(media > 6) 
		{
			System.out.println("PARABÉNS, APROVADO DIRETO!!");
		}
		else if(media >= 5 && media <= 6) 
		{
			System.out.println("APROVADO COM RECUPERAÇÃO");
		}
		else 
		{
			System.out.println("REPROVADO!");
		}
		tec.close();
	}

}
