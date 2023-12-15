package FunctionalTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.AssertJUnit;




public class LoginPage {
	@Test
	public void login() {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = ob.launchChrome();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		
		try {
			@SuppressWarnings("unused")
			Boolean logOut = driver.findElement(By.cssSelector(".icon-2x.icon-signout")).isDisplayed();
//			if(logOut = true) {
//			System.out.println("log Out button is present");}
//			else{System.out.println("Log out button not present");}
			Assert.assertEquals(logOut, true);
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Log Out Button not found: " + e.getMessage());
		}

}
}
