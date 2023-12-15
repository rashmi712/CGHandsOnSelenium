package Day4Selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecution2 {
	ChromeDriver driver;
    @BeforeTest
    private void setup() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.programsbuzz.com/user/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @BeforeGroups("form")
    private void executionMessage2() {
        System.out.println("----------------------Going to run the form group------------------");
    }
    @AfterGroups("form")
    private void executionMessage4() {
        System.out.println("----------------------form Ended------------------");
    }
    @Test(groups = { "form" })
    private void Name() throws InterruptedException {
        driver.findElement(By.id("edit-name")).sendKeys("Naruto");
    }
    @Test(groups = { "form" })
    private void Password() {
        driver.findElement(By.id("edit-pass")).sendKeys("uzumaki");
    } 


}
