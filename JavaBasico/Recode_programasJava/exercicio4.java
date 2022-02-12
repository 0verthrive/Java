package Learning_programmingJava.Recode_programasJava;
/*Fazer um programa para que o usuário digite três números e o programa verifique 
quais números são iguais (podem ser iguais dois números ou os três). 
 * Exibir mensagem de quais números são iguais.*/

import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) 
	{
	// variável
		int n1 = 0, n2 = 0, n3 = 0;
	//entradas	
	Scanner tec = new Scanner(System.in);
	System.out.println("Informe 3 números");
	System.out.println("1/3: ");
	n1 = tec.nextInt();
	System.out.println("2/3: ");
	n2 = tec.nextInt();
	System.out.println("3/3: ");
	n3 = tec.nextInt();

	if((n1 == n2 && n1 == n3) || (n2 == n1 && n2 == n3)) 
	{
		System.out.println("Os números informados são iguais");
	}
	else if((n2 == n1 || n2 == n3) || (n3 == n1 || n3 == n2)) 
	{
		System.out.println("Há dois números iguais informados.");
	}
	else
	{
		System.out.print("Posição 1: "+ n1 +"\nPosição 2: "+ n2 +"\nPosição 3: "+ n3);
	}
	tec.close();
	}

}
