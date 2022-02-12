/*Faça um algoritmo que converta metros para centímetros*/

package Learning_programmingJava.Java_Geek;

import java.util.Scanner;

public class secao03_exercicio05 {

	public static void main(String[] args) {
		int opc;
		double cm, m;
		Scanner tec = new Scanner (System.in);
		
	do {	
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Conversão centímetro para metros");
		System.out.println("2 - Conversão metros para centímetros");
		System.out.println("0 - Encerrar o programa");
		opc = tec.nextInt();
		
		if(opc != 0)
		{		
		switch(opc) 
		{
			case 1 : 
			{
				System.out.println("Informe o valor em cm: ");
				cm = tec.nextInt();
				
				m = cm/100;
				System.out.println("Valor em m = "+ m +"m");
			break;	
			}
			case 2 : 
			{
				System.out.println("Informe o valor em m: ");
				m = tec.nextInt();
				
				cm = m*100;
				System.out.println("Valor em cm = "+ cm +"cm");			
			break;
			}
			case 0 : 
			{
				System.out.println("Programa encerrado");
				System.exit(0);
			break;
			}
			default :
			{
			System.err.print("valor inválido, tente novamente");
			break;
			}
		 }
		}

	  }
	while(opc != 0);
		tec.close();
	}

}
