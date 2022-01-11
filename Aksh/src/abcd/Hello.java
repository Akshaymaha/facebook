package abcd;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://LinkedIn.com/");
		driver.manage().window().minimize();
		Thread.sleep(1000);
		Set<String> parent = driver.getWindowHandles();
		Thread.sleep(1000);
		driver.quit();
		System.out.println(parent);
		
	
		
	}

}
