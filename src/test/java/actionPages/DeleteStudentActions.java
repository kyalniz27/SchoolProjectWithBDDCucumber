package actionPages;

import org.openqa.selenium.WebDriver;

import elements.DeleteStudentElements;
import elements.LoginPageElements;
import stepDefinition.CommonSteps;

public class DeleteStudentActions {

	private WebDriver driver;
	LoginPageElements loginPageElements;
	DeleteStudentElements deleteStudentElements;

	public DeleteStudentActions(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		deleteStudentElements = new DeleteStudentElements(driver);
	}
	
	public void ClickOnDeleteIcon() throws InterruptedException {
		deleteStudentElements.deleteIcon.click();
		Thread.sleep(1000);
	}
	
	public String GetAlertText() throws InterruptedException {
		Thread.sleep(1000);
		return driver.switchTo().alert().getText();
	}

}
