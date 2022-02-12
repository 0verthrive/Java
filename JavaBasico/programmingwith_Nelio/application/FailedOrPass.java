package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class FailedOrPass {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner tec = new Scanner(System.in);
	Student st = new Student();
	double aux;
	
	System.out.println("Enter student name: ");
	st.name = tec.nextLine();
	
 do {
	System.out.println("Inform the grades for the three quaters: ");
	aux = tec.nextDouble();
	if(aux <= 30) {
		st.firstTrimester = aux;
	}
	else {
		System.err.print("invalid entered value\nMaximum grade 30");
	}
	st.secondTrimester = tec.nextDouble();	
	st.thirdQuater = tec.nextDouble();
	if(st.secondTrimester > 35 || st.thirdQuater > 35) {
	System.err.println("invalid entered value\\nMaximum grade 35");
	}
 } while(aux > 30 || st.secondTrimester > 35 || st.thirdQuater > 35);

 	System.out.println(st);
	
	tec.close();
	}

}
