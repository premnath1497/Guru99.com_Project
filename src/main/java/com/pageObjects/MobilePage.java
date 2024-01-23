package com.pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;
import com.TestBase.TestData;


public class MobilePage extends TestBase {

	public MobilePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//select[@title='Sort By'])[1]")
	public WebElement dropdownelement;

	@FindBy(xpath = "//span[@id='product-price-1']/span")
	private WebElement mobilePriceOnMobilePageEle;

	@FindBy(id = "product-collection-image-1")
	private WebElement sonyExperiaMobileEle;

	@FindBy(xpath = "//a[text()='IPhone']/../following-sibling::div[@class='actions']/ul//a[text()='Add to Compare']")
	private WebElement addToCompareIphoneEle;

	@FindBy(xpath = "//a[text()='Sony Xperia']/../following-sibling::div[@class='actions']/ul//a[text()='Add to Compare']")
	private WebElement addToCompareSonyExperiaEle;

	@FindBy(xpath = "//button[@title='Compare']")
	private WebElement compareBtn;

	@FindBy(xpath = "//span[.='Close Window']")
	private WebElement closeWindowBtn;

	@FindBy(xpath = "//h2//a[@title='IPhone']")
	private WebElement textOfIphoneEle;

	@FindBy(xpath = "//h2//a[@title='Sony Xperia']")
	private WebElement textOfSonyXperiaEle;

	public void clickOnCloseWindowButton() {
		closeWindowBtn.click();
	}

	public String getTextofIphoneOnChildWindow() {
		String actualTextOfIphoneonchildWindow = textOfIphoneEle.getText();
		return actualTextOfIphoneonchildWindow;
	}

	public String getTextofSonyExperiaOnChildWindow() {
		String actualTextOfSonyExperiaonchildWindow = textOfSonyXperiaEle.getText();
		return actualTextOfSonyExperiaonchildWindow;
	}

	public void switchtochildWindow() {
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		String childwindow = addr.get(1);
		driver.switchTo().window(childwindow);
	}

	public void clickOnCompareBtn() {
		compareBtn.click();
	}

	public void clickonaddtocompareIphoneBtn() {
		addToCompareIphoneEle.click();
	}

	public void clickonaddtocompareSonyExperiaBtn() {
		addToCompareSonyExperiaEle.click();
	}

	public String getTitleOfMobilePage() {
		String actualTitleOfMobilePage = driver.getTitle();
		return actualTitleOfMobilePage;
	}

	public String getPriceOnMobilePage() {
		String actualTitleOfMobilePage = mobilePriceOnMobilePageEle.getText();
		return actualTitleOfMobilePage;
	}

	public void clickOnSonyExperiaMobile() {
		sonyExperiaMobileEle.click();
	}

	public void scrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	public void dropdownSelect(WebElement ele) {

		Select s = new Select(ele);
		s.selectByVisibleText(TestData.dropdowntext);

	}
}
