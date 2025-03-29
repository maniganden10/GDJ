package PageObject;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Utilities.PropertiesClass;

public class BasicSetup {
	public WebDriver driver;
	public WebDriverWait wait;
	public Properties prop;
	
	@BeforeSuite
	
	public void setUp() throws IOException {
		this.prop=PropertiesClass.getprop();
		String env=System.getProperty("env");
		String browser=System.getProperty("browser");
		String hubUrl="http://192.168.0.104:4444";
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.LINUX);
		cap.setBrowserName(browser);
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL(hubUrl),cap);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterSuite
	public void closeSession() {
		driver.quit();
	}
	
}
