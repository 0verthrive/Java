package firstProjectRecode;

import java.util.Scanner;

public class Traveler {
	private int cod;
	private String loginCPF;
	private String name;
	private String email;
	private String cellPhone;
	private int day;
	private int month;
	private int year;
	Scanner tec = new Scanner(System.in);
	
	TravelPlans plan;
	
	public Traveler() {}

	public int getCod(int cod) {
		this.cod = plan.getCod();
		return this.cod;
	}
	public String getLoginCPF(String CPF1) {
		String aux1 = CPF1.substring(7);
		loginCPF = aux1;
		
		return loginCPF;
	}

	public String getName(String name1) {
		name = name1;
		return name;
	}


	public String getEmail(String email1) {
		email = email1;
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellPhone(String cellPhone1) {
		cellPhone = cellPhone1;
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}


	public void registration() {
		System.out.println("Let's start your registration in a few simple steps. Let's go!");
		tec.nextLine();
		System.out.println("Enter your name: ");
		name = tec.nextLine();
		System.out.println("Enter your CPF: ");
		loginCPF = tec.nextLine();
		System.out.println("Enter your e-mail: ");
		email = tec.nextLine();
		System.out.println("Enter your cell phone: ");
		cellPhone = tec.nextLine();
		System.out.println("Enter your birth date: ");
		day = tec.nextInt();
		month = tec.nextInt();
		year = tec.nextInt();
		
		System.out.println("Registration sucessfully made!");
	}
	public void statusRegister() {
		if (loginCPF == null) {
			System.out.println("You do not have a registration yet, do you want to register?");
			System.out.println("1 - Register");
			System.out.println("2 - I'm not interessed");
			int opc = tec.nextInt();
			switch(opc) {
			case 1 :{
				registration();
			break;	
			}
			case 2:{
				System.out.println("Ookay");
			break;	
			}
			default :{
				System.err.println("Invalid option");
			break;	
			}
			}
		}
		else {
			System.out.printf("Name: %s",name);
			System.out.printf("\nEmail: %s", email);
			System.out.printf("\nBirth date: %d/%d/%d", month, day, year);
			System.out.printf("\nLogin: %s", loginCPF);
			System.out.printf("\nTravel code: %d%n", cod);
		}
		}		
}
