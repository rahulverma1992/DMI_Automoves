package org.tester.core;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class UIActions {
	// Generic code for scrolling to a particular element
	public static void scrollDownToElement(WebElement element, WebDriver driver) {
		// Scroll down to particular element sent from page factory
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Generic code for Fluent Wait
	public static void fluentWait(WebElement element, WebDriver driver) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// Generic code for Implicit wait
	public static void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// Assert Item is displayed
	public static void assertDisplayed(WebElement element) {
		boolean t = element.isDisplayed();
		if (t) {
			System.out.println("Element is dispalyed:-"+element.getText());
		} else {
			System.out.println("Element is not dispalyed");
		}

	}

	// Window Handle
	public static void windowHandle(String currentHandle, WebDriver driver) {
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(currentHandle)) {
				// Switch to the opened tab
				driver.switchTo().window(actual);
			}
		}
	}
	
	// Generic code for taking screenshot
		public static byte[] capture(WebDriver driver) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src= ts.getScreenshotAs(OutputType.BYTES);
			return src;
		}
	
	public static void assertion(String actualTitle,String expectedTitle)
	{
		Assert.assertEquals(actualTitle, actualTitle);
	}

}
