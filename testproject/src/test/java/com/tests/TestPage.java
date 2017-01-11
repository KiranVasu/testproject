package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.data.UserData;
import com.drivers.DriverUtility;
import com.pages.AddSnippet;
import com.pages.CreateAccount;
import com.pages.HomePage;
import com.pages.SigninPage;
import com.pages.SignupPage;
import com.pages.Snippet;
import com.pages.Upload;
import com.pages.WelcomePage;

public class TestPage {
	DriverUtility driver = new DriverUtility();

	@Test
	public void testScenario() throws InterruptedException {
		WebDriver firefoxDriver = driver.getDriver("FIREFOX");
		HomePage homePage = new HomePage(firefoxDriver, "https://google-gruyere.appspot.com/422624939850/")
				.getHomePage();
		SignupPage signupPage = homePage.getSignupPage();
		Thread.sleep(1000);
		CreateAccount crAccount = signupPage.getAccount(UserData.VALIDUSER);
		Thread.sleep(1000);
		homePage = crAccount.getHomePage();
		Thread.sleep(1000);
		SigninPage signPage = homePage.getSigninPage();
		Thread.sleep(1000);
		WelcomePage wpage = signPage.loginToAccount(UserData.VALIDUSER);
		Thread.sleep(2000);
		Snippet snip = wpage.getSnippet();
		Thread.sleep(1000);
		AddSnippet adsni = snip.addSnippet();
		Thread.sleep(1000);
		Upload upload = adsni.uploadDocument();
		Thread.sleep(1000);
		upload.readFilePathAndUpload("/Users/kirangorantla/Documents/test.txt");
	}

}
