package Learning_programmingJava.Recode_programasJava.Ead;


public class animal 
{
	//atributos
	int quant = 0;
	String[] nome = new String[10];
	String[] tipo = new String[10];
	
	//métodos
	void dadosanimal() 
	{
		System.out.println(quant+" pets");
		for(int i = 0; i < quant; i++) 
		{
			switch (tipo[i]) 
			{
			case "gato" :
			{
			if(quant > 1) 
			{
				System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);
			}
			else if(quant == 1) 
			{
				System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);	
			}
			break;	
			}
			case "gata" :
			{
			if(quant > 1) 
			{
				System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);
			}
			else if(quant == 1) 
			{
				System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);	
			}
			break;	
			}
			case "cachorro" :
			{			
				if(quant > 1) 
				{
					System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);
				}
				else if(quant == 1) 
				{
					System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);	
				}
			break;	
			}
			case "cachorra" :
			{			
				if(quant > 1) 
				{
					System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);
				}
				else if(quant == 1) 
				{
					System.out.printf("%dº pet %s é do tipo %s\n", (i+1), nome[i], tipo[i]);	
				}
			break;				
			}
			default :
			{			
				if(quant > 1) 
				{
					System.out.printf("%dº pet %s é do tipo peixe\n", (i+1), nome[i]);
				}
				else if(quant == 1) 
				{
					System.out.printf("%dº pet %s é do tipo peixe\n", (i+1), nome[i]);	
				}
				else 
				{
					System.out.println("Adote um bichinho e seja mais feliz!");
				}
			break;
			}
			}
		
		}
	}
}
