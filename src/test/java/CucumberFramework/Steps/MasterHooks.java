package CucumberFramework.Steps;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory  {

	
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			
			if(driver != null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			
			
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch(Exception e) {
			System.out.println("Method Failed: screenshotOnFailure, Exception: " + e.getMessage());
		}
	}
	
	
	
//	@Before()
//	public void setup() {
//		driver = getDriver();
//		
//	}
//		//System.setProperty("webdriver.gecko.driver", "src//test//java//Resources//geckodriver");
//		//System.setProperty("webdriver.gecko.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "//src//test//java//Resources//geckodriver");
////		this.driver = new FirefoxDriver();
////		this.driver.manage().window().maximize();
////		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
////	}
//	
//	@After()
//	public void tearDown() {
//		if(driver != null) {
//			driver.manage().deleteAllCookies();
//			driver.quit();
//		}
//		
////		driver.manage().deleteAllCookies();
////		driver.quit();
//	}
	
}
