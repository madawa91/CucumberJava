package Activity;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginProcess {
	
@Given("user is on login page")
	public void user_is_on_login_page() {
	System.out.println("Inside Step-user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	System.out.println("Inside Step-User enter username and Password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	System.out.println("Inside Step-click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	System.out.println("Inside Step-");
	}

}
