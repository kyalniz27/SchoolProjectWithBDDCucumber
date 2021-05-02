package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPageSD {

    WebDriver driver;

    public ContactPageSD(CommonSteps commonSteps){
        driver = commonSteps.getDriver();
    }


    @Given("guest is on login page")
    public void guest_is_on_login_page() {
        driver.get("http://turkceokulu.com/");
    }

    @When("guest clicks on contact us button")
    public void guest_clicks_on_contact_us_button() throws Exception {
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(2000);
    }

    @Then("guest enters fullname,email and message")
    public void guest_enters_name_surname_and_email(DataTable dataTable) throws Exception {
        driver.findElement(By.xpath("//input[@id='FullName']")).sendKeys(dataTable.cell(1,0));
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(dataTable.cell(1,1));
        driver.findElement(By.xpath("//textarea[@id='Mesaj']")).sendKeys(dataTable.cell(1,2));
        Thread.sleep(2000);
    }




}
