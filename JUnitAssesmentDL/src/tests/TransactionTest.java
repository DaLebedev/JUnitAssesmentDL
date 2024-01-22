/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 21, 2024
 */
package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Transaction;

public class TransactionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTransactionDescription() {
		Transaction transaction = new Transaction(50.0, "Test Transaction");
		assertTrue(transaction.getDescription() == "Test Transaction");
	}
	
	@Test
	public void testTransactionAmount() {
		Transaction transaction = new Transaction(100.0, "Test Transaction");
		assertTrue(transaction.getAmount() == 100);
	}
	
	@Test
	public void testTransactionNotNull() {
		Transaction transaction = new Transaction(150.0, "Test Transaction");
		assertNotNull(transaction);
	}


}
