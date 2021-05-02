package actionPages;

import elements.LoginPageElements;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinition.CommonSteps;

public class LoginPageActions {

    private WebDriver driver;
    LoginPageElements loginPageElements;

    public LoginPageActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        loginPageElements = new LoginPageElements(driver);
    }

    public void clickOnSignInBtn(){
        loginPageElements.signInBtn.click();
    }

    public void sendUsername(String user){
        loginPageElements.username.sendKeys(user);
    }

    public void sendPassword(String pass){
        loginPageElements.password.sendKeys(pass);
    }

    public void clickOnLoginBtn() {
        loginPageElements.loginBtn.click();

    }

    public void teacherPageName(){
        String actUser = loginPageElements.teacherName.getText().trim();
        String expUser = "Mustafa Köklü";
        Assert.assertEquals(expUser,actUser);
    }

    public void getAlertText(){
       String alertMessage = loginPageElements.warningMessage.getText();
        System.out.println(alertMessage);
        loginPageElements.btnClose.click();

    }
}
