package elements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStudentsElements {
	
	WebDriver driver;

    @FindBy(linkText = "Admin Tasks") public WebElement adminTasksElement;
    @FindBy(xpath = "//input[@id='username']") public WebElement adminUserElement;
    @FindBy(xpath = "//input[@id='pass']") public WebElement adminPassElement;
    @FindBy(xpath = "//button[@id='login']") public WebElement adminLoginElement;
    @FindBy(xpath = "//span[normalize-space()='Organizasyon']/..") public WebElement adminOrganizationDropdown;
    @FindBy(xpath = "//a[@href='#/List/Ogrenci']") public WebElement adminStudentsOption;
    @FindBy(xpath = "//select[@id='UlkeId']") public WebElement selectCountry;
    @FindBy(css = "#KurumId") public WebElement selectSchool;
    @FindBy(xpath = "//select[@id='SinifId']") public WebElement selectClass;
    @FindBy(xpath = "//select[@id='Visible']") public WebElement selectStatus;
    @FindBy(xpath = "//select[@class='pull-right ng-scope ng-pristine ng-valid']") public WebElement numberOfStudents;
    @FindBy(xpath = "//input[@value='Filtrele']") public WebElement filterButton;
    @FindBy(xpath = "//i[contains(@class,'icon-ok')]/..") public List<WebElement> allActiveStudents; 

    public ActiveStudentsElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
