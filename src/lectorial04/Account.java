package lectorial04;


class Account implements Comparable<Account>{ 
    private String ID;
    private double balance;
    public Account(String ID, double balance){ 
        this.ID = ID;
        this.balance = balance;
    }
    public String getID() { return ID; }
    public double balance() { return balance; }
    public String toString(){ 
        return new String("ID = "+ ID + " bal = " + balance);
    }
    
    public int compareTo(Account anotherAccount) {
    	return this.ID.compareTo(anotherAccount.ID);    	
    }
}


