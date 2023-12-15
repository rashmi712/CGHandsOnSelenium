package Day2Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in1")).click();

		if (driver.findElement(By.id("flash")).getAttribute("class").contains("flash success")) {
			System.out.println("Login is Success for");
		}
		else {
			System.out.println("Login Failed");
		}
		driver.close();
	}
//	public void verify_footer() throws InterruptedException {
//		  boolean status =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
//		  Thread.sleep(1000);
//		  Assert.assertEquals(true, status);
//		}

}
