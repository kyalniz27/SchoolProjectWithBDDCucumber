package actionPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.InactiveStudentsElements;
import stepDefinition.CommonSteps;

public class InactiveStudentsActions {
	
	private WebDriver driver;
	InactiveStudentsElements inActiveStudentsElements;
	CommonActions commonActions;
	
    public InactiveStudentsActions(CommonSteps commonSteps, CommonActions commonActions) {
        this.driver = commonSteps.getDriver();
        inActiveStudentsElements = new InactiveStudentsElements(driver);
        this.commonActions = commonActions;
      
    }
    
    public void GetAllInactiveStudents() {
    	List<WebElement> inactiveStudent = inActiveStudentsElements.allInactiveStudents;
    	
    	for (WebElement webElement : inactiveStudent) {
			System.out.println(webElement.getText().trim());
		}
    	
    }

}
