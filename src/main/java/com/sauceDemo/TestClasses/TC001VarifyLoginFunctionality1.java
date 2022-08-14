package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.Utilityclasses.ScreenShotClass;

public class TC001VarifyLoginFunctionality1 extends TestBaseClass
{	
	
	@Test
	public void loginFunctionality() throws IOException 
	{
		String expectedTitle= "Swag Labs";
		String actualTitle= driver.getTitle();
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("TC is pass");
//		}
//		else
//		{
//			System.out.println("TC is fail");
//
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		logs.info("Assertion Applied");

		ScreenShotClass.takeScreenshotMethod(driver);
		logs.info("Screenshot Taken");


}
}
