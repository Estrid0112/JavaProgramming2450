package lectorial01;

public class Main {

	public static void main(String[] args) {		
		
		Account account1 = new Account("123", "Alice", 0.0);
		account1.withdraw();
		Account mySaving = new SavingAccount();
//		((ChequeAccount) mySaving).withdraw();
		
//		mySaving.addInterest();
		Account myCheque = new ChequeAccount();
		((ChequeAccount)myCheque).withdraw();
		
//		System.out.println(account1.getID());
//		
//		account1.setID("124");  
//		System.out.println(account1.getID());
//		System.out.println(account1);
//		
//		Account account2 = new Account("223", "Bob", 100.0);
//		account1 = account2;
//		System.out.println(account1.getID());
//		account1.setBalance(1000.0);
//		System.out.println(account2.getBalance());
//		
//		
//		SavingAccount sa1 = new SavingAccount();
//		System.out.println(sa1.getID());
	}
	

}
