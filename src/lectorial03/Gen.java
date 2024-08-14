package lectorial03;

class GenAccount<T>{
	private T ID;
	private String name;
	private int balance;
	
	public GenAccount(T id) {
		this.ID = id;
	}
	
	public GenAccount(T id, String name) {
		this.ID = id;
		this.name = name;
	}
	
	public T getID() {
		return this.ID;
	}
	
	public void setID(T newID) {
		this.ID = newID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public static void main(String[] args) {
		boolean[] flags = new boolean[10];
		GenAccount<Integer> myObject = new GenAccount<Integer>(10000, "Alice");
//		myObject.setName("alice");
		System.out.println(myObject.getName());
		
		GenAccount<String> myStringObject = new GenAccount<String>("s123456");
		myStringObject.setName("Bob");
		System.out.println(myStringObject.getName());
		
	}
}