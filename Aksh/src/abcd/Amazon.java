package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize();
		driver.get("https://www.amazon.com");
		
		driver.close();
		driver.quit();
	}

}
