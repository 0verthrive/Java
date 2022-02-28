package Entities;

public class Account {
	private String agency;
	private String numAcc;
	
	private Client cl;
	
	public Account() {}
	
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getNumAcc() {
		return numAcc;
	}
	public void setNumAcc(String numAcc) {
		this.numAcc = numAcc;
	}
	public Account(String agency, String numAcc) {
		super();
		this.agency = agency;
		this.numAcc = numAcc;
	}

	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}
	
}
