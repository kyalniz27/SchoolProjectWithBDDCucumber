package actionPages;

import org.openqa.selenium.WebDriver;

import elements.ContactPageElements;
import elements.LoginPageElements;
import io.cucumber.datatable.DataTable;
import stepDefinition.CommonSteps;

public class ContactPageActions {
	
	  private WebDriver driver;
	  //LoginPageElements loginPageElements;
	  ContactPageElements contactPageElements;

	    public ContactPageActions(CommonSteps commonSteps) {
	        this.driver = commonSteps.getDriver();
	        contactPageElements = new ContactPageElements(driver);
	    }
	    
	    public void ClickOnContactUsButton() {
	    	contactPageElements.contactUsElement.click();
	    }
	    
	    public void FillOutTheForm(String fullname, String email, String message) {
	    	contactPageElements.contactFullNameElement.sendKeys(fullname);
	    	contactPageElements.contactEmailElement.sendKeys(email);
	    	contactPageElements.contactMesajElement.sendKeys(message);
	    }
	    
	    public void ClickOnSendButton() {
	    	contactPageElements.contactSendBtnElement.click();
	    }
	    
	    public String GetModalBodyText() {
	    	return contactPageElements.contactModalBodyText.getText().trim();
	    }

}
