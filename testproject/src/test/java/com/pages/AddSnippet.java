package com.pages;

import org.openqa.selenium.WebDriver;

public class AddSnippet extends CommonPage {

	public AddSnippet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Upload uploadDocument() {
		this.clickLink("Upload");
		return new Upload(driver);
	}

}
