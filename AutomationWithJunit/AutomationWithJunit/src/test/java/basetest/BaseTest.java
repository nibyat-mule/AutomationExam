package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;

	public void initDriver() {
		//We don't have to set system property on the new version of selenium
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/104/index.php");

	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
