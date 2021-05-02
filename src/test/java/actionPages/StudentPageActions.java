package actionPages;

import elements.StudentPageElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinition.CommonSteps;

import java.util.List;

public class StudentPageActions {
    String studentsName;
    private WebDriver driver;
    StudentPageElements studentPageElements;

    public StudentPageActions(CommonSteps commonSteps) {
        driver = commonSteps.getDriver();
        studentPageElements = new StudentPageElements(driver);
    }

    public void clickOnSignInBtn() {
        studentPageElements.signInBtn.click();
    }

    public void sendUsername(String user) {
        studentPageElements.username.sendKeys(user);
    }

    public void sendPassword(String pass) {
        studentPageElements.password.sendKeys(pass);
    }

    public void clickOnLoginBtn() {
        studentPageElements.loginBtn.click();
    }

    public void nameOfStudent() {
        studentsName = studentPageElements.studentName.getText();
        //System.out.println(studentsName);
    }

    public void startCourse() {
        studentPageElements.startCourse.click();
    }

    public void verifyCoursePage() {
        String actUrl = driver.getCurrentUrl();
        String expUrl = "http://turkceokulu.com/Ogrenci.aspx";
        Assert.assertEquals(expUrl, actUrl);
    }

    public void viewBtn() {
        studentPageElements.viewButton.click();
    }

    public void getStudentAverage() {
        int lesson26 = 0;
        int lesson27 = 0;
        int lesson28 = 0;


        List<WebElement> lessons = studentPageElements.lessons;
        //List<WebElement> lessons = driver.findElements(By.cssSelector(".panel-heading.ng-binding"));
        // List<WebElement> percentages = driver.findElements(By.cssSelector(".percentageShow.ng-binding"));


        for (WebElement x : lessons) {
            if (x.getText().contains("26. Ders")) {
                String s1 = studentPageElements.lesson26.getText();
                String s2 = s1.replace("%", "");
                lesson26 = Integer.parseInt(s2);
                break;
            }
        }

        for (WebElement x : lessons) {
            if (x.getText().contains("27. Ders")) {
                String s1 = studentPageElements.lesson27.getText();
                String s2 = s1.replace("%", "");
                lesson27 = Integer.parseInt(s2);
                break;
            }
        }


        for (WebElement x : lessons) {
            if (x.getText().contains("28. Ders")) {
                String s1 = studentPageElements.lesson28.getText();
                String s2 = s1.replace("%", "");
                lesson28 = Integer.parseInt(s2);
                break;
            }
        }

        double average = (double)(lesson26 + lesson27 + lesson28)  / 3;

        System.out.println("Percentage of lesson 26 is: " + lesson26);
        System.out.println("Percentage of lesson 27 is: " + lesson27);
        System.out.println("Percentage of lesson 28 is: " + lesson28);
        //System.out.println(studentsName + "'s average is: " + average);
        System.out.printf(studentsName + "'s average is %.2f", average);



    }
}

