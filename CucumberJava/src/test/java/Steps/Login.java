package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("user on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		System.out.println("user enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		System.out.println("user clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
		System.out.println("user is navigated to the home page");
	}

	@When("user enters User1 and pass1")
	public void user_enters_user1_and_pass1() 
	{
		System.out.println("user enters User1 and pass1");
	}

	@When("user enters User2 and pass2")
	public void user_enters_user2_and_pass2() 
	{
		System.out.println("user enters User2 and pass2");
	}
}
