package com.flipkart.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.flipkart.qa.Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")  private WebElement HomepagePopup;
	@FindBy(xpath="//img[@alt='Flipkart']") private WebElement HomepageFipktLogo;
	@FindBy(xpath="//input[@class='_3704LK']") private WebElement searchBox;
	@FindBy(xpath="//button[@class='L0Z3Pu']") private WebElement searchBtn;
	@FindBy(xpath="//a[@class='_1_3w1N']") private WebElement loginBtnlink;
	@FindBy(xpath="//div[@class='go_DOp']/a") private WebElement becomSellerlink;
	@FindBy(xpath="//div[@class='exehdJ']") private WebElement moreBtn;
	@FindBy(xpath="//div[@class='YUhWwv']/a") private WebElement CartBtnLink;
	@FindBy(xpath="//a[@class='_21ljIi']") private WebElement exprPlus;
	@FindBy(xpath="//div[@class='_2uz0vJ']/img") private  WebElement CardImage;
	@FindBy(xpath="//div[@class='_3wJI0x']") private WebElement signUpBtn;
	
	//=======================multiple elements===================
	@FindBys({@FindBy(xpath="//div[@class='_37M3Pb']//a")}) private List <WebElement> ProcuctList;//9
	@FindBys({@FindBy(xpath="//div[@class='_1GTrm1']/a")}) private List <WebElement> mostSearch;//262
	@FindBys({@FindBy(xpath="//div[@class='_2WErco row']//div[1]/a")}) private List <WebElement> Aboutfooter; //21
	@FindBys({@FindBy(xpath="//div[@class='_2WErco row']//div[2]/a")}) private List <WebElement> Helpfooter; //5
	@FindBys({@FindBy(xpath="//div[@class='_2WErco row']//div[3]/a")}) private   List <WebElement> Policyfooter;//6
	@FindBys({@FindBy(xpath="//div[@class='_2WErco row']//div[4]/a")}) private   List <WebElement> Socialfooter;//3
	@FindBys({@FindBy(xpath="//div[@class='_2uz0vJ']//a")}) private  List <WebElement> bottomlink;//4
	@FindBys({@FindBy(xpath="//ul[@class='pO9syL _1s9xSv']/li/a")}) private  List <WebElement> HoverLogin;//4
	
	
	
	//===============initialize using the constructor=============

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//====================Methods=============================
	
	
	
	
	
	public void HomePagePopupHandle() {
		HomepagePopup.click();
	}
	
	public void VerifyHomepageFlipkartLogo() {
		Assert.assertTrue(HomepageFipktLogo.isDisplayed(), "Flikart Logo Not displayed on Home Page");
		Reporter.log("VerifyHomepageFlipkartLogo", true);
	}
	
	//====================Search Tab===============
	public void VerifyHomepageSearchTab() {
		Assert.assertTrue(searchBox.isDisplayed(), "Search Tab is not present On Home Page");
		Assert.assertTrue(searchBox.isEnabled(), "Search Tab is not Enabled On Home Page");
		Reporter.log("VerifyHomepageSearchTab", true);
	}
	
	
	public void VerifyHomePageSearchTabBtn() {
		Assert.assertTrue(searchBtn.isDisplayed(), "Search Tab Button is not present On Home Page");
		Assert.assertTrue(searchBtn.isEnabled(), "Search Tab is Butoon Enabled On Home Page");
		Reporter.log("VerifyHomePageSearchTabBtn", true);
	}
	
	public void SetSearchBoxAndClick(String SerarchItem) {
		Assert.assertTrue(searchBox.isDisplayed(), "Search Tab is not present On Home Page");
		Assert.assertTrue(searchBox.isEnabled(), "Search Tab is not Enabled On Home Page");

		Assert.assertTrue(searchBtn.isDisplayed(), "Search Tab Button is not present On Home Page");
		Assert.assertTrue(searchBtn.isEnabled(), "Search Tab is Butoon Enabled On Home Page");
		
		searchBox.sendKeys(SerarchItem);
		searchBtn.click();
		Reporter.log("SetSearchBoxAndClick", true);
		
		
	}
	
	
	//=================logIn Button====================
	public void VerifyHomePageLoginBtn() {
		Assert.assertTrue(loginBtnlink.isDisplayed(), "Login Button is not present On Home Page");
		Reporter.log("VerifyHomePageLoginBtn", true);
	}

	public void SetHomePageLoginBtnClick() {
		Assert.assertTrue(loginBtnlink.isDisplayed(), "Login Button is not present On Home Page");
		Reporter.log("SetHomePageLoginBtnClick", true);
		loginBtnlink.click();
		
	}
	
	public void HoverToHomepageLoginBtnAndClick(String slectOptn) {
		for(int i=0;i<HoverLogin.size();i++) {
			if(HoverLogin.get(i).getText().equalsIgnoreCase(slectOptn)) {
				HoverLogin.get(i).click();
				break;
			}
		}
		
	}

	//===================SignUp btn=========================
	public void VerifyHomePageSignUpBtn() {
		Assert.assertTrue(signUpBtn.isDisplayed(), "Login Button is not present On Home Page");
		Reporter.log("VerifyHomePageSignUpBtn", true);
	}

	public void SetHomePageSignUpClick() {
		Assert.assertTrue(signUpBtn.isDisplayed(), "Login Button is not present On Home Page");
		Reporter.log("VerifyHomePageSignUpBtn", true);
		signUpBtn.click();
	}

	public void VerifyHomePageBecomeSellerLink() {
		Assert.assertTrue(becomSellerlink.isDisplayed(), "Become Sellerlink is not present On Home Page");
		Reporter.log("VerifyHomePageBecomeSellerLink", true);
	}

	public void VerifyHomePageMoreBtnLink() {
		Assert.assertTrue(moreBtn.isDisplayed(), "More Button is not present On Home Page");
		Reporter.log("VerifyHomePageMoreBtnLink", true);
	}

	public void VerifyHomePageCartBtnLink() {
		Assert.assertTrue(CartBtnLink.isDisplayed(), "Cart Button is not present On Home Page");
		Reporter.log("VerifyHomePageCartBtnLink", true);
	}

	public void VerifyHomePageExplorePlusLink() {
		Assert.assertTrue(exprPlus.isDisplayed(), "Explore Filpkart Plus is not present On Home Page");
		Reporter.log("VerifyHomePageExplorePlusLink", true);
	}

	
	public void VerifyHomePageFooterBankCardImg() {
		Assert.assertTrue(CardImage.isDisplayed(), "Footer Bank Cards Image is not present On Home Page");
		Reporter.log("VerifyHomePageFooterBankCardImg", true);
	}

	
	public void VerifyHomePageProductList() {
		Assert.assertEquals(ProcuctList.size(), 9,"Actual Products links not as per Requirement");
		Reporter.log("VerifyHomePageProductList", true);
		
	}

	//=============Selecting Options from Multiple Elements================
	
	
	public void SelectfromProductlist(String SelctOpn) {
		
		for(int i=0;i< ProcuctList.size();i++) {
			if( ProcuctList.get(i).getText().equalsIgnoreCase(SelctOpn)) {
				ProcuctList.get(i).click();
				break;
			}
		}
}

	public void HoverToProductList(String HovrProct) {
		
		for(int i=0;i<ProcuctList.size();i++) {
			
			if(ProcuctList.get(i).getText().equalsIgnoreCase(HovrProct)) {
				WebElement product = ProcuctList.get(i);
				Actions action= new Actions(driver);
				action.moveToElement(product).build().perform();
			}
			
		}
	}
	
	
	
	
	
	
	
	public void VerifyHomePageMostSearch() {
		Assert.assertEquals(mostSearch.size(), 262, "Actual Most search links not as per Requirement");
		Reporter.log("VerifyHomePageMostSearch", true);
	}
	
	public void VerifyHomePageAboutFooterLinks() {
		Assert.assertEquals(Aboutfooter.size(), 7, "Actual About footer links not as per Requirement");
		Reporter.log("VerifyHomePageAboutFooterLinks", true);
	}

	public void VerifyHomePageHelpFooterLinks() {
		Assert.assertEquals(Helpfooter.size(), 5, "Actual Help footer links not as per Requirement");
		Reporter.log("VerifyHomePageHelpFooterLinks", true);
	}

	
	public void VerifyHomePagePolicyFooterLinks() {
		Assert.assertEquals(Policyfooter.size(), 6, "Actual Help footer links not as per Requirement");
		Reporter.log("VerifyHomePagePolicyFooterLinks", true);
	}

	
	
	public void VerifyHomePageSocialFooterLinks() {
		Assert.assertEquals(Socialfooter.size(), 3, "Actual Help footer links not as per Requirement");
		Reporter.log("VerifyHomePageSocialFooterLinks", true);
	}

	public void VerifyHomePageBottomFooterLinks() {
		Assert.assertEquals(bottomlink.size(), 4, "Actual Help footer links not as per Requirement");
		Reporter.log("VerifyHomePageBottomFooterLinks", true);
	}

	
	
	
}
