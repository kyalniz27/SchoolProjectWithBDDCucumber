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
    @FindBy(xpath = "//a[@id='about']") public WebElement teacherName;
    @FindBy(xpath = "//div[@class='modal-content']//div[@class='modal-body']") public WebElement warningMessage;
    @FindBy(xpath = "//button[@id='btnClose']") public WebElement btnClose;


    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
