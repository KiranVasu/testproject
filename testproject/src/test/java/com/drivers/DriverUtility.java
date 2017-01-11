package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtility {
	private WebDriver driver;

	public WebDriver getDriver(String browserName) {
		switch (browserName) {
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "/Users/kirangorantla/Downloads/geckodriver");
			driver = new FirefoxDriver();
			break;
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "SAFARI":
			driver = new SafariDriver();
		default:
			throw new IllegalArgumentException("Invalid browser: " + browserName);
		}
		return driver;
	}

}
