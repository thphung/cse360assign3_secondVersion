package cse360assign3;

/** Creating a calculator and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/20/2016
 * 
 */

public class Calculator 
{
	private int total;
	
	// Calculator method
	public Calculator() 
	{
		total = 0;  // not needed - included for clarity
	}
	
	// Return total value 
	public int getTotal() 
	{
		return total;
	}
	
	// Adding function of the calculator
	public int add(int value) 
	{
		total = total + value;
		
		return total;
	}
	
	// Subtracting function of the calculator
	public int subtract(int value) 
	{
		total = total - value;
		
		return total;
	}
	
	// Multiplying function of the calculator
	public int multiply(int value) 
	{
		total = total * value;
		
		return total;
	}
	
	// Diving function of the calculator
	public int divide(int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else 
		{
			total = total / value;
		}
		
		return total;
	}
	
	// Contain all the history of using any mathematical methods 
	public String getHistory() 
	{
		return "";
	}
}