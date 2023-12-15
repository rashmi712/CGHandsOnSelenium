package Day2Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	private static ChromeDriver driver;
	@BeforeClass
	public static void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://app.reflect.run/registration");;
	}
	
	@Test
	public void staleElementException() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebElement firstName = driver.findElement(By.xpath("//div[@class='flex-col-normal-normal mr-0-5 mb-2']//input[@type='text']"));
		firstName.sendKeys("Ramesh");
		driver.navigate().refresh();
		try {
		firstName.sendKeys("Tom");
		}
		catch(StaleElementReferenceException e) {
			System.out.println("Stale Element: " + e.getMessage());
			firstName = driver.findElement(By.xpath("//div[@class='flex-col-normal-normal mr-0-5 mb-2']//input[@type='text']"));
			System.out.println("Element not present post refresh");
			firstName.sendKeys("Tom");
			
		}
		
	}

}
