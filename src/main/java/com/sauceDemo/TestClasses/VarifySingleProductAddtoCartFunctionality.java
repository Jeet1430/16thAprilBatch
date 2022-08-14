package com.sauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.souceDemo.POMClasses.HomePOMPage2;
import com.souceDemo.POMClasses.LoginPOMPage1;

public class VarifySingleProductAddtoCartFunctionality 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\JEET\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get method --> url open
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login
		LoginPOMPage1 lp= new LoginPOMPage1(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.loginButtonClick();
		
		//homepage
		HomePOMPage2 hp= new HomePOMPage2(driver);
		hp.clickOnSingleProductAddToCart();
		
		String actualCount= hp.getTextFromCartSymbol();
		String expectedCount = "1";
		
		if(actualCount.equals(expectedCount))
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("TC is fail");

		}
		
		
	}
}
