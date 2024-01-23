package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestBase.TestData;

public class HandlingWindows extends TestBase {
	
	       @Test
           public void verifyCompareOfTwoProducts() {
        	   home.clickOnMobileButton();
        	   mobile.scrollDownPage();
        	   mobile.clickonaddtocompareIphoneBtn();
        	   mobile.scrollDownPage();
        	   mobile.clickonaddtocompareSonyExperiaBtn();
        	   mobile.clickOnCompareBtn();
        	   mobile.switchtochildWindow();
        	   System.out.println(driver.getTitle());
        	   System.out.println(mobile.getTextofIphoneOnChildWindow());
        	   System.out.println(mobile.getTextofSonyExperiaOnChildWindow());
        	   Assert.assertEquals(mobile.getTextofIphoneOnChildWindow(), TestData.mainWindowIphoneText);
        	   Assert.assertEquals(mobile.getTextofSonyExperiaOnChildWindow(), TestData.mainWindowSonyExperiaText);
               mobile.clickOnCloseWindowButton();
	       }

}
