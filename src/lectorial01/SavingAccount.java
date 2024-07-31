package lectorial01;

public class SavingAccount extends Account{
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(String id, String name, double balance) {
		super(id, name, balance);
	}
	
	
	public void addInterest(double rate) {
		this.setBalance(this.getBalance() * (1 + rate));
	}

}
