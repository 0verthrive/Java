package Learning_programmingJava.Recode_programasJava.Ead;

import java.util.Scanner;

public class Exercicio_monitoria_vetor {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		double[] nota = new double [5];
		String[] aluno = new String[5];
		String nome = null;
		double media = 0, maior = 0;
		int posicaoDaMaiorNota = 0, cont = 0;

		for(int i = 0; i < 5; i++) {
		System.out.println("Dig. o nome do "+(i+1)+"ª aluno ");
		aluno[i] = tec.next();	
		System.out.println("Dig. a nota na posição "+(i+1));
		nota[i] = tec.nextDouble();
		media = media + nota[i];

		if(nota[i] > maior)
		{
		maior = nota[i];
		nome = aluno[i];
		posicaoDaMaiorNota = i+1;
		}
		}

		media = media / nota.length;

		for(int i = 0; i < 5; i++)
		{
		if(nota[i] >= media) {
		cont++;
		}
		}
		System.out.printf("Média da turma: %.1f%n", media);
		System.out.println("Temos "+ cont +" pessoas acima da média");
		
		for(int y = 0; y < nota.length; y++) 
		{
		if(nota[y] >= media) {
		System.out.printf("%s com a nota: %.1f%n", aluno[y], nota[y]);
		}	
		}
		
		System.out.printf("A maior nota: %.1f do aluno %s%n", maior, nome);
		System.out.println(posicaoDaMaiorNota+"º nota informada");

		tec.close();
	}

}
