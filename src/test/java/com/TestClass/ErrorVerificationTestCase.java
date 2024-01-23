package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestBase.TestData;

public class ErrorVerificationTestCase extends TestBase{
	
	@Test
	public void verifyErrorMssage() {
		home.clickOnMobileButton();
		mobile.clickOnSonyExperiaMobile();
		sonymobilePage.cliconAddToCartBtn();
		shopingCartPage.sendQty();
		shopingCartPage.clickOnUpdateButton();
		Assert.assertEquals(shopingCartPage.actualgetErrorMessageText(),TestData.expectedErrorMsg);
		shopingCartPage.clickOnEmptyCartButton();
		Assert.assertEquals(shopingCartPage.actualEmptyCartMessageText(),TestData.expectedupdateCartErrorMsg);
		
	
	}

}
