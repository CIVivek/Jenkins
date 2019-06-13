
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager1 {
	@Test
	public static void testBrowser() {
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
	}

}
