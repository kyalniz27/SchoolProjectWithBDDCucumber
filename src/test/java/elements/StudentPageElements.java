package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentPageElements {

    WebDriver driver;

    @FindBy(css = "#menu1") public WebElement signInBtn;
    @FindBy(xpath = "//*[@name='Email']") public WebElement username;
    @FindBy(xpath = "//*[@name='Password']") public WebElement password;
    @FindBy(xpath = "//input[@id='btn-login']") public WebElement loginBtn;
    @FindBy(css = "#about") public WebElement studentName;
    @FindBy(xpath = "//li[contains(text(),'Start Course')]") public WebElement startCourse;
    @FindBy(tagName = "input") public WebElement viewButton;
    @FindBy(css = ".panel-heading.ng-binding") public List<WebElement> lessons;
    @FindBy(xpath = "(//span[contains(text(),'%')])[26]") public WebElement lesson26;
    @FindBy(xpath = "(//span[contains(text(),'%')])[27]") public WebElement lesson27;
    @FindBy(xpath = "(//span[contains(text(),'%')])[28]") public WebElement lesson28;


    public StudentPageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

}
