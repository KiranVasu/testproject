package com.pages;

import org.openqa.selenium.WebDriver;

public class CreateAccount extends CommonPage {

	public CreateAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public HomePage getHomePage() {
		return new HomePage(driver, "https://google-gruyere.appspot.com/422624939850/").getHomePage();
	}

}
