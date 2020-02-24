package jtm.activity11;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class VendingMachineTest {

	VendingMachine machine;

	@Before
	public void setUp() {
		machine = new VendingMachine();
	}

	@Test
	public void testInitialBalance() {

		String result = machine.balance();
		assertEquals("Balance expected to be 0.00$", "0.00$", result);
	}

	@Test
	public void testDepositAndBalance() {

		machine.depositCoins(7.63);
		String result = machine.balance();
		assertEquals("Balance expected to be 7.63$", "7.63$", result);
	}

	@Test
	public void testProductNotEnoughBalance() {

		// Register product in Vending Machine

		machine.addProducts("snicker", 0.75);
		String result = machine.chooseProduct("snicker");
		assertEquals("Balance not enough", result);
	}

	@Test
	public void testNonExistingProduct() {

		// Register product in Vending Machine

		machine.addProducts("snicker", 0.75);
		machine.depositCoins(1000.00);
		String result = machine.chooseProduct("twix");
		assertNull(result);
	}

	@Test

	public void testNonCaseSensitiveProducts() {
		
		machine.addProducts("snicker", 0.75);
		machine.depositCoins(1.00);
		String result = machine.chooseProduct("SNICKER");
		assertEquals("snicker", result);
	}
}
