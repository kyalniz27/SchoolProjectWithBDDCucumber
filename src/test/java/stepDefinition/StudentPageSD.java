package stepDefinition;

import actionPages.CommonActions;
import actionPages.StudentPageActions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StudentPageSD {

    CommonActions commonActions;
    StudentPageActions studentPageActions;
    //WebDriver driver;
    String studentsName;


    public StudentPageSD(CommonActions commonActions, StudentPageActions studentPageActions) {
        this.commonActions = commonActions;
        this.studentPageActions = studentPageActions;
        //driver = new ChromeDriver();
    }

    @Given("student is on login page")
    public void user_is_on_login_page() {
        commonActions.goToUrl("http://turkceokulu.com/");
        //driver.get("http://turkceokulu.com/");
    }

    @When("student clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        //driver.findElement(By.cssSelector("#menu1")).click();
        studentPageActions.clickOnSignInBtn();
    }

    @When("student enters {string} and {string} and click on login button")
    public void enterCredentials(String user, String pass) {
//        driver.findElement(By.xpath("//*[@name='Email']")).sendKeys(user);
//        driver.findElement(By.xpath("//*[@name='Password']")).sendKeys(pass);
//        driver.findElement(By.xpath("//input[@id='btn-login']")).click();
        studentPageActions.sendUsername(user);
        studentPageActions.sendPassword(pass);
        studentPageActions.clickOnLoginBtn();
    }

    @When("student is navigated to student page and verify student's name")
    public void user_is_navigated_to_teacher_page() {
        //studentsName = driver.findElement(By.cssSelector("#about")).getText();
        // System.out.println(studentsName);
        studentPageActions.nameOfStudent();
    }

    @When("student clicks on start course button")
    public void student_clicks_on_start_course_button() {
        //driver.findElement(By.xpath("//li[contains(text(),'Start Course')]")).click();
        studentPageActions.startCourse();
    }

    @When("student is navigated to course page")
    public void student_is_navigated_to_course_page() {
//        String actUrl = driver.getCurrentUrl();
//        String expUrl = "http://turkceokulu.com/Ogrenci.aspx";
//        Assert.assertEquals(expUrl,actUrl);
        studentPageActions.verifyCoursePage();
    }

    @When("student clicks on table view button")
    public void student_clicks_on_table_view_button() {
        //driver.findElement(By.tagName("input")).click();
        studentPageActions.viewBtn();
    }

    @Then("student can see his progress and calculate average")
    public void student_can_see_his_progress_and_calculate_average() {
//        int lesson3 = 0;
//        int lesson4 = 0;
//        int lesson5 = 0;
//        int average = (lesson3 + lesson4 + lesson5) / 3;
//
//        List<WebElement> lessons = driver.findElements(By.cssSelector(".panel-heading.ng-binding"));
//        //List<WebElement> lessons = driver.findElements(By.cssSelector(".panel-heading.ng-binding"));
//        // List<WebElement> percentages = driver.findElements(By.cssSelector(".percentageShow.ng-binding"));
//
//        for (WebElement x : lessons) {
//            if (x.getText().contains("3. Ders")) {
//                String s1 = driver.findElement(By.xpath("(//*[@class='percentageShow ng-binding'])[3]")).getText();
//                String s2 = s1.replace("%", "");
//                lesson3 = Integer.parseInt(s2);
//                break;
//            }
//        }
//
//        for (WebElement x : lessons) {
//            if (x.getText().contains("4. Ders")) {
//                String s1 = driver.findElement(By.xpath("(//*[@class='percentageShow ng-binding'])[4]")).getText();
//                String s2 = s1.replace("%", "");
//                lesson4 = Integer.parseInt(s2);
//                break;
//            }
//        }
//
//        for (WebElement x : lessons) {
//            if (x.getText().contains("5. Ders")) {
//                String s1 = driver.findElement(By.xpath("(//*[@class='percentageShow ng-binding'])[5]")).getText();
//                String s2 = s1.replace("%", "");
//                lesson5 = Integer.parseInt(s2);
//                break;
//            }
//        }
//
//
//        System.out.println("Percentage of lesson 3 is: " + lesson3);
//        System.out.println("Percentage of lesson 4 is: " + lesson4);
//        System.out.println("Percentage of lesson 5 is: " + lesson5);
//        System.out.println(studentsName + "'s average is: " + (lesson3 + lesson4 + lesson5) / 3);
//
//
//    }
        studentPageActions.getStudentAverage();

    }
}




