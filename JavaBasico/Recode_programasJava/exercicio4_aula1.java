/*Fazer um programa para calcular o consumo de um veículo conforme
os dados informado no teclado: horas, velocidade média.
Fórmulas:
distancia = tempo * velmedia;
consumo = distancia / 12;*/

package Learning_programmingJava.Recode_programasJava;

import java.util.Scanner;

public class exercicio4_aula1 {

	public static void main(String[] args) {
		// variáveis
		double temp, mediaV, dist, consumo;
		
		//declaração de novo objeto
		Scanner tec = new Scanner (System.in);
		
		//entradas
		System.out.println("Informe o tempo percorrido: ");
		temp = tec.nextDouble();
		System.out.println("Informe a velocidade km/h: ");
		mediaV = tec.nextDouble();
		
		//processamento
		dist = temp * mediaV;
		consumo = dist / 12;
		
		//saída
		System.out.printf("Distância = %.2fkm/h\nConsumo = %.2fL", dist, consumo);
		
		//fechamento do objeto
		tec.close();
	}

}
