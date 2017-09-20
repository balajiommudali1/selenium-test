package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_sel {
    public static void main(String[] args) {
    	WebDriver driver;
    	System.setProperty("webdriver.gecko.driver","C:\\Firefox\\geckodriver.exe");
    	driver =new FirefoxDriver();
    	driver.get("http://google.com");
    	System.out.println(driver.getTitle());
    	driver.close();
        System.exit(0);
}
}
