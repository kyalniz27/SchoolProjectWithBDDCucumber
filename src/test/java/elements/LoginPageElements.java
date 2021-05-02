package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    WebDriver driver;

    @FindBy(css = "#menu1") public WebElement signInBtn;
    @FindBy(xpath = "//*[@name='Email']") public WebElement username;
    @FindBy(xpath = "//*[@name='Password']") public WebElement password;
    @FindBy(xpath = "//input[@id='btn-login']") public WebElement loginBtn;
    @FindBy(xpath = "//a[text()='Mustafa Köklü ']") public WebElement teacherName;
    @FindBy(xpath = "//div[contains(text(),'Invalid email address or password')]") public WebElement warningMessage;
    @FindBy(id = "btnClose") public WebElement btnClose;


    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
