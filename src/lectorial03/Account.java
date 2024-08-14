package lectorial03;

public class Account {
	private String name;
	private String ID; 
	private double balance;
	private static final int PERCENT = 100;
	
	public Account(String name, String ID, double balance) {
		this.name = name;
		this.ID = ID;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withdraw(double amt) {
		if (amt >= 0 && amt <= balance) {
			balance -= amt;
			return true;
		} else {
			return false;
		}
	}

	public boolean deposit(double amt) {
		if (amt >= 0) {
			balance += amt;
			return true;
		} else {
			return false;
		}
	}
	
	public void addInterest(double rate) throws IllegalArgumentException{
		if (rate < 0) {
			throw new IllegalArgumentException("Negative rate");
		}
		balance += balance * rate / PERCENT;
	}
	
	public String toString() {
		return this.name;
	}

}