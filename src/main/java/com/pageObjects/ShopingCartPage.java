package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;
import com.TestBase.TestData;

public class ShopingCartPage extends TestBase {
	
	public ShopingCartPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Qty']")
	private  WebElement qty;
	
	@FindBy(xpath="//button[@title='Update']")
	private WebElement updateBtn;
	
	@FindBy(xpath="//li[@class='error-msg']/ul/li/span")
	private WebElement errormsgEle;
	
	@FindBy(xpath="//button[@title='Empty Cart']")
	private WebElement emptycartButton;
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	private WebElement emptycartText;
	
	public String actualEmptyCartMessageText() {
		String emptycartMessage=emptycartText.getText();
		return emptycartMessage;
	}
	
	
	public String actualgetErrorMessageText() {
		String errorMsg=errormsgEle.getText();
		return errorMsg;
	}
	
	public void clickOnUpdateButton() {
		updateBtn.click();
	}
	public void sendQty() {
		qty.sendKeys(TestData.qty);
	}
	
	public void clickOnEmptyCartButton() {
		emptycartButton.click();
	}

}
