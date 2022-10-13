package org.tester.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.tester.core.UIActions;

public class LoginPageFactory {
	
	WebDriver driver;
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	@FindBy(how=How.CSS, using ="input[data-testing-id=\"login-userfield\"]")
	WebElement emailaddress;
	
	@FindBy(how=How.CSS, using ="input[data-testing-id=\"login-passwordfield\"]")
	WebElement password;
	
	@FindBy(how=How.CSS, using ="input[data-testing-id=\"login-submit-button\"]")
	WebElement signin;
	
	public LoginPageFactory(WebDriver driver) {
		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredentials(String email,String Password)
	{
		emailaddress.sendKeys(email);
		password.sendKeys(Password);
	}
	
	public void verifyTitle(String actualTitle, String expectedTitle)
	{
		UIActions.implicitwait(driver);
		UIActions.assertion(actualTitle,expectedTitle);
	}
	
	public void signIn()
	{
		signin.click();
		UIActions.implicitwait(driver);
	}
}
