/*Fazer um programa para cálculo de um salário líquido de um
professor. Serão fornecidos valor da hora aula, número de aulas
dadas e o % de desconto do INSS.
Fórmula:
salario = valor da hora/aula * número de aulas dadas;
desconto = salario * inss /100;
salario_liquido = salario – desconto;*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio5_aula1 {

	public static void main(String[] args) {
		//variáveis
		int aulasDadas;
		float valorHoras, inss, salario, desc;

		//declarando novo objeto
		Scanner tec = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe valor da hora por aula aplicada: ");
		valorHoras = tec.nextFloat();
		
		System.out.println("Informe quantas aulas foram aplicadas: ");
		aulasDadas = tec.nextInt();
		
		System.out.println("Informe valor do INSS cobrado em porcentagem(%): ");
		inss = tec.nextFloat();
		
		//processamento
		salario = (valorHoras * aulasDadas);
		desc = salario * (inss / 100);
		
		//saída
		System.out.printf("salario final: R$%.2f%n", (salario - desc));
	
		//fechamento do objeto
		tec.close();
		
	}

}
