package Day4Selenium;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestCase1 {
 
@Test
  public void Step1() {
	  
	  Assert.assertEquals(true, false);
  }
  @Test
  public void Step2() {
	  
	  Assert.assertEquals(true, true);
  }
}
