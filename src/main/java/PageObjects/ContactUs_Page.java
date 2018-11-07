package PageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends BasePage {
	public @FindBy(linkText = "Student Information") WebElement link_StudentInformation; 
	public @FindBy(linkText = "Parents") WebElement link_Parents; 
	public @FindBy(linkText = "University Development and Alumni Relations") WebElement link_UniversityDevelopment; 
	public @FindBy(xpath = "/html/body/div/main/div[1]/div[2]/div/div/h2") WebElement StudentInformationHeader; 
	
	

	public ContactUs_Page() throws IOException {
		super();
		
	}
	
	public ContactUs_Page getcontactuspage() throws IOException {
		getDriver().get("https://www.nyu.edu/footer/contact-us.html");
		
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickStudentInformation() throws InterruptedException, IOException {
		
		waitAndClickElement(link_StudentInformation);
		return new ContactUs_Page();
		
	}
	
	public ContactUs_Page confirmStudentInformationPageWasSuccessful() throws Throwable {
		WebElement studentinformationHeader = getDriver().findElement(By.xpath("/html/body/div/main/div[1]/div[1]/div[1]/div[1]/div/div/ul/li[1]/a"));
		//WaitUntilWebElementIsVisible(StudentInformationHeader);
		Assert.assertEquals("studentinformation",studentinformationHeader.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		return new ContactUs_Page();
	}
}
