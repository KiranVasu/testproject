package com.pages;

import org.openqa.selenium.WebDriver;

public class WelcomePage extends CommonPage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	public Snippet getSnippet() {
		this.clickPartialLink("New");
		return new Snippet(driver);
	}

	public Upload uploadDocument() {
		this.clickLink("Upload");
		return new Upload(driver);
	}

}
