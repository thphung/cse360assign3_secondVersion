package cse360assign3;

/** Creating a calculator test case and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/20/2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test // Junit test case to test Calculator method to see if it return NULL or not
	public void testCalculator()
	{
		Calculator TI83 = new Calculator();
		
		assertNull("The value is null", TI83);
	}
	
	@Test // Junit test case to test getTotal() method
	public void testGetTotal()
	{
		int total = 0;
		
		Calculator TI83 = new Calculator();
		
		TI83.subtract(5);
		TI83.multiply(2);
		total = TI83.getTotal();

		assertNotEquals(-10, total);
	}
	
	@Test // Junit test case to test add() method
	public void testAdd()
	{
		int total = 0;
		
		Calculator TI83 = new Calculator();

		total = TI83.add(4);

		assertNotEquals(4, total);
	}

	@Test // Junit test case to test subtract() method
	public void testSubtract()
	{
		int total = 0;
	
		Calculator TI83 = new Calculator();
		
		total = TI83.subtract(6);
		
		assertEquals(-4, total);
	}
	
	@Test // Junit test case to test multiply() method
	public void testMultiply()
	{
		int total = 0;
	
		Calculator TI83 = new Calculator();

		TI83.add(2);
		total = TI83.multiply(5);
		
		assertEquals(5, total);
	} 
	
	@Test // Junit test case to test divide() method
	public void testDivide()
	{
		int total = 0;
	
		Calculator TI83 = new Calculator();

		TI83.add(100);
		total = TI83.divide(0);
		
		assertEquals(0, total);
	}
	
	@Test // Junit test case to test getHistory() method
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}
}
