package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.Utilityclasses.ScreenShotClass;
import com.souceDemo.POMClasses.HomePOMPage2;

public class TC002VarifyLogoutFunctionality1 extends TestBaseClass 
{
	
	@Test
	public void logOutFunctionaliy() throws IOException
	{
		HomePOMPage2 hp= new HomePOMPage2(driver);
		hp.clickOnOpenMenu();
		hp.clickOnLogout();
		
		
		String expectedTitle="Swag Labs";
		String actualTitle= driver.getTitle();
		 
		 
		 if(expectedTitle.equals(actualTitle))
		 {
			 System.out.println("TC is pass");
		 }
		 
		 else
		 {
			 System.out.println("TC is fail");

		 }
		 
		 Assert.assertEquals(actualTitle, expectedTitle);
		logs.info("Assertion applied");

		ScreenShotClass.takeScreenshotMethod(driver);
		logs.info("Screenshot taken");

	}
}

