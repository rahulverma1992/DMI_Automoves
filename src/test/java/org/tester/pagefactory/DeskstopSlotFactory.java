package org.tester.pagefactory;


import org.openqa.selenium.WebDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tester.core.UIActions;

public class DeskstopSlotFactory {

	WebDriver driver;
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	@FindBy(xpath = "//div[@class='wm-card wm-projectsummary-card ng-star-inserted']")
	WebElement HoverOnProject;
	
	@FindBy(xpath = "//button[contains(.,'OPEN')]")
	WebElement OpenProject;
	
	@FindBy(xpath = "(//div[@class='wm-sidenav-item-logo'])[4]")
	WebElement DevicesOptions;

	@FindBy(xpath = "(//span[contains(.,'Deploy device')])[2]")
	WebElement DeployDevices;
	
	@FindBy(xpath = "(//div[@class='wm-m-deployable-name'])[1]")
	WebElement SelectingDevices1;
	
	@FindBy(xpath = "(//div[@class='wm-m-deployable-name'])[2]")
	WebElement SelectingDevices2;
	
	@FindBy(xpath = "(//div[@class='wm-m-deployable-name'])[3]")
	WebElement SelectingDevices3;
	
	@FindBy(xpath = "(//div[@class='wm-m-deployable-name'])[4]")
	WebElement SelectingDevices4;
	
	@FindBy(xpath = "//span[contains(.,'DEPLOY')]")
	WebElement Deploy;
	
	@FindBy(xpath = "( //span[@class='label'])[1]")
	WebElement AccessDevice;
	
	@FindBy(xpath = "( //span[@class='label'])[3]")
	WebElement DeleteDevice;
	
	@FindBy(xpath = "//button[@class='wmbtn invert clickable wm-l-dialog-confirm']")
	WebElement ConfirmDeleteDevice;
	
	
	
	
	
	
	public DeskstopSlotFactory(WebDriver driver) {
		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClicktoOpenDevicesOption() {
		UIActions.fluentWait(DevicesOptions, driver);
		DevicesOptions.click();
	}

	public void ClickToDeployDevices() {
		UIActions.fluentWait(DeployDevices, driver);
		DeployDevices.click();
	}
	public void HoverOverProject() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(HoverOnProject).perform();
		OpenProject.click();
	}
   public void ClickAvailableDevices() throws InterruptedException, AWTException {
		
		
	    if (SelectingDevices1.isEnabled()) {
	    	SelectingDevices1.click();
	    	Thread.sleep(3000);
	    	Deploy.click();
	    	Thread.sleep(28000);
	    	AccessDevice.click();
	    	Thread.sleep(28000);
	    	Robot robot = new Robot();
	    	 robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_TAB);
             Thread.sleep(8000);
             DeleteDevice.click();
             Thread.sleep(8000);
             ConfirmDeleteDevice.click();
             Thread.sleep(9000);

	        
	}
	    
	   
	    else if (SelectingDevices2.isEnabled()) {
	    	SelectingDevices2.click();
	    	Thread.sleep(3000);
	    	Deploy.click();
	    	Thread.sleep(28000);
	    	AccessDevice.click();
	    	Thread.sleep(28000);
	    	Robot robot = new Robot();
	    	 robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_TAB);
             Thread.sleep(8000);
             DeleteDevice.click();
             Thread.sleep(8000);
             ConfirmDeleteDevice.click();
             Thread.sleep(9000);
	    }
	    
	      else if (SelectingDevices3.isEnabled()) {
	    	SelectingDevices3.click();
	    	Thread.sleep(3000);
	    	Deploy.click();
	    	Thread.sleep(28000);
	    	AccessDevice.click();
	    	Thread.sleep(28000);
	    	Robot robot = new Robot();
	    	 robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_TAB);
             Thread.sleep(8000);
             DeleteDevice.click();
             Thread.sleep(8000);
             ConfirmDeleteDevice.click();
             Thread.sleep(9000);
	    }
	   
	      else if (SelectingDevices4.isEnabled()) {
	    	SelectingDevices4.click();
	    	Thread.sleep(3000);
	    	Deploy.click();
	    	Thread.sleep(28000);
	    	AccessDevice.click();
	    	Thread.sleep(28000);
	    	Robot robot = new Robot();
	    	 robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_TAB);
             Thread.sleep(8000);
             DeleteDevice.click();
             Thread.sleep(8000);
             ConfirmDeleteDevice.click();
             Thread.sleep(9000);
	    }
	    else {System.out.println("Devices not available");}
   }
	     }	      
	

