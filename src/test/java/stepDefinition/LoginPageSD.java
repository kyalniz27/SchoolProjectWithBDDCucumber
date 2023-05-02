package stepDefinition;

import actionPages.CommonActions;
import actionPages.LoginPageActions;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPageSD {
    CommonActions commonActions;
    LoginPageActions loginPageActions;


    public LoginPageSD(CommonActions commonActions, LoginPageActions loginPageActions) {
        this.commonActions = commonActions;
        this.loginPageActions = loginPageActions;
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        commonActions.goToUrl("http://turkceokulu.com/");
    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPageActions.clickOnSignInBtn();
    }

    @And("user enters {string} and {string} and click on login button")
    public void enterCredentials(String user, String pass) {

        loginPageActions.sendUsername(user);
        loginPageActions.sendPassword(pass);
        loginPageActions.clickOnLoginBtn();
    }

    @Then("user is navigated to teacher page")
    public void user_is_navigated_to_teacher_page() {
        loginPageActions.teacherPageName();
    }

    @When("user enters invalid {string} or {string} and click on login button")
    public void user_enters_invalid_username_or_password_and_click_on_login_button(String invalidUser,String invalidPass) {
       loginPageActions.sendUsername(invalidUser);
       loginPageActions.sendPassword(invalidPass);
       loginPageActions.clickOnLoginBtn();
    }

    @Then("user sees {string} error message")
    public void user_sees_alert_message(String message) throws InterruptedException {
    	Assert.assertEquals(message, loginPageActions.getErrorText());
    }

    @When("I click on log out button")
    public void i_click_on_log_out_button() {
        loginPageActions.LogOutFromTheSystem();
    }
    
    @Then("I verify I logged out successfully")
    public void i_verify_i_logged_out_successfully() {
       Assert.assertTrue(loginPageActions.VerifyUserLoggedOut());
    }


}
