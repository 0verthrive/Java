/*Vamos criar um código Java que converta o total de uma compra internacional em dólares
(US$) para reais (R$).
 *Inicie duas variáveis double “soma” e “total”, depois inicie uma variável chamada 
 quantidade do tipo int, essa variável vai receber a quantidade de produtos comprados.
 * Declare um Array(Vetor) que irá receber os valores em dólares das mercadorias,
 e armazenar a somatória das mercadorias na variável soma, A variável “total” deve 
 receber o valor de “soma” convertido para reais (US$ 1,00 = R$ 5,18.).
 *Inicie uma variável String “mensagem” e atribua um valor de acordo com o resultado
 da verificação usando o operador ternário seguindo os condições:
 * “total” maior que R$ 3000,00 – “Pagará 20% de imposto”. 
 * “total” menor ou igual a R$ 3000,00 – “Isento de imposto”. 
 * Imprima no console o valor “total” da compra junto com a “mensagem”. */
package Learning_programmingJava.Recode_programasJava.Ead;

import java.util.Scanner;

public class exercicio3_fundamentosJava {

	public static void main(String[] args) {
		double soma = 0, total = 0;
		int quant;
		double[] conversor = new double[50];
		String mensagem = "Isento de imposto";
		Scanner tec = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos comprados: ");
		quant = tec.nextInt();

		for (int i = 0; i < quant; i++) 
		{
			System.out.println("valor " + (i + 1) + "/" + quant + ":");
			conversor[i] = tec.nextDouble();
			soma += conversor[i];
		}
			total = soma * 5.18;
		
		if (total > 3000) 
		{
			System.out.println("Excedeu o limite de 3.000 reais, pagará 20% de imposto");
			System.out.printf("Valor imposto: R$%.2f%n", (total * 0.2));
			System.out.printf("Total a pagar: R$%.2f%n", (total + (total * 0.2)));
		}
		else
		{
			System.out.printf("total: R$%.2f\n%s", total, mensagem);
		}
		tec.close();
	}

}
