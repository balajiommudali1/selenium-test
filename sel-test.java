package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid2
{

	@Test
	public void test1() throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setCapability("marionette", true);
		cap.setPlatform(Platform.ANY);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://google.com/");
		System.out.println("Title is : "+driver.getTitle());
		driver.quit();
		
	}
}
