package entities;

public class Student {
	public String name;
	public double firstTrimester;
	public double secondTrimester;
	public double thirdQuater;
	public double mean;
	public String result = null;
	
	public double failedOrPass() 
	{
		mean = (firstTrimester + secondTrimester + thirdQuater);
		return mean;
	}
	public String resultFinal()
	{
		if(mean > 60) {
			result = "Approved";
		}
		else {
			result = "Desapproved";
		}
		return result;
	}
	public String toString() 
	{
		return name
				+"\nMean: "
				+ String.format("%.2f%n", failedOrPass())
				+"Result: "
				+String.format("%s", resultFinal());
	}
}
