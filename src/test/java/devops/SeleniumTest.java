package devops;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {
	
public static WebDriver webdriver ;

@BeforeMethod
public void launchDriver() throws MalformedURLException{
DesiredCapabilities dr = null ;
dr = DesiredCapabilities.chrome();
dr.setBrowserName("chrome");
dr.setPlatform(Platform.LINUX);
System.setProperty("webdriver.chrome.driver","/home/amin/Downloads/chromedriver");

driver = new RemoteWebDriver(new URL("http://192.168.1.138:4444/wd/hub"),dr);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().fullscreen();
}
}