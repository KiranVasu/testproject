package com.pages;

import org.openqa.selenium.WebDriver;

import com.data.UserData;

public class HomePage extends CommonPage {

	private String URL;

	public HomePage(WebDriver driver, String url) {
		super(driver);
		this.URL = url;
	}

	public HomePage getHomePage() {
		driver.navigate().to(URL);
		return this;
	}

	public SignupPage getSignupPage() {
		this.clickLink("Sign up");
		return new SignupPage(driver);
	}

	public SigninPage getSigninPage() {
		this.clickLink("Sign in");
		return new SigninPage(driver);

	}

}
