package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageElements {

	WebDriver driver;

	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]") public WebElement contactUsElement;
	@FindBy(xpath = "//input[@id='FullName']") public WebElement contactFullNameElement;
	@FindBy(xpath = "//input[@id='Email']") public WebElement contactEmailElement;
	@FindBy(xpath = "//textarea[@id='Mesaj']") public WebElement contactMesajElement;
	@FindBy(xpath = "//button[normalize-space()='Send']") public WebElement contactSendBtnElement;
	@FindBy(xpath = "//div[@class='modal-body']") public WebElement contactModalBodyText;


	public ContactPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
