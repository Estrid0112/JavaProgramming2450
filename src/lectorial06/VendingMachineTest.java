package lectorial06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	private VendingMachine machine;
	
	@Before
	public void setUp() {
		this.machine = new VendingMachine();
	}
	
	
	@After
	public void tearDown() {
		this.machine = null;
	}
	
	@Test
	public void testAddNewItem() {
		this.machine.addItem("coke", 3.5, 100);
		int quantity = this.machine.getQuantityOfItem("coke");
		assertEquals(quantity, 100, 0.0);
	}
	
	@Test
	public void testAddExistingItem() {
		this.machine.addItem("chips", 1.0, 1);
		this.machine.addItem("chips", 1.0, 1);
		int quantity = this.machine.getQuantityOfItem("chips");
		assertEquals(quantity, 2, 0.0);
	}
	
	@Test
	public void testRemoveItem() {
		this.machine.addItem("coke", 3.5, 100);
		this.machine.removeItem("coke", 1);
		int quantity = this.machine.getQuantityOfItem("coke");
		assertEquals(quantity, 99, 0.0);
	}
	
	@Test
	public void testRemoveNonExistingItem() {
		assertFalse(this.machine.removeItem("coke", 1));
	}
	
	@Test
	public void testIsAvailable() {
		this.machine.addItem("coke", 3.5, 100);
		assertTrue(this.machine.isAvailable("coke"));
	}
	
	@Test
	public void testDispense() {
		this.machine.addItem("water", 2.25, 3);
		this.machine.dispenseItem("water");
        assertEquals(2, this.machine.getQuantityOfItem("water"));
	}
	

}
