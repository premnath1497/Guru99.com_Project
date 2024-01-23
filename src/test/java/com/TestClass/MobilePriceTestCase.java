package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class MobilePriceTestCase extends TestBase {
	
	@Test
	public void verifyMobilePrice() {
		
		home.clickOnMobileButton();
		String priceonMobilePage=mobile.getPriceOnMobilePage();
		mobile.clickOnSonyExperiaMobile();
		String priceOnSonyXperiaPage=sonymobilePage.getPriceOnSonyExperiaPage();
		Assert.assertEquals(priceonMobilePage,priceOnSonyXperiaPage );
		
	}

}
