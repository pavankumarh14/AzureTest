package pkazure.com.azureGit_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserOpen {
	
	@Test
	public void OpenAndCloseBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
