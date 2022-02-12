package Data;

import java.util.HashMap;

import Model.Student;

public class Bank {

	private HashMap<String, Student> db;
	
	private Student std;
	
	public Bank() {
		db = new HashMap<String, Student>();
		
		std = new Student();
		std.setRegistration("15");
		std.setName("Danilo");
		
		db.put(std.getRegistration(), std);
		

		std = new Student();
		std.setRegistration("20");
		std.setName("Sara");
		
		db.put(std.getRegistration(), std);
	}

	public HashMap<String, Student> getDb() {
		return db;
	}
	
}
