package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	



@Given("^user is on login page$")
public void user_is_on_login_page() {
	 System.out.println("inside Step- user is on login page");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	 System.out.println("inside Step- user enters username and password");
	
}

@And("clicks on login button")
public void clicks_on_login_button() {
	 System.out.println("inside Step- Clicks on login button");
    }

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	 System.out.println("inside Step- user is navigated to the home page");
    }

@When("user enters user1 and pass1")
public void user_enters_user1_and_pass1() {
   }

@When("user enters user2 and pass2")
public void user_enters_user2_and_pass2() {
    // Write code here that turns the phrase above into concrete actions
 }

}

