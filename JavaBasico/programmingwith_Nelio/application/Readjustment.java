package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Readjustment {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner tec = new Scanner(System.in);
	Employee emp = new Employee();
	
	
	System.out.println("Enter your name: ");
	emp.name = tec.nextLine();
	System.out.println("Enter your gross salary: ");
	emp.grossSalary = tec.nextDouble();	
	System.out.println("Enter the monthly discount amount: ");
	emp.rate = tec.nextDouble();
	System.out.println("Enter the percentege of increase: ");
	emp.percentege = tec.nextDouble();
	
	System.out.println(emp);
	
	tec.close();		
	}
}
