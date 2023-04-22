package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteStudentElements {

	WebDriver driver;

	@FindBy(xpath = "//tr[contains(@class,'deleted')]//a[contains(@href,'#/View/Ogrenci')]/ancestor::tr//td//a[@class='dtBtn red']")
	public WebElement deleteIcon;

	public DeleteStudentElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
