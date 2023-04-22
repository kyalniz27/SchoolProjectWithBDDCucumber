package stepDefinition;

import actionPages.CommonActions;
import actionPages.InactiveStudentsActions;
import io.cucumber.java.en.*;

public class InactiveStudentsSD {
	
	CommonActions commonActions;
	InactiveStudentsActions inActiveStudentsActions;
	
	public InactiveStudentsSD(CommonActions commonActions, InactiveStudentsActions inActiveStudentsActions) {
		this.commonActions = commonActions;
		this.inActiveStudentsActions = inActiveStudentsActions;
	}
	
	@Then("I verify inactive students in the course")
	public void i_verify_inactive_students_in_the_course() {
	    inActiveStudentsActions.GetAllInactiveStudents();
	}
	
	

}
