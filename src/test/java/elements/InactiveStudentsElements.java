package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InactiveStudentsElements {
	
	WebDriver driver;

    @FindBy(xpath = "//tr[contains(@class,'deleted')]//a[contains(@href,'#/View/Ogrenci')]") public List<WebElement> allInactiveStudents;

    public InactiveStudentsElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
