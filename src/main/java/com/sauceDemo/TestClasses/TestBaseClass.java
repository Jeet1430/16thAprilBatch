package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.Utilityclasses.ScreenShotClass;
import com.souceDemo.POMClasses.HomePOMPage2;
import com.souceDemo.POMClasses.LoginPOMPage1;

public class TestBaseClass 
{
WebDriver driver;


	Logger logs= Logger.getLogger("SauceDemo");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
	if(browserName.equals("chrome"))
	 {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("Throw The Error");
	}
		
	PropertyConfigurator.configure("log4j.properties");
	
	logs.info("Browser is opened");

	//get method --> url open
	driver.manage().window().maximize();
	logs.info("Browser is maximixed");

	driver.get("https://www.saucedemo.com");
	logs.info("URL opened");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ScreenShotClass.takeScreenshotMethod(driver);
	logs.info("Screenshot taken");
	
	//login
	LoginPOMPage1 lp= new LoginPOMPage1(driver);
	lp.sendUsername();
	logs.info("username entered");

	lp.sendPassword();
	logs.info("password entered");

	lp.loginButtonClick();
	logs.info("clicked on login button");

	ScreenShotClass.takeScreenshotMethod(driver);
	}
	
	@AfterMethod
	public void tearDown()
	{
		HomePOMPage2 hp= new HomePOMPage2(driver);
		hp.clickOnOpenMenu();
		hp.clickOnLogout();
		logs.info("logout done");


		driver.quit();
		logs.info("Browser closed");

	}

}
