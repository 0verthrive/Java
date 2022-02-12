package Learning_programmingJava.Recode_programasJava.Ead;

import java.util.Scanner;

public class info{
	public static void main(String[]args) {
int quantidadeNotas = 5, nota = 0, soma = 0;
float media = 0;
Scanner tec = new Scanner(System.in);

for(int i = 0; i < quantidadeNotas; i++)
{
	nota = tec.nextInt();
	soma = soma + nota;
}
media = soma / 5f;
if(media > 6)
{
	System.out.println("media "+media+" Aprovado");
}
else
{
	System.out.println("media "+media+" reprovado");
}
System.out.println("A = "+soma+" M = "+media);

tec.close();

	}
	}