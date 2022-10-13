package org.tester.core;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseSetup {
     protected static WebDriver driver;

	private static void setDriver(String browserType, String appURL) throws MalformedURLException {

		switch (browserType) {
		case "Chrome":
			driver = initChromeDriver(appURL);
			break;
		case "Firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "IE":
			driver = initIEDriver(appURL);
			break;
		case "Safari":
			driver = initSafariDriver(appURL);
			break;
		default:
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initIEDriver(String appURL) {
		driver = WebDriverManager.iedriver().create();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		driver = WebDriverManager.firefoxdriver().create();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	private static WebDriver initSafariDriver(String appURL) {
		driver = WebDriverManager.safaridriver().create();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	public static void initializeTestBaseSetup() {
		try {
			Properties prop=new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
			prop.load(ip);
			String browserType = prop.getProperty("browser");
			String appURL = prop.getProperty("appURL");
			setDriver(browserType, appURL);
		} catch (Exception e) {
			System.out.println("Error....." + e.getMessage() + e);
		}
	}
	public static void tearDown() {
		driver.quit();
	}

}