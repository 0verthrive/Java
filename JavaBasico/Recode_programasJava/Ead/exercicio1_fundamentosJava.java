/*Usando fundamentos básicos e de operadores relacionais da linguagem Java, 
 desenvolva um código com duas variáveis: String “nome”, 
 int “idade” e atribua valores à essas variáveis. 
 * Agora, utilizando a função System.out.print(), imprima o conteúdo de “nome”,
 junto com o resultado da verificação: “idade” maior ou igual 18 – true. 
 “idade” menor que 18 – false.*/

package Learning_programmingJava.Recode_programasJava.Ead;



public class exercicio1_fundamentosJava {

	public static void main(String[] args) {
		String nome = "Laura";
		int idade = 15;
		
		if(idade < 18) {
			System.out.println(nome +" você tem "+idade+" anos, ainda é menor de idade.");
		}
		else 
		{
			System.out.println(nome +" você tem "+idade+" anos, já considerada maior de idade.");
		}

	}

}
