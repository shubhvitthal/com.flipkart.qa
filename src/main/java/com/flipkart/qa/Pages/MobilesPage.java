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
import com.flipkart.qa.Utility.Utils;

public class MobilesPage extends TestBase {

	@FindBy(xpath="//span[text()='Electronics']")  private WebElement Electronics;
	//span[@class='_2I9KP_'][1]
	@FindBys({@FindBy(xpath="//div[@class='_331-kn']//span")}) private List <WebElement> ProcuctList;//9
	@FindBys({@FindBy(xpath="//div[@class='_1QrT3s']//a")}) private List <WebElement> FullElectronicList;//9

	@FindBys({@FindBy(xpath="//div[@class='_1YokD2 _3Mn1Gg']//a")}) private List <WebElement> AllMobile;
	
	//===============initialize using the constructor=============

	
	public MobilesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//====================Methods=============================

	public void HoverToProductist() {
		for(int i=0; i<ProcuctList.size(); i++) {
			WebElement product = ProcuctList.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(product).build().perform();
			Reporter.log("Product List: "+product.getText());
		}
	}

	
	public void ClickOnElectronics() {
		//Assert.assertTrue(Electronics.isDisplayed(),"Electronics is not displayed");
		Electronics.click();
	}
	
	public void ChooseAnyFromElectronics(String ChooseFrElctnic) {
		
		for(int i=0; i<FullElectronicList.size();i++) {
			if(FullElectronicList.get(i).getText().equalsIgnoreCase(ChooseFrElctnic)) {
				FullElectronicList.get(i).click();
				break;
			}
		}
		
	}
	
	
	public void CollectAllElectronicsData() {
		for(int i=0; i<FullElectronicList.size(); i++) {
			WebElement EleData = FullElectronicList.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(EleData).build().perform();
			System.out.println(EleData.getText());
		}
	}
	
	
//	public void HoverAllmobiles() {
//		for(int i=0; i<AllMobile.size(); i++) {
//			WebElement mob = AllMobile.get(i);
//			Actions action = new Actions(driver);
//			action.moveToElement( mob ).build().perform();
//			System.out.println( mob.getText());
//		}
//	}

	
	
	
	public void SelectAnyMobile(String SelectMobile) {
		
		for(int i=0; i<AllMobile.size();i++) {
			if(AllMobile.get(i).getText().equalsIgnoreCase(SelectMobile)) {
				WebElement selm = AllMobile.get(i);
				
				selm.click();
				
				break;
			}
		}
		
	}


	
	
	
	
	
}
