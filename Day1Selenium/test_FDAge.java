package Day1TestCases;

import org.junit.Assert;
import org.junit.Test;

import Day2Training.AgeGroup;


public class test_FDAge {

	AgeGroup ag = new AgeGroup();
	
	@Test
	public void testFDAge() {
	int age[] = {10,60,65};
	int expected_roi[] = {4,6,6};
	int actual_roi;
	
	for (int i = 0;i< age.length;i++)
	{
		actual_roi = ag.rateOfInterest((age[i]));
		System.out.println("Expected:" + expected_roi[i] + " " + "Actual : " + actual_roi );
		Assert.assertEquals(expected_roi[i], actual_roi);
		
	}
	}
	
}
