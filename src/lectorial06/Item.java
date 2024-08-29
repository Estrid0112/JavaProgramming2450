package lectorial06;

public class Item {
	private String name;
	private double price;
	private int quantity;
	public Item(String name2, double price2, int i) {
		this.name = name2;
		this.price = price2;
		this.quantity = i;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}

}
