package org.tester.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.tester.core.BaseSetup;
import org.tester.pagefactory.DeskstopSlotFactory;
import org.tester.pagefactory.LoginPageFactory;
import org.tester.pagefactory.SeleniumCapabilitiesFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	@AfterStep
	public void failedcasescreenshot(Scenario scenario) throws IOException
	{
		BaseSetup.failedscreenshot(scenario);
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

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
		objLoginPage.signIn();
	}
	@Given("User is on Webmate Devices Page.")
	public void user_is_on_webmate_devices_page1() throws InterruptedException {		
		DeskstopSlotFactory X= new DeskstopSlotFactory(driver);
		X.HoverOverProject();
		Thread.sleep(2000);
		X.ClicktoOpenDevicesOption();
		
	}

	@When("User is at devices slots in Project Page")
	public void user_is_at_devices_slots_in_project_page() throws InterruptedException {
		DeskstopSlotFactory X= new DeskstopSlotFactory(driver);
		Thread.sleep(2000);
		X.ClickToDeployDevices();
		Thread.sleep(9000);
	}

	@Then("User select available deskstop devices and deploy on it")
	public void user_select_available_deskstop_devices_and_deploy_on_it() throws InterruptedException, AWTException, IOException {
		DeskstopSlotFactory X= new DeskstopSlotFactory(driver);
		Thread.sleep(2000);
		X.ClickAvailableDevices();
		System.out.println("working so far");
	}
	@Given("User is on Webmate Devices Page..")
	public void user_is_on_webmate_devices_page() throws InterruptedException {
		SeleniumCapabilitiesFactory X = new SeleniumCapabilitiesFactory(driver);
		X.HoverOverProject();
		Thread.sleep(2000);

	}
	@When("User is at  Selenium Services Page")
	public void user_is_at_selenium_services_page() throws InterruptedException {
		SeleniumCapabilitiesFactory X = new SeleniumCapabilitiesFactory(driver);
		X.OpenApps();
		Thread.sleep(2000);
	}

	@Then("User is able to generate selenium capabilities for his Apps")
	public void user_is_able_to_generate_selenium_capabilities_for_his_apps() throws InterruptedException {
		SeleniumCapabilitiesFactory X = new SeleniumCapabilitiesFactory(driver);
		X.SeleniumCapabilities();
		Thread.sleep(2000);
	}


}
