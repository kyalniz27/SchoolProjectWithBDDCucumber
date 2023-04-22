package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.tlh.vaj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actionPages.CommonActions;
import actionPages.ContactPageActions;
import elements.ContactPageElements;

public class ContactPageSD {

	CommonActions commonActions;
    ContactPageActions contactPageActions;
    //ContactPageElements contactPageElements;

    public ContactPageSD( CommonActions commonActions,ContactPageActions contactPageActions){
        this.contactPageActions = contactPageActions;
        this.commonActions = commonActions;
    }
    
    @Given("guest is on login page")
    public void user_is_on_login_page() {
        //driver.get("http://turkceokulu.com/");
        commonActions.goToUrl("http://turkceokulu.com/");
    }

    @When("guest clicks on contact us button")
    public void guest_clicks_on_contact_us_button() throws Exception {
       contactPageActions.ClickOnContactUsButton();
    }
    
    @And("guest enters {string},{string} and {string}")
    public void guest_enters_and(String fullname, String email, String message) {
    	//contactPageElements.contactFullNameElement.sendKeys(dataTable.cell(1,0));
    	//contactPageElements.contactEmailElement.sendKeys(dataTable.cell(1,1));
    	//contactPageElements.contactMesajElement.sendKeys(dataTable.cell(1,2));
    	contactPageActions.FillOutTheForm(fullname, email, message);
    }
    
    @And("guest cliks on send button to send the message")
    public void guest_cliks_on_send_button_to_send_the_message() {
        contactPageActions.ClickOnSendButton();
    }





}
