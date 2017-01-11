package com.pages;

import org.openqa.selenium.WebDriver;

public class Snippet extends CommonPage {

	public Snippet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AddSnippet addSnippet() {
		this.setNameTextField("snippet", "sample snippet");
		this.clickXPathButton("//input[@type=\"submit\"]");
		return new AddSnippet(driver);
	}

}
