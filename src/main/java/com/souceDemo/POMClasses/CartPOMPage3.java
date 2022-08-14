package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPOMPage3 
{
	WebDriver driver;
	
		
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeButton;
	
	public void clickOnRemoveButton()
	{
		removeButton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continueShoppingButton;
	
	public void clickOncontinueShoppingButton()
	{
		continueShoppingButton.click();
	}
	
		
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOut;
	
	public void clickOnCheckOut()
	{
		checkOut.click();
	}
	
	
	public CartPOMPage3(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}

}
