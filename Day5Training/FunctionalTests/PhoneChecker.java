package FunctionalTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PhoneChecker {
	private static ChromeDriver driver;
  @Test
  public void checkPhone() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
	  	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.aicte-india.org/contact");
  }

 @Test
 public void testPhoneUsingSimpleRegex() {
	String phone = driver.findElement(By.cssSelector("p:nth-child(3)")).getText();
	String phoneNumber= phone.replace("Phone: ", "");
	System.out.println("PhoneNumber" + phoneNumber);
    String regexPattern = "([0-9]+(-[0-9]+)+),[0-9]+";
    assertTrue(RegexPatternMatcher.patternMatches(phoneNumber, regexPattern));
    driver.quit();
}
}
