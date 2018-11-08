package CucumberFramework.Steps;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends DriverFactory {
	
//	WebDriver driver;
//	@Before()
//	public void setup() throws IOException {
//		//System.setProperty("webdriver.gecko.driver", "src//test//java//Resources//geckodriver");
//		System.setProperty("webdriver.gecko.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "//src//test//java//Resources//geckodriver");
//		this.driver = new FirefoxDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	}
//	
//	@After()
//	public void tearDown() {
//		driver.manage().deleteAllCookies();
//		driver.quit();
//	}
//	
	
	
	   @Given("^User navigates to NYU Contact Us Page$")
	    public void user_navigates_to_nyu_contact_us_page() throws Throwable {
		   //driver.get("https://www.nyu.edu/footer/contact-us.html");
		   contactuspage.getcontactuspage();
	       
	    }

	    @When("^User clicks on student information$")
	    public void user_clicks_on_student_information() throws Throwable {
	    	contactuspage.clickStudentInformation();
	     
	    }

	    @Then("^the student information banner should be displayed$")
	    public void the_student_information_banner_should_be_displayed() throws Throwable {
	    	contactuspage.confirmStudentInformationPageWasSuccessful();
	    	
	    }

	
	
	@Given("^User navigates to stackoverflow website$")
    public void user_navigates_to_stackoverflow_website() throws Throwable {
      getDriver().get("http://www.nyu.edu");
      
    }

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		getDriver().findElement(By.xpath("/html/body/header/div/ol/li[6]/a[1]")).click();
	}
	

	   
	   @And("^User enters a \"([^\"]*)\" username$")
	    public void user_enters_a_something_username(String strArg1) throws Throwable {
		   getDriver().findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(strArg1);	
	    }

	    @And("^User enters a \"([^\"]*)\" password$")
	    public void user_enters_a_something_password(String strArg1) throws Throwable {
	    	getDriver().findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(strArg1);	
	    }
	   
    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
    	getDriver().findElement(By.xpath("//*[@id=\"submit-button\"]")).click();	
    	//*[@id="submit-button"]
    }

  
    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
    	Thread.sleep(8000L);
    	WebElement askQuestionsButton = getDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div/a"));
    	Assert.assertEquals(true, askQuestionsButton.isDisplayed());
    	//Assert.assertEquals("thankyou", askQuestionsButton.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
    	Thread.sleep(3000L);
    }
 
    
    ////////////////
    

    @Given("^User navigates to google$")
    public void user_navigates_to_google() throws Throwable {
        
    }

    @Then("^User should see Google$")
    public void user_should_see_google() throws Throwable {
        
    }
    


   

}
