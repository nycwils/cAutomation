package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import PageObjects.BasePage;
import PageObjects.ContactUs_Page;
import PageObjects.Copyright_Page;



public class DriverFactory {
	public static WebDriver driver;
	public static BasePage basePage;
	public static ContactUs_Page contactuspage;
	public static Copyright_Page copyrightpage;
	

	public WebDriver getDriver() {
		try {
			// Read Config
//			ReadConfigFile file = new ReadConfigFile();
//			String browserName = file.getBrowser();
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//Properties//config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser"); 
			
			
			
			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
//					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
//					capabilities.setCapability("ignoreZoomSetting", true);
//					driver = new InternetExplorerDriver(capabilities);
//					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//initialize objects below
			contactuspage = PageFactory.initElements(driver, ContactUs_Page.class);
			copyrightpage = PageFactory.initElements(driver, Copyright_Page.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
		}
		return driver;
	}
}
