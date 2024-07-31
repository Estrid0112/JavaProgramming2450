package lectorial02;

import java.util.ArrayList;

import lectorial01.Account;
import lectorial01.ChequeAccount;
import lectorial01.SavingAccount;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("123", "Alice", 0.0));
		accounts.add(new SavingAccount("124", "James", 10.0));
		accounts.add(new ChequeAccount("125", "Bob", 1000.0));
		
		for(Account account: accounts) {
			account.withdraw();
		}
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car());
		vehicles.add(new Car());
		vehicles.add(new Motorcycle());
		
		for(Vehicle vehicle: vehicles) {
			vehicle.startEngine();
		}
	}

}
