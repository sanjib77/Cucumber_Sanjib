package StepDefinition;

import java.util.Map;

import io.cucumber.java.en.*;

public class stepDefinition {

	
	@Given("Navigate to Fcebook Login Page")
	public void navigate_to_fcebook_login_page() {
	    System.out.println("Navigated");
	}

	@When("User Enter Username and Password {string},{string}")
	public void user_enter_username_and_password(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	}

	@Then("Validate the login Functionality")
	public void validate_the_login_functionality() {
	    System.out.println("Validated");
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    for( Map<String, String> testData: dataTable.asMaps()) {
	    	System.out.println("Username   "+testData.get("Username"));
	    	System.out.println("Password   "+testData.get("Password"));
	    }
	}
}
