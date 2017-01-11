package com.pages;

import org.openqa.selenium.WebDriver;

public class Upload extends CommonPage {

	public Upload(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void readFilePathAndUpload(String filePath) throws InterruptedException {
		this.setNameTextField("upload_file", filePath);
		Thread.sleep(1000);
		this.clickXPathButton("//input[@type=\"submit\"]");
	}

}
