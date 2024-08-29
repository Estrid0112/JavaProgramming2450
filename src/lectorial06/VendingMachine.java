package lectorial06;

import java.util.HashMap;

public class VendingMachine {
	/*
	 * The map "inventory" stores entries of ItemName (String) -> Detailed information of item (Item)
	 * For example, if the vending machine has a stock of 5 cokes. 
	 * Each coke worths 3.5 dollars. 
	 * Then an Item object can be created: Item item = new Item("coke", 3.5, 5).
	 * An entry ("coke" -> item) will be stored in the map "inventory" 
	 */
	private HashMap<String, Item> inventory = new HashMap<>();
	
	/*
	 * When some new items added to the vending machine, we increase its quantity in the map "inventory".
	 * Suppose the vending machine has an inventory of:
	 * ("coke" -> ("coke", 3.5, 5), "water" -> ("water", 1, 10))
	 * To add 5 more cokes, the entry "coke" -> ("coke", 3.5, 5) should be updated to "coke" -> ("coke", 3.5, 10)
	 * To add 2 milks of 2 dollars, the entry "milk" -> ("milk", 2, 2) should be added to the map "inventory"
	 */
	public void addItem(String name, double price, int quantity) {
		if (this.inventory.containsKey(name)) {
			int oldQuantity = this.inventory.get(name).getQuantity();
			this.inventory.put(name, new Item(name, price, oldQuantity + quantity));
		}else {
			this.inventory.put(name, new Item(name, price, quantity));
		}
		
	}
	
	/*
	 * Given the name of an item, return the quantity of the item in the inventory
	 * 
	 */
	public int getQuantityOfItem(String name) {		
		return this.inventory.get(name).getQuantity();
	}
	
	/*
	 * Remove an item from the inventory.
	 * Suppose the vending machine has an inventory of:
	 * ("coke" -> ("coke", 3.5, 5), "water" -> ("water", 1, 10))
	 * To remove 1 coke from the inventory, the entry "coke" -> ("coke", 3.5, 5) should be updated to "coke" -> ("coke", 3.5, 4)
	 * and return "true" since the removal is successful
	 * To remove 1 milk from the inventory, return "false" since there is no milk in the map "inventory"
	 */
	public boolean removeItem(String name, int quantity) {		
		if (this.inventory.containsKey(name) && this.getQuantityOfItem(name) >= quantity) {
			int oldQuantity = this.getQuantityOfItem(name);
			double price = this.inventory.get(name).getPrice();
			this.inventory.put(name, new Item(name, price, oldQuantity - quantity));
			return true;
		}else {
			return false;
		}
		
	}
	
	/*
	 * Check if an item is available for sale 
	 */
	public boolean isAvailable(String name) {
		return this.inventory.containsKey(name) && this.inventory.get(name).getQuantity() > 0;
	}
	
	/*
	 * Allowing a user to buy one item from the vending machine
	 * 
	 */
	public void dispenseItem(String name) {
		Item item = inventory.get(name);
        if (item != null && item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity() - 1);
        }
        if(item.getQuantity() == 0) {
        	this.inventory.remove(name);
        }
		
	}


}
