package Day2Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotVisibleException {
	private static ChromeDriver driver;
	@BeforeClass
	public static void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com/");;
	}

	@Test
	public void notVisibleException() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebElement notVisible = driver.findElement(By.xpath("//*[@class='ACRAdd']"));
		notVisible.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
