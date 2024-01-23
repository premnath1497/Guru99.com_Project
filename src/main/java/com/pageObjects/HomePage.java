package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Mobile']")
	private WebElement mobileButton;
	
	@FindBy(xpath="//h2")
	private WebElement textOfHomepage;
	
	
	public String getTitleOfHomePage() {
		String actualTitleOfHomePage=driver.getTitle();
		return actualTitleOfHomePage;
	}
	
	public String getTextOfHomePage() {
		String actualTextOfHomePage=textOfHomepage.getText();
		return actualTextOfHomePage;
	}

	public void clickOnMobileButton() {
		mobileButton.click();
	}
	

}
