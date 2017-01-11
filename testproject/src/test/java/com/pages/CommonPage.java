package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {

	WebDriver driver;

	/**
	 * Assign the webdriver to get the web elements this is dynamic and can be
	 * used for all drivers since we are not initialising any driver here.
	 * 
	 * @param driver
	 */
	public CommonPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setIDTextField(String id, String text) {
		WebElement idTextElement = driver.findElement(By.id(id.trim()));
		idTextElement.clear();
		idTextElement.sendKeys(text);
	}

	public void setNameTextField(String name, String text) {
		WebElement nameTextElement = driver.findElement(By.name(name.trim()));
		nameTextElement.clear();
		nameTextElement.sendKeys(text);
	}

	public void clickLink(String elementId) {
		WebElement linkElement = driver.findElement(By.linkText(elementId));
		linkElement.click();
	}

	public void clickPartialLink(String elementId) {
		WebElement partialLinkElement = driver.findElement(By.partialLinkText(elementId));
		partialLinkElement.click();
	}

	public void clickIDButton(String elementId) {
		WebElement loginIDButton = driver.findElement(By.id(elementId.trim()));
		loginIDButton.click();
	}

	public void clickNameButton(String elementId) {
		WebElement loginNameButton = driver.findElement(By.id(elementId.trim()));
		loginNameButton.click();
	}

	public void clickXPathButton(String xpathElement) {
		WebElement loginXPathButton = driver.findElement(By.xpath(xpathElement));
		loginXPathButton.click();
	}

}
