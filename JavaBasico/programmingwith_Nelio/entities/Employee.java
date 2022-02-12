package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double rate;
	public double percentege;
	double netSalary;
	
	public double updateSalary() 
	{
	netSalary = (grossSalary - rate);
		
	return netSalary;
	}
	public double dataReadjustment() 
	{
	 return netSalary += ((percentege * grossSalary)/100);
	}
	
	public String toString() 
	{
		return name
				+"\nGross salary: $"
				+String.format("%.2f%n", grossSalary)
				+"Net salary: $"
				+String.format("%.2f%n", updateSalary())
				+"total receivable: $"
				+String.format("%.2f", dataReadjustment());
	}	
}
