package stepDefinition;

import org.junit.Assert;

import actionPages.CommonActions;
import actionPages.DeleteStudentActions;
import actionPages.LoginPageActions;
import io.cucumber.java.en.*;

public class DeleteStudentSD {

	CommonActions commonActions;
	LoginPageActions loginPageActions;
	DeleteStudentActions deleteStudentActions;

	public DeleteStudentSD(CommonActions commonActions, DeleteStudentActions deleteStudentActions) {
		this.commonActions = commonActions;
		this.deleteStudentActions = deleteStudentActions;
	}
	
	@And("I click on delete icon to delete an inactive student")
	public void i_click_on_delete_icon_to_delete_an_inactive_student() throws InterruptedException {
	    deleteStudentActions.ClickOnDeleteIcon();
	}
	
	@Then("I verify {string} alert message is displayed")
	public void i_verify_alert_message_is_displayed(String text) {
		try {
			Assert.assertEquals(text, deleteStudentActions.GetAlertText());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
