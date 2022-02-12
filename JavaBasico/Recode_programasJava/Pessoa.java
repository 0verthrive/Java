package Learning_programmingJava.Recode_programasJava;

public class Pessoa {
	
	int idade;
	
	void votar() 
	{
		if(idade >= 18) 
		{
			System.out.println("Obrigatório sua votação!");
		}
		else if(idade >= 16) {
			System.out.println("Votação opcional!");
		}
		else {
			System.out.println("com "+idade+" ainda não se pode votar, daqui "+(18-idade)+"anos você poderá");
		}
	}
	
	
}

