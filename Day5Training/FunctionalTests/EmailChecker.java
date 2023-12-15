package FunctionalTests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmailChecker {
	private static ChromeDriver driver;
  @Test
  public void checkEmail() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
	  	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/help/support");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
  }
 
//  public static boolean patternMatches(String emailAddress, String regexPattern) {
//	    return Pattern.compile(regexPattern)
//	      .matcher(emailAddress)
//	      .matches();
//	}
  @Test
  public void testEmailUsingSimpleRegex() {
	  String emailAddress = driver.findElement(By.xpath("//a[@class='orangehrm-support-link']")).getText();
	  System.out.println("Email" + emailAddress);
      String regexPattern = "^(.+)@(\\S+)$";
      assertTrue(RegexPatternMatcher.patternMatches(emailAddress, regexPattern));
      driver.quit();
  }
}
