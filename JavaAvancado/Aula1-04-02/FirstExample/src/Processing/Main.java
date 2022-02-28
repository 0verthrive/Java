/*Exemplo relacionamento entre classes.*/
package Processing;

import Entities.Account;
import Entities.Client;

public class Main {

	public static void main(String[] args) {
		Client cl = new Client();
		Account ac = new Account();
		
		
		cl.setId(3);
		cl.setName("Elevranda");
		
		ac.setAgency("1");
		ac.setNumAcc("2");
		
		cl.add(ac);
		ac.setCl(cl);
		
		System.out.println("ID: "+ cl.getId());
		System.out.println("Nome: "+ cl.getName());
		System.out.println("Agencia: "+ cl.getAcc(0).getAgency());
		System.out.println("Conta: "+ cl.getAcc(0).getNumAcc());
		
				
		System.out.println("ID: "+ ac.getCl().getId());
		System.out.println("Nome: "+ ac.getCl().getName());
		System.out.println("Agencia: "+ ac.getAgency());
		System.out.println("Conta: "+ ac.getNumAcc());
	}

}















