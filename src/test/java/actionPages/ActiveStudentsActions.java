package actionPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.ActiveStudentsElements;
import stepDefinition.CommonSteps;

public class ActiveStudentsActions {
	
	private WebDriver driver;
	ActiveStudentsElements activeStudentsElements;
	CommonActions commonActions;
	
    public ActiveStudentsActions(CommonSteps commonSteps, CommonActions commonActions) {
        this.driver = commonSteps.getDriver();
        activeStudentsElements = new ActiveStudentsElements(driver);
        this.commonActions = commonActions;
      
    }
    
    public void ClickOnAdminTasksLink() {
    	activeStudentsElements.adminTasksElement.click();
    }
    
    public void TransferAdminWindowAndLogin(String user, String pass) {
    	
    	Set<String> windows = driver.getWindowHandles();
    	Iterator<String> iterator = windows.iterator();
    	
    	String parentWindow = iterator.next();
    	String childWindow = iterator.next();
    	
    	driver.switchTo().window(childWindow);
    	
    	activeStudentsElements.adminUserElement.sendKeys(user);
    	activeStudentsElements.adminPassElement.sendKeys(pass);
    	activeStudentsElements.adminLoginElement.click();
    	
    }
    
    public void GoToStudentsTable() {
    	activeStudentsElements.adminOrganizationDropdown.click();
    	activeStudentsElements.adminStudentsOption.click();
    }
    
    public void FilterToFetchStudents(String country, String school, String grade, String status) throws InterruptedException {
    	Thread.sleep(20000);
    	commonActions.SelectDropdownByText(activeStudentsElements.selectCountry, country);
    	Thread.sleep(2000);
    	commonActions.SelectDropdownByText(activeStudentsElements.selectCountry, school);
    	Thread.sleep(2000);
    	commonActions.SelectDropdownByText(activeStudentsElements.selectCountry, grade);
    	Thread.sleep(2000);
    	commonActions.SelectDropdownByText(activeStudentsElements.selectCountry, status);
    	Thread.sleep(2000);
    }
    
    public void SelectAllStudents(String number) throws InterruptedException {
    	Thread.sleep(20000);
    	commonActions.SelectDropdownByText(activeStudentsElements.numberOfStudents, number);
    	Thread.sleep(10000);
    }
    
    public void GetAllActiveStudents() {
    	
    	List<WebElement> activeStudents = activeStudentsElements.allActiveStudents;  
    	System.out.println("========== ALL ACTIVE STUDENTS ==========");
    	System.out.println();
    	for (WebElement element : activeStudents) {
			System.out.println(element.getText().trim());
		}
    }
    
    public void ClickOnFilterButton() {
    	activeStudentsElements.filterButton.click();
    }

}
