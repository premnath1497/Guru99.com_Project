package com.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestBase.TestData;

public class MobileListTestCase extends TestBase {

	@Test
	public void verifyTitleOfHomePage() {

		Assert.assertEquals(home.getTitleOfHomePage(), TestData.expectedHomePageTitle);

	}

	@Test
	public void verifyTextOfHomePage() {

		Assert.assertEquals(home.getTextOfHomePage(), TestData.expectedTextOfHomePage);
	}
	
	@Test
	public void verifyTitleOfMobilePage() {
		home.clickOnMobileButton();
		Assert.assertEquals(mobile.getTitleOfMobilePage(), TestData.expectedTitleofMobilePage);
	}
	
	@Test
	public void verifyDrodownSelectbyNameText() throws IOException {
		home.clickOnMobileButton();
		mobile.dropdownSelect(mobile.dropdownelement);
		screenshot();
	}
	


}
