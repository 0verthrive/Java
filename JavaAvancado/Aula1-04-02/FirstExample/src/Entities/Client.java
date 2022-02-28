package Entities;

import java.util.ArrayList;
import java.util.List;
public class Client {
	private int Id;
	private String Name;
	
	private List<Account> ac;
	
	public Client() {
		super();
		ac = new ArrayList<Account>();
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Client(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public Account getAccount() {
		
		return null;
	}

	public List<Account> getAc() {
		return ac;
	}

	public void setAc(List<Account> ac) {
		this.ac = ac;
	}
	
	public void add(Account acc) {
		ac.add(acc);
	}
	
	public Account getAcc(int post) {
		return ac.get(post);
	}
	
}
