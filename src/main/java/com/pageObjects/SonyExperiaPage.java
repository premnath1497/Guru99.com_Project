package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SonyExperiaPage extends TestBase {
	
	public SonyExperiaPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//span[@id='product-price-1']/span")
	private WebElement mobilePriceOnSonyExperiaPageEle;
	
	public String getPriceOnSonyExperiaPage() {
		String actualPriceOnSonyExperiaPage=mobilePriceOnSonyExperiaPageEle.getText();
		return actualPriceOnSonyExperiaPage;
	}
	
	public void cliconAddToCartBtn() {
		addToCartBtn.click();
	}

}
