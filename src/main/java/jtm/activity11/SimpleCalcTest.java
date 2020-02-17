package jtm.activity11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the
	 * highest coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		Assert.assertEquals("The result has to be", new Integer(10), sc.add(3, 7));
	}

	@Test
	public void testAddOutOfRange() {
		Assert.assertNull("The result has to be", sc.add(11, -7));
	}

	@Test
	public void testSubtractInRange() {
		Assert.assertEquals("The result has to be", new Integer(3), sc.subtract(10, 7));
	}

	@Test
	public void testSubtractOutOfRange() {
		Assert.assertNull("The result has to be", sc.subtract(10, -7));
	}

	@Test
	public void testMultiplyInRange() {
		Assert.assertEquals("The result has to be", new Integer(8), sc.multiply(4, 2));
	}

	@Test
	public void testMultiplyOutOfRange() {
		Assert.assertNull("The result has to be", sc.multiply(12, 3));
	}

	@Test
	public void testDivideInRange() {
		Assert.assertEquals("The result has to be", new Integer(5), sc.divide(10, 2));
	}

	@Test
	public void testDivideOutOfRange() {
		Assert.assertNull("The result has to be", sc.divide(11, -6));
	}

}
