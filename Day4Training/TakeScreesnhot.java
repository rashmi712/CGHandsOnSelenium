package com.sc.testselenium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class LoginHK {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = ob.launchChrome();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String[][] data = {{"tomsmith", "SuperSecretPassword!"},{"tomsmith","secret"}};
		
		for (int rows=0; rows<data.length; rows++) {
			
			driver.get("https://the-internet.herokuapp.com/login");
			driver.findElement(By.id("username")).sendKeys(data[rows][0]);
			driver.findElement(By.id("password")).sendKeys(data[rows][1]);
			driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
			
			String credentials = data[rows][0] + " " + data[rows][1];
			Date date = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hhmmss");
			
			String strDate = dateFormat.format(date);
			String scrshotFilename = credentials+strDate+".jpg";
			
			if (driver.findElement(By.id("flash")).getAttribute("class").contains("flash success")) {
				System.out.println("Login is Success for" + " "+ credentials);
			}
			else {
			
//				TakeScreenshot ts = new TakeScreenshot();
//				TakeScreenshot.takeSnapShot(driver, scrshotFilename);
				Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
				ImageIO.write(screenshot.getImage(), "jpg", new File(scrshotFilename));
				System.out.println("Login Failed for" + " " + credentials);
				System.out.println("Screenshot captured in" + " " + scrshotFilename);
			}
			}
			driver.navigate().forward();
	
	      
	}
	}
