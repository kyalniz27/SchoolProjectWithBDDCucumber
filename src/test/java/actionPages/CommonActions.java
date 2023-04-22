package actionPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.CommonSteps;

public class CommonActions {

    private WebDriver driver;
    CommonSteps commonSteps;

    public CommonActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
    }
    
    public String getTitle() {
    	return driver.getTitle().trim();
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void getCurrentUrl(){
        driver.getCurrentUrl();
    }

    public void quitDriver(){
        driver.quit();
    }
    
    public void SelectDropdownByText(WebElement element,String text) {
    	Select select = new Select(element);
    	select.selectByVisibleText(text);
    }
}
