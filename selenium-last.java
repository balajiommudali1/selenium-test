package selenium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Grid2 {
 
@Parameters("browser")
@Test
public void Testfind(String b) throws MalformedURLException{
 
DesiredCapabilities cap = null;
 
if(b.equals("firefox")){
System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
cap = DesiredCapabilities.firefox();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.ANY);
}else if (b.equals("chrome")){
cap = DesiredCapabilities.chrome();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.ANY);
}else if (b.equals("iexplore")){
cap = DesiredCapabilities.internetExplorer();
cap.setBrowserName("iexplore");
cap.setPlatform(Platform.WINDOWS);
}
 
RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
driver.get("http://gmail.com");
}
}
