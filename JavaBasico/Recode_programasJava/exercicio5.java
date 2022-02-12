/* Fazer um programa para que o usuário digite três números e o programa deverá  
verificar qual é o número do meio. 
 * Exibir mensagem com o número. 
 * O programa não poderá aceitar valor zero para nenhum dos três números.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio5 
{

	public static void main(String[] args) 
	{
	// variáveis
	float n1, n2, n3;
	int i = 0;
	Scanner tec = new Scanner(System.in);
	
	//entradas
	System.out.println("Informe um número "+ (i+1) +"/3");
	n1 = tec.nextFloat();
	System.out.println("Informe um número "+ (i+1) +"/3");
	n2 = tec.nextFloat();
	System.out.println("Informe um número "+ (i+1) +"/3");
	n3 = tec.nextFloat();
	
	if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3)
	{
		System.out.println("O valor "+ n1 +" se encontra entre os números "+ n2 +" e \n"+ n3);	
	}
	else if(n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3)
	{
		System.out.println("O valor "+ n2 +" se encontra entre os números "+ n1 +" e \n"+ n3);
	}
	else
	{
		System.out.println("O valor "+ n3 +" se encontra entre os números "+ n1 +" e \n"+ n2);
	}
	
	tec.close();
	}

}
