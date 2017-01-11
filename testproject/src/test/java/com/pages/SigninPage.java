package com.pages;

import org.openqa.selenium.WebDriver;

import com.data.UserData;

public class SigninPage extends CommonPage {

	public SigninPage(WebDriver driver) {
		super(driver);
	}

	public WelcomePage loginToAccount(UserData data) {
		this.setNameTextField("uid", data.getUserName());
		this.setNameTextField("pw", data.getPassword());
		this.clickXPathButton("//input[@type=\"submit\"]");
		return new WelcomePage(driver);
	}

}
