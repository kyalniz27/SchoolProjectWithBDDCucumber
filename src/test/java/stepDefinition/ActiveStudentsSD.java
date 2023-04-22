package stepDefinition;

import org.junit.Assert;

import actionPages.ActiveStudentsActions;
import actionPages.CommonActions;
import io.cucumber.java.en.*;

public class ActiveStudentsSD {
	
	CommonActions commonActions;
	ActiveStudentsActions activeStudentsActions;
	
	public ActiveStudentsSD(CommonActions commonActions, ActiveStudentsActions activeStudentsActions) {
		this.commonActions = commonActions;
		this.activeStudentsActions = activeStudentsActions;
	}
	
	@When("I click on admin tasks link to go to the admin page")
	public void i_click_on_admin_tasks_link_to_go_to_the_admin_page() {
		
		activeStudentsActions.ClickOnAdminTasksLink();
	}
	
	@And("I input user name and password and click login on admin page")
	public void i_input_user_name_and_password_and_click_login_on_admin_page() {
	    String userName = "m.koklu@sany.org";
	    String password = "2121";
	    activeStudentsActions.TransferAdminWindowAndLogin(userName, password);
	}
	
	@Then("I verify that the user is on admin page")
	public void i_verify_that_the_user_in_on_admin_page() {
	    String expTitle = "Türkçe Okulu Admin";
	    String actTitle = commonActions.getTitle();
	    Assert.assertEquals(expTitle, actTitle);
	}
	
	@When("I click on organization dropdown and select students")
	public void i_click_on_organization_dropdown_and_select_students() {
	    activeStudentsActions.GoToStudentsTable();
	}

	@When("I select {string},{string},{string} and {string} from dropdown")
	public void i_select_and_from_dropdown(String country, String school, String grade, String status) throws InterruptedException {
	    activeStudentsActions.FilterToFetchStudents(country, school, grade, status);
	}
	
	@When("I want to see all {string} students on the page")
	public void i_want_to_see_all_the_students_on_the_page(String students) throws InterruptedException {
	   activeStudentsActions.SelectAllStudents(students);
	}
		
	@And("I click on filter button on the page")
	public void i_click_on_filter_button_on_the_page() {
	    activeStudentsActions.ClickOnFilterButton();
	}
	
	@Then("I verify the students taking the course actively")
	public void i_verify_the_students_taking_the_course_actively() {
	    activeStudentsActions.GetAllActiveStudents();
	}

}
