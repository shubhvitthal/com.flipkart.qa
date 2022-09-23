package com.flipkart.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.qa.Base.TestBase;
import com.flipkart.qa.Pages.HomePage;

public class HomePageTest extends TestBase{
	
	
	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}
	
//	@AfterClass
//	public void teardown() {
//		driver.close();
//	}

	@Test
	public void FlipkartHomepageTest(){
		
		HomePage hp= new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		hp.HomePagePopupHandle();
	//	hp.HoverToProductList("Beauty, Toys & More");
		
		
	//	hp.SetSearchBoxAndClick("Mobiles");
//		hp.VerifyHomepageFlipkartLogo();
//		hp.VerifyHomepageSearchTab();
//		hp.VerifyHomePageSearchTabBtn();
//		hp.VerifyHomePageLoginBtn();
//		hp.VerifyHomePageBecomeSellerLink();
//		hp.VerifyHomePageMoreBtnLink();
//		hp.VerifyHomePageCartBtnLink();
//		hp.VerifyHomePageExplorePlusLink();
//		hp.VerifyHomePageFooterBankCardImg();
//		hp.VerifyHomePageProductList();
//		hp.VerifyHomePageMostSearch();
//		hp.VerifyHomePageAboutFooterLinks();
//		hp.VerifyHomePageHelpFooterLinks();
//		hp.VerifyHomePagePolicyFooterLinks();
//		hp.VerifyHomePageSocialFooterLinks();
//		hp.VerifyHomePageBottomFooterLinks();
		
	}
	
//	@Test
//	public void HomepageItemCollection() {
//	
//	}
	

}
