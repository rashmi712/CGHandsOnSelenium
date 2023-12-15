package Day1TestCases;

import org.junit.Assert;
import org.junit.Test;

import practiceSession.ScientificCalculator;

public class test_Scientific_Calculator {

//	public static void main (String[] args) {
	@Test
	public  void test_sci_calc() {
		ScientificCalculator sc = new ScientificCalculator();
		System.out.println(sc.add(23,35));
		System.out.println(sc.calcPF(2000));
		int actual = sc.calcPF(2000);
		int expected = 2500;
		boolean result = true;
		if (actual == expected) {
//			System.out.println("Test Case Passed");
				result = true;
			}
			else { 
				result = false;
			}
			Assert.assertEquals(true, result);
			
		}
}
