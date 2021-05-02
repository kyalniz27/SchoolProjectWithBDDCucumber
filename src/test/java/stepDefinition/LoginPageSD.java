package stepDefinition;


import actionPages.CommonActions;
import actionPages.LoginPageActions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageSD {
    CommonActions commonActions;
    LoginPageActions loginPageActions;

   // WebDriver driver;

    public LoginPageSD(CommonActions commonActions, LoginPageActions loginPageActions) {
        this.commonActions = commonActions;
        this.loginPageActions = loginPageActions;
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        //driver.get("http://turkceokulu.com/");
        commonActions.goToUrl("http://turkceokulu.com/");
    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        //driver.findElement(By.cssSelector("#menu1")).click();
        loginPageActions.clickOnSignInBtn();
    }

    @And("user enters {string} and {string} and click on login button")
    public void enterCredentials(String user, String pass) {
//        driver.findElement(By.xpath("//*[@name='Email']")).sendKeys(user);
//        driver.findElement(By.xpath("//*[@name='Password']")).sendKeys(pass);
//        driver.findElement(By.xpath("//input[@id='btn-login']")).click();

        loginPageActions.sendUsername(user);
        loginPageActions.sendPassword(pass);
        loginPageActions.clickOnLoginBtn();
    }

    @Then("user is navigated to teacher page")
    public void user_is_navigated_to_teacher_page() {
//       String actUser = driver.findElement(By.xpath("//a[text()='Mustafa Köklü ']")).getText().trim();
//       String expUser = "Mustafa Köklü";
//       Assert.assertEquals(expUser,actUser);
        loginPageActions.teacherPageName();
    }

    @When("user enters invalid {string} or {string} and click on login button")
    public void user_enters_invalid_username_or_password_and_click_on_login_button(String invalidUser,String invalidPass) {
       loginPageActions.sendUsername(invalidUser);
       loginPageActions.sendPassword(invalidPass);
       loginPageActions.clickOnLoginBtn();
    }

    @Then("user sees alert message")
    public void user_sees_alert_message() {
     loginPageActions.getAlertText();
    }




}
