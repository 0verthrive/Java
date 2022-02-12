/*Fazer um programa para preencher uma matriz de duas linhas e 3 colunas. 
 *O usuário deverá digitar um número e será preciso verificar se aquele 
número existe em alguma posição da matriz.*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio4_listaAula3 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int aux, i, y;
		int[][] matriz = new int[2][3];
		int contador = 0;
		int[] repetidos = new int[6];
		boolean repetido = false;

		for (i = 0; i < 2; i++) {

			for (y = 0; y < 3; y++) {
				System.out.println("Entre com o valor da matriz[" + i + "][" + y + "]");
				repetido = false;
				aux = tec.nextInt();

				for (int l = 0; l < 2; l++) {

					for (int z = 0; z < 3; z++) {
						if (aux == matriz[l][z]) {
							repetido = true;
							repetidos[contador] = aux;
							contador++;
						}

					}
				}
				if (repetido == false) {
					matriz[i][y] = aux;
				}
			}
		}
		for (i = 0; i < 2; i++) {
			for (y = 0; y < 3; y++) {
				System.out.print("\n" + matriz[i][y]);
				if (matriz[i][y] == 0) {
					System.out.print(" ==> Valor repetido, portanto zerado.");
				}
			}
		}
		for (i = 0; i < contador; i++) {
			System.out.println("\nO valor [" + repetidos[i] + "] se repetiu na matriz.");
		}
	}
}