package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "João", 1000.0, 0.01);
		
		//Chamando a mesma operação em variáveis do mesmo tipo
		//Mas elas tiveram comportamentos diferentes
		//Conforme os objetos para quais elas apontam
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}