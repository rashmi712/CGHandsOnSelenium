package SanityTests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuLogin {
	private static ChromeDriver driver;
	@BeforeTest
	public static void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");;
	}
	
	@Test
	public void verify_footer() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		boolean status = driver.findElement(By.linkText("Elemental Selenium1")).isDisplayed();
		AssertJUnit.assertEquals(true, status);
		}
		catch (NoSuchElementException e) {
		      System.out.println("Element not found: " + e.getMessage());
		      Thread.sleep(1000);
			  
		    } 
		
	}

	@Test
	 public void verify_password_masked() throws InterruptedException {
	try {	
	 WebElement password = driver.findElement(By.id("password"));
	 if (password.getAttribute("type") == "password"){
		 System.out.println("Password is masked");
	 }else {
		 System.out.println("Password is not masked");
	 }
	 AssertJUnit.assertEquals(password, password);
	 }
	catch (NoSuchElementException e) {
	      System.out.println("Element not found: " + e.getMessage());
	      Thread.sleep(1000);
		  
	    } 
	finally {
	      driver.quit();
	    }
	}
	
}
