package org.tester.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumCapabilitiesFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='wm-card wm-projectsummary-card ng-star-inserted']")
	WebElement HoverOnProject;
	
	@FindBy(xpath = "//button[contains(.,'OPEN')]")
	WebElement OpenProject;
	
	@FindBy(xpath = "//img[@class='wm-sidenav-item-logo-apps']")
	WebElement ClickOnApps;
	
	@FindBy(xpath = "//img[@src='/assets/apps/builtin/seleniumservice/images/app_logo.svg']")
	WebElement ClickOnSeleniumServices;
	
	@FindBy(xpath = "//button[contains(.,'Show Capabilities')]")
	WebElement ClickOnShowCapabilities;
	
	@FindBy(xpath = "(//div[@class='wm-m-browserchooser-archetype red'])[1]")
	WebElement SelectCapabilitiesOptions;
	
	@FindBy(xpath = "//div[@class='copy-to-clipboard-button']")
	WebElement ClicktoCopyCapabilities;
	
	public SeleniumCapabilitiesFactory(WebDriver driver) {
		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void HoverOverProject() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(HoverOnProject).perform();
		OpenProject.click();
		
	}
public void OpenApps() throws InterruptedException {
	Thread.sleep(4000);
	ClickOnApps.click();
	
	
}
public void SeleniumCapabilities() throws InterruptedException {
	Thread.sleep(4000);
	ClickOnApps.click();
	Thread.sleep(2000);
	ClickOnSeleniumServices.click();
	Thread.sleep(2000);
	ClickOnShowCapabilities.click();
	Thread.sleep(12000);
	SelectCapabilitiesOptions.click();
	Thread.sleep(4000);
	ClicktoCopyCapabilities.click();
	Thread.sleep(2000);
	
}
}
