/*Desenvolva um programa no qual o usuário deverá informar o nome e o tipo de três animais de estimação.
 *O programa deverá exibir na tela para o usuário quantos Animais foram informados e seus tipos.
 *Regras que deverão ser seguidas para a implementação do código: 

•Os únicos tipos de animais válidos são Cachorro, Gato, Peixe. 

•Caso seja informado um tipo diferente o programa deverá definir o tipo do animal como Peixe. 

•É obrigatório criar uma classe para representar o Animal. 

•A classe deverá possuir dois dados privados (propriedades) para representar as características do animal. 

•A classe deverá possuir métodos de acesso para permitir que o usuário armazene/leia os dados dos dois dados privados (propriedades). s*/

package Learning_programmingJava.Recode_programasJava.Ead;

import java.util.Scanner;

public class exercicio4_fundamentosJava {

	public static void main(String[] args) {
		String nome, tipo;
		animal pet = new animal();
		Scanner tec = new Scanner(System.in);
		

		System.out.println("Informe quantidade de pets você tem: ");
		pet.quant = tec.nextInt();
		
		for(int i = 0; i < pet.quant; i++) {
		System.out.println("Nome do pet "+(i+1)+"/"+pet.quant);
		nome = tec.next();
		pet.nome[i] = nome;
		
		System.out.println("Tipo de pet "+(i+1)+"/"+pet.quant);
		tipo = tec.next();
		pet.tipo[i] = tipo;
		}
			
		pet.dadosanimal();
		
		tec.close();
	}

}
