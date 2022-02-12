package Model;

public class Employee {
	private String name;
	private Integer registration;
	private Double grossSalary;
	
	public Employee () {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getNetSalary() {
		double total;
		total = grossSalary - (grossSalary * 0.11);
		
		return total;
	}
	
	
}
