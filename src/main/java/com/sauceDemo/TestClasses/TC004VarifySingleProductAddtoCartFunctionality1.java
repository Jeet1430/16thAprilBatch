package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.Utilityclasses.ScreenShotClass;
import com.souceDemo.POMClasses.HomePOMPage2;

public class TC004VarifySingleProductAddtoCartFunctionality1 extends TestBaseClass 
{
	
	@Test
	public void multipleProductAddToCart() throws IOException 
	{
		HomePOMPage2 hp= new HomePOMPage2(driver);
		hp.clickOnMulitpleProducts();
		
		String actualCount= hp.getTextFromCartSymbol();
		String expectedCount = "6";
		
		if(actualCount.equals(expectedCount))
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("TC is fail");

		}
		
		Assert.assertEquals(actualCount, expectedCount);
		logs.info("Assertion applied");

		ScreenShotClass.takeScreenshotMethod(driver);
		logs.info("Screenshot taken");
	}

}

