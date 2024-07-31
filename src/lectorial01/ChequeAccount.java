package lectorial01;

public class ChequeAccount extends Account {
	public ChequeAccount() {
		super();
	}
	public ChequeAccount(String id, String name, double balance) {
		super(id, name, balance);
	}
	public void withdraw() {
		System.out.println("Withdrawing from ChequeAccount class!");
	}
}
