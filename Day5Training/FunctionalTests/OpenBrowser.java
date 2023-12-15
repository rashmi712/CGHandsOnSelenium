package FunctionalTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class OpenBrowser {
		WebDriver driver;
		public WebDriver launchChrome() {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rsingh80\\browser\\chromedriver.exe");
			return driver = new ChromeDriver();
			}

		}
