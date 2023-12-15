package Day2Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenElement {
	private static ChromeDriver driver;
	@BeforeClass
	public static void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("C:\\Users\\rsingh80\\Desktop\\Sample.html");;
	}

	@Test
	public void notInteractableException() {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		WebElement hiddenText = driver.findElement(By.id("custId"));
		action.moveToElement(hiddenText);
			try {
	
			hiddenText.sendKeys("testdata");
			}
			catch(ElementNotInteractableException e) {
				System.out.println(e.getMessage());
			}
			}
}
		


