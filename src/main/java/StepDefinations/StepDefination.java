package StepDefinations;

import Tests.TestLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends TestLogin {
	
	
	
	@Given("I landed on OrangeHRM Login Page")
	public void I_landed_on_OrangeHRM_Login_Page()
	{
		openURL();
	}
	
	@Given ("^I Logged into the application with (.+) and (.+)$")
	public void I_Logged_into_the_application_with_username_and_password(String username, String password)
	{
		loginToApp(username,password);
	}
	
	@When("^I click on (.+)$")
	public void I_click_on_link(String link) throws InterruptedException
	{
		clickOnAdmin(link);
	}
	
	@Then ("page is loaded successfully")
	public void page_is_loaded_successfully()
	{
		getURL();
	}

	@And("application is closed")
	public void application_is_closed()
	{
		closeApplication();
	}
}
