package Data;

import java.util.HashMap;

import Model.Student;

public class DBStudent {
	
	Bank bank;
	HashMap<String, Student> db;
	
	public DBStudent() {
		bank = new Bank();
		db = bank.getDb();
	}
	
	public void Incluse(Student std) {
		
	}
	public void Remove(Student std) {
		
	}
	public void Alter(Student std) {
		
	}
	public Student Consult(Student std) {
		return db.get("15");
	}
	
	
}
