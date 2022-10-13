package org.tester.stepdefinition;

import org.tester.core.BaseSetup;
import org.tester.pagefactory.LoginPageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseSetup {
	public LoginPageFactory objLoginPage;
	@Before
	public void setup() {
		BaseSetup.initializeTestBaseSetup();
		objLoginPage= new LoginPageFactory(BaseSetup.driver);
	}
	
	

	@After
	public void quit() {
		BaseSetup.tearDown();
	}

	@Given("User is on Webmate Login Page")
	public void user_is_on_webmate_login_page() {
		objLoginPage.verifyTitle(BaseSetup.driver.getTitle(),"webmate by Testfabrik");
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String email, String password) {
		objLoginPage.enterCredentials(email, password);
	
	}

	@Then("Verify user is logged in and perform sign out")
	public void verify_user_is_logged_in_and_perform_sign_out() {
		objLoginPage.signIn();

	}

}
