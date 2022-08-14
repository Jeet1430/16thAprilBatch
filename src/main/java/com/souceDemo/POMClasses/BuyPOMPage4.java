package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPOMPage4 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstName;
	
	public void insertFirstName()
	{
		firstName.sendKeys("Swapnajit");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastName;
	
	public void inserLastName()
	{
		lastName.sendKeys("Shinde");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalCode;
	
	public void insertPostalCode()
	{
		postalCode.sendKeys("415409");
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement cancelButton;
	
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueCheckout;
	
	public void clickOncontinueCheckout()
	{
		continueCheckout.click();
	}
	
	@FindBy(xpath="//button[text()='Finish']")
	WebElement finishButton;
	
	public void clickOnFinishButton()
	{
		finishButton.click();
	}
	
	
	public BuyPOMPage4(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
}
