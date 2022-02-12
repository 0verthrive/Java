package firstProjectRecode;


import java.util.Scanner;

public class TravelPlans {
	private int cod = 0;
	private int departureDay;
	private int departureMonth;
	private int departureYear;
	private int returnDay;
	private int returnMonth;
	private int returnYear;
	public double predictedValue;
	private double travelDays;
	int opc;
	public String namePlan;
	public String plan;
	public String descriptionPlan;
	public String description;
	private double price;
	Scanner tec = new Scanner(System.in);
		
	public TravelPlans() {}
		
	public String getDescriptionPlan() {
		descriptionPlan = description;
		return descriptionPlan;
	}
		
	public String getNamePlan() {
		namePlan = plan;
		return namePlan;
	}
	
	public double getPrice() {
		return price;
	}
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void availablePlan() {
				
		System.out.println("Enter the plan you want to see: ");
		System.out.println("1 - Disney Plus Complete");
		System.out.println("2 - Disney Family Basic");
		System.out.println("3 - US Basic Student");
		System.out.println("4 - Tour Europe");
		opc = tec.nextInt();
		
	switch(opc) {
	case 1:{
		System.out.println("--------------------Disney Plus Complete--------------------");
		System.out.println("Daily: R$1500/day");
		System.out.println("Description:\nlodging in a Disney Castle, a travel guide, car for tour or private driver.\nLots of fun with disney princesses and villains");
		System.out.println("Breakfast + lunch + dinner all included in the package.");
		System.out.println("Do you want to hire this plan or return to the menu?");
		System.out.println("1 - Reserve");
		System.out.println("2 - Return");
		int opc2 = tec.nextInt();
		
		switch(opc2) {
		case 1 : {
		plan = "Disney Plus Complete";
		description = "Description:\nLodging in a Disney Castle, a travel guide, car for tour or private driver.\nLots of fun with disney princesses and villains\nBreakfast + lunch + dinner all included in the package.";
		price = 1500;
		reservePackage();
		break;	
		}
		case 2 : {
			System.out.println("Ookay");
		}
		default :
		{
			System.err.println("Invalid option");
		}
		}
				
	break;
	}
	case 2 : {
		System.out.println("--------------------Disney Family Basic--------------------");
		System.out.println("Daily: R$1000/day");
		System.out.println("Description:\nlodging in a Disney Castle, a travel guide, car for tour.\nLots of fun with disney princesses and villains");
		System.out.println("Do you want to hire this plan or return to the menu?");
		System.out.println("1 - Reserve");
		System.out.println("2 - Return");
		int opc2 = tec.nextInt();
		
		switch(opc2) {
		case 1 : {
			plan = "Disney Family Basic";
			description = "Description:\\nlodging in a Disney Castle, a travel guide, car for tour.\\nLots of fun with disney princesses and villains";
			price = 1000;
			reservePackage();			
		break;	
		}
		case 2 : {
			System.out.println("Ookay");
		break;
		}
		default :
		{
			System.err.println("Invalid option");
		break;
		}
		}
				
	break;
		
	}
	case 3 : {
		System.out.println("--------------------US Basic Student--------------------");
		System.out.println("Daily: R$100/day");
		System.out.println("Description:\nAccommodation at 'Students of the World', with breakfast, lunch and dinner included");
		System.out.println("Do you want to hire this plan or return to the menu?");
		System.out.println("1 - Reserve");
		System.out.println("2 - Return");
		int opc2 = tec.nextInt();
		
		switch(opc2) {
		case 1 : {
			plan = "US Basic Student";
			description = "Description:\nAccommodation at 'Students of the World', with breakfast, lunch and dinner included";
			price = 100;
			reservePackage();
		break;	
		}
		case 2 : {
			System.out.println("Ookay");
		break;
		}
		default :
		{
			System.err.println("Invalid option");
		break;
		}
		}
			
	break;
	}
	case 4 : {
		System.out.println("--------------------Tour Europe--------------------");
		System.out.println("Daily: R$12000/day");
		System.out.println("Description:\nWe will take you to an immersion in European customs and cultures\nCustomized according to the number of days.\nBreakfast + lunch + dinner all included in the package.");
		System.out.println("Do you want to hire this plan or return to the menu?");
		System.out.println("1 - Reserve");
		System.out.println("2 - Return");
		int opc2 = tec.nextInt();
		
		switch(opc2) {
		case 1 : {
			plan = "US Basic Student";
			description = "Description:\nWe will take you to an immersion in European customs and cultures\nCustomized according to the number of days.\nBreakfast + lunch + dinner all included in the package.";
			price = 100;
			reservePackage();
		break;	
		}
		case 2 : {
			System.out.println("Ookay");
		break;
		}
		default :
		{
			System.err.println("Invalid option");
		break;
		}
		}
			
	break;
	}
	default :{
		System.err.println("Invalid option");
	break;	
	}
	}
		
	}
	public double predictedValue() {
		travelDays = (((returnYear*365.0)-(departureYear*365.0))+(((returnMonth-1)*30.0)-(departureMonth-1.0)*30.0))+(returnDay*1.0) -(departureDay*1.0);
		
		predictedValue = (price * travelDays);
		
		return predictedValue;
	}
	
	
	public void reservePackage() {
		System.out.println("Let's start your booking in a few simple steps. Let's go!");
		System.out.println("Enter departure date: ");
		System.out.println("Day: ");
		departureDay = tec.nextInt();
		System.out.println("Month: ");
		departureMonth = tec.nextInt();
		System.out.println("Year: ");
		departureYear = tec.nextInt();
		
		System.out.println("Enter return date: ");
		System.out.println("Day: ");
		returnDay = tec.nextInt();
		System.out.println("Month: ");
		returnMonth = tec.nextInt();
		System.out.println("Year: ");
		returnYear = tec.nextInt();
		cod += 1;			
	System.out.println("Reservation successfully made!");
	}
	public void statusReserve () {
		System.out.println("\nTravel plan: "+ plan);
		System.out.println("\nDescription: "+ description);
		System.out.printf("\nDeparture date: %d/%d/%d", departureMonth, departureDay, departureYear);
		System.out.printf("\nReturn date: %d/%d/%d", returnMonth, returnDay, returnYear);
		System.out.printf("\nPredicted value: %.2f%n", predictedValue());
		System.out.printf("\nTravel code: %d%n", cod);
}	
	
}
