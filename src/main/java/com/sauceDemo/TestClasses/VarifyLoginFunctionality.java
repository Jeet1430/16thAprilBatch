package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.Utilityclasses.ScreenShotClass;
import com.souceDemo.POMClasses.LoginPOMPage1;

public class VarifyLoginFunctionality 
{
	public static void main(String[] args) throws IOException, InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","E:\\JEET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get method --> url open
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//TakeScreenshot
		ScreenShotClass.takeScreenshotMethod(driver);
		
		LoginPOMPage1 login= new LoginPOMPage1(driver);
		login.sendUsername();
		login.sendPassword();
		login.loginButtonClick();
		
		//TakeScreenshot
		ScreenShotClass.takeScreenshotMethod(driver);
		
		
//		String expectedTitle= "Swag Labs";
//		String actualTitle= driver.getTitle();
//		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("TC is Pass");
//		}
//		else
//		{
//			System.out.println("TC is fail");
//
//		}
				
		
	}
}
