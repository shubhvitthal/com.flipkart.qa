package com.flipkart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.flipkart.qa.Base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement EmailOrMobile;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']") private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement loginButn;
	@FindBy(xpath="//button[text()='Request OTP']") private WebElement reqstOTP;
	@FindBy(xpath="//a[@class='_14Me7y']") private WebElement createNewAcc;
	@FindBy(xpath="//span[text()='Login']") private WebElement loginText;
	@FindBy(xpath="//p[@class='_1-pxlW']/span") private WebElement tagline;
	@FindBy(xpath="//a[@class='_2ARnXM']") private WebElement TrmsOfUse;
	@FindBy(xpath="//a[@class='_2ARnXM']") private WebElement privacyPolicy;
	@FindBy(xpath="//span[@class='_2YULOR']/span") private WebElement mobEmilErroMsg;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement closeloginpopup;
	@FindBy(xpath="//a[@class='_2QKxJ- _2_DUc_']") private WebElement forgotlink;
//	@FindBy(xpath="value") private WebElement element;
	
	
	//===========Initialize using the Constructor===============
	public LoginPage(WebDriver dirver) {
		PageFactory.initElements(driver, this);
	}
	//=======================================================
	
	
	//============Methods================
	
	
	public void VerifyLogInTextpresent() {
		Assert.assertTrue(loginText.isDisplayed(),"Login Text is not displayed on Login Page");
		Assert.assertEquals(loginText.getText(), "Login");
		Reporter.log("VerifyLogInTextpresent", true);
	}
	
	public void VerifyLogInTaglinText() {
		Assert.assertTrue(tagline.isDisplayed(),"Tagline test is not displayed on Login Page");
		Assert.assertEquals(tagline.getText(), "Get access to your Orders, Wishlist and Recommendations");
		Reporter.log("VerifyLogInTaglinText", true);
	}

	public void VerifyLogInForgotLink() {
		Assert.assertTrue(forgotlink.isDisplayed(), "Forgot? link is not displayed on login Page");
		Reporter.log("VerifyLogInForgotLink", true);
	}


	public void VerifyLogInPageCloseLoginPopupBtn() {
		Assert.assertTrue(closeloginpopup.isDisplayed(), "Close login Page button is not present on login Page");
		Reporter.log("VerifyLogInPageCloseLoginPopupBtn", true);
	}
	
	public void VerifyCreateNewAccLink() {
		Assert.assertTrue(createNewAcc.isDisplayed(), "Create New Account link is not displayed");
		Assert.assertEquals(createNewAcc.getText(),"New to Flipkart? Create an account");
		Reporter.log("VerifyCreateNewAccLink", true);
		
	}

	public void VerifyRequestOTPButton() {
		Assert.assertTrue(reqstOTP.isDisplayed(), "Login Button is not displayed");
		Assert.assertTrue(reqstOTP.isEnabled(), "Login Buttonis not Enabled");
		Reporter.log("VerifyRequestOTPButton", true);
	}

	
	public void SetLoginEmailOrMobileNo() {
		Assert.assertTrue(EmailOrMobile.isDisplayed(), "Email or mobile Tab is not displayed");
		Assert.assertTrue(EmailOrMobile.isEnabled(), "Email or mobile Tab is not Enabled");
		EmailOrMobile.sendKeys("Ramcharan");
		Reporter.log("SetLoginEmailOrMobileNo", true);
	}
	
	public void SetLoginPassword() {
		Assert.assertTrue(password.isDisplayed(), "Password Tab is not displayed");
		Assert.assertTrue(password.isEnabled(), "Password Tab is not Enabled");
		password.sendKeys("Bahubali");
		Reporter.log("SetLoginPassword", true);
	}

	public void ClickLoginButton() {
		Assert.assertTrue(loginButn.isDisplayed(), "Login Button is not displayed");
		Assert.assertTrue(loginButn.isEnabled(), "Login Buttonis not Enabled");
		loginButn.click();
		Reporter.log("ClickLoginButton", true);
	}


	public void VerifyMobileEmailErrorMsg() {
		Assert.assertEquals(mobEmilErroMsg.getText(), "Please enter valid Email ID/Mobile number");
		Reporter.log("VerifyMobileEmailErrorMsg",true);
		Reporter.log("ErrorMsg : "+mobEmilErroMsg.getText());
	}

	
	
	
	
	
}
