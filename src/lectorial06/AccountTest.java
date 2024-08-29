package lectorial06;

import static org.junit.Assert.*;
import lectorial01.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;



public class AccountTest {
	private Account account;
	
	@Before
	public void setUp() {
		this.account = new Account("Alice", "s1234", 100.0);
	}
	
	@Test
	public void testDeposit_PositiveAmount() {
		account.deposit(100.0);
		assertEquals(account.getBalance(), 200.0, 0.0);
	}
	
	@Test
	public void testDeposit_ZeroAmount() {
		account.deposit(0.0);
		assertEquals(account.getBalance(), 100.0, 1e-8);
	}
	
	@Test
	public void testDeposit_NegativeAmount() {
		assertFalse(account.deposit(-100.0));
		
	}
	
	@Test
	public void testAddInterest_PositiveRate() {
		account.addInterest(0.5);
		assertEquals(account.getBalance(), 100.5, 0.0);		
	}
	
//	@Test (expected = IllegalArgumentException.class)
//	public void testAddInterest_NegativeRate() {
//		account.addInterest(-0.5);
//		assertEquals(account.getBalance(), 100.0, 0.0);		
//	}
//		
	@After
	public void tearDown() {
		account = null;
	}

}