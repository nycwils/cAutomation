package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Copyright_Page extends BasePage {
	
	public @FindBy(linkText = "Services for Teaching & Research") WebElement link_ServicesTeachingResearch; 
	

	public Copyright_Page() throws IOException {
		super();
		
	}

}
