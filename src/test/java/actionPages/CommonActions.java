package actionPages;

import org.openqa.selenium.WebDriver;
import stepDefinition.CommonSteps;

public class CommonActions {

    private WebDriver driver;
    CommonSteps commonSteps;

    public CommonActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
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
}
