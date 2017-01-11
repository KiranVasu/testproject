package com.pages;

import org.openqa.selenium.WebDriver;

import com.data.UserData;

public class SignupPage extends CommonPage {

	public SignupPage(WebDriver driver) {
		super(driver);
	}

	public CreateAccount getAccount(UserData data) {
		this.setNameTextField("uid", data.getUserName());
		this.setNameTextField("pw", data.getPassword());
		this.clickXPathButton("//input[@type=\"submit\"]");
		return new CreateAccount(driver);
	}

}
