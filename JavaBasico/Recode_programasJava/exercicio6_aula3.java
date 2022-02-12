/*Fazer um programa para preencher uma matriz com informações numéricas.*/
package Learning_programmingJava.Recode_programasJava;
import java.util.Scanner;
public class exercicio6_aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [5][5];
		int i = 0, y = 0;
		try (Scanner tec = new Scanner(System.in)) {
			for(i = 0; i < 5; i++) 
			{
			System.out.println("Informe valores para i: "+matriz[y][i]);
			matriz[y][i] = tec.nextInt();
			}
			for(y = 0; y < 5; y++) 
			{
			System.out.println("Informe valores para i: "+matriz[y][i]);
			matriz[y][i] = tec.nextInt();
			}
			
					
			tec.close();
		}
	}

}
