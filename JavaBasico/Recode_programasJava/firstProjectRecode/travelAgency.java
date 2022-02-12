package firstProjectRecode;


import java.util.Locale;
import java.util.Scanner;

public class travelAgency {

	public static void main(String[] args) 
	{
	int opc;
	Locale.setDefault(Locale.US);
	Scanner tec = new Scanner(System.in);
	Traveler trav = new Traveler();
	TravelPlans plans = new TravelPlans();
			
	do {
	System.out.println("Welcome to FreeLife, here freedom our style!\n");
	System.out.println("Choose the path you want to take first: ");
	System.out.println("1 - Consult travel plans");
	System.out.println("2 - Consult status reserve");
	System.out.println("3 - Consult registration");
	System.out.println("0 - Log off");
	opc = tec.nextInt();
	switch(opc) {
		case 1:{
			plans.availablePlan();
		break;
		}
		case 2:
		{
			plans.statusReserve();
		break;	
		}
		case 3:{
			trav.statusRegister();
		break;
		}
		case 0:{
			System.out.println("Log off!");
			System.exit(0);
		break;
		}
		default:{
			System.err.println("Invalid option");
		break;
		}
	}
	} while(opc != 0);
		
	tec.close();	
	}

}
