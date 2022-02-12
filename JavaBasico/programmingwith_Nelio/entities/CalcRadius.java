package entities;

public class CalcRadius
{
	/*Quando o membro é do tipo estático, 
	 * não precisa instanciar um objeto, 
	 * chamando os métodos pelo nome da classe pertencente*/
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius)	
	 	{
		return 2.0 * PI * radius;
		}
	
	public static double volume(double radius)
		{
		return (4.0 * PI) * (radius * radius * radius) / 3.0;
		}
}
