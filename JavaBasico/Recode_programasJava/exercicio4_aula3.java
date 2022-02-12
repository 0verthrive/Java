/*Fazer um programa que repita a entrada de dados até que o número digitado seja igual
 ao número escolhido pelo sistema, que é o número 10.*/

package Learning_programmingJava.Recode_programasJava;
import java.util.Scanner;
public class exercicio4_aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe valores:");
		
		do 
		{
		num = tec.nextInt();
			if(num == 10) 
			{
				System.out.println("Programa encerrado!");
			}
			else 
			{
			System.out.println("Informe outro número: ");
			}
		}
		while(num != 10);
		tec.close();
	}

}
