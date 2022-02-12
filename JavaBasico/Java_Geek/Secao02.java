package Learning_programmingJava.Java_Geek;
// import é o include no Java
import java.util.Scanner;

/* Faça um algoritmo para somar dois números e multiplicar o resultado pelo primeiro número.*/

public class Secao02 {

	public static void main(String[] args) {
		// Variáveis
		int num1, num2, soma, mult;
		// Scanner é o scanf no Java
		Scanner tec = new Scanner(System.in);
		
		// Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = tec.nextInt();		
		System.out.println("Informe o segundo número: ");
		num2 = tec.nextInt();
		
		soma = num1 + num2;
		mult = soma * num1;
		System.out.println("Resultado da multiplicação é: "+ mult);
		
		tec.close();
	}

}
