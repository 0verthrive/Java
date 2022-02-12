/*Faça um programa para que o usuário possa escolher uma operação aritmética e realizar o devido cálculo.*/
package Learning_programmingJava.Recode_programasJava;
import java.io.IOException;
import java.util.Scanner;
public class exercicio1_aula3 {

	public static void main(String[] args) throws IOException {
		// variáveis
		int num1, num2, result;
		char opc[] = new char[2];
		Scanner tec = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o primeiro número");
		num1 = tec.nextInt();
		System.out.println("A operação que deseja realizar(+, -, * ou /): ");
		opc[0] = (char)System.in.read();
		System.out.println("Informe o primeiro número");
		num2 = tec.nextInt();		
	
	switch(opc[0]) 
	{
	case '+' : 
	{
		result = num1 + num2;
		System.out.println("Resultado da soma é: "+result);
		break;
	}
	case '-' : 
	{
		result = num1 - num2;
		System.out.println("Resultado da subtração é: "+result);
		break;
	}
	case '*' : 
	{
		result = num1 * num2;
		System.out.println("Resultado da multiplicação é: "+result);
	break;
	}
	case '/' : 
	{
		if(num1 == 0 || num2 == 0) {
			System.out.println("Não há divisão por 0!");
		}
		result = num1 / num2;
		System.out.println("Resultado da divisão é: "+result);
	break;
	}	
	}
	tec.close();
	
	}

}
