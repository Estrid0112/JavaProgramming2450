package lectorial01;

public class Account extends Object{
	//attributes
	private String accountID;
	private String accountName;
	private double balance;
	
	//constructor
	public Account() {
		this.accountID = "empty";
	}
	
	public Account(String id, String name) {
		this.accountID = id;
		this.accountName = name;
		this.balance = 0.0;
	}
	
	public Account(String id, String name, double balance) {
		this.accountID = id;
		this.accountName = name;
		this.balance = balance;
	}
	
	// getter
	public String getID(){
		return this.accountID;
	}
	public double getBalance() {
		return this.balance;
	}

	// setter
	public void setID(String newID) {		
		this.accountID = newID;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	@Override
	public String toString() {
		return this.accountID + "|" + this.accountName + "|" + this.balance;
	}
	
	public void withdraw() {
		System.out.println("Withdrawing from Account class!");
	}

}