package Day2Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class ExplicitWaitExample {
	private static ChromeDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		  driver.get("https://the-internet.herokuapp.com/login");
		  WebElement username=driver.findElement(By.id("username"));
		  WebElement password = driver.findElement(By.id("password"));
		  WebElement loginbtn = driver.findElement(By.cssSelector("#login > button"));
	      enterValues(driver,username,10,"Exp wait user");
	      enterValues(driver,password,5,"pwdvalue");

	      clickOn(driver,loginbtn,6);
	}
 
/* No explicit keyword or method
* implicit and explicit waits should not be used together as the wait time will be increased
* specific to element
* dynamic in nature
*/
	@SuppressWarnings("deprecation")
	public static void enterValues(WebDriver driver,WebElement element,int time,String val)
	{
		new WebDriverWait(driver,time)
		.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(val);

	}
 
	
	@SuppressWarnings("deprecation")
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		  new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		   element.click();
	}
}
