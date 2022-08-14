package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPOMPage5 
{
	WebDriver driver;

	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement CancelButton;
	
	public void ClickOnCancelButton()
	{
		CancelButton.click();
	}
	
	@FindBy(xpath="//button[text()='Finish']")
	WebElement Finish;
	
	public void clickOnFinish()
	{
		Finish.click();
	}
	
	@FindBy(xpath="//button[text()='Back Home']")
	WebElement backHome;
	
	public void clickOnBackHome()
	{
		backHome.click();
	}
	
	
	public CheckOutPOMPage5(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	

}
