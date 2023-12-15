package Day1TestCases;

import org.junit.Assert;
import org.junit.Test;

import practiceSession.Calculator;

public class test_Calculator_add_int_int {
	
//	public static void main(String args[]){
	
	@Test
	public void test_add_integer(){
//		Calculator c = new Calculator();
		int actual = Calculator.add(12, 24);
		System.out.println("added integer is " + actual);
		int expected = 36;
		boolean result = false;
		if (actual == expected) {
//		System.out.println("Test Case Passed");
			result = true;
		}
		else { 
			result = false;
		}
		Assert.assertEquals(true, result);
		
	}
}