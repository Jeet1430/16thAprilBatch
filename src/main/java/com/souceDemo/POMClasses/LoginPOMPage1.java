package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOMPage1
{
	//Webelement maintain
	//Webelement action maintain
	//we will not run this 
	//supply purpose only 
	
	//Element maintain
	//usename
	//password
	//login button
	
	//WeDriver declaired globally
	private WebDriver driver;
//	private Actions act;
//	private Select s;
//	
	
	
//	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
//	username.sendKeys("standard_user");
	
//	@FindBy -->@-->annotation-->mehodFunction
	
	//Login
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;

	//Lets perform action on weElement
	
	public void sendUsername()
	{
		userName.sendKeys("standard_user");
	}
	
	//Password
	@FindBy(xpath="//input[@name='password']")
	private WebElement passWord;
	
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}
	
	//loginButton-Normal process
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	public void loginButtonClick()
	{
		loginButton.click();
	}
	
	//loginButton-MouseAction
//	public void loginButtonClick()
//	{
//	act.click(loginButton).perform();
//	}
//	
	//dropdown
//	@FindBy(xpath="//select[@class='product_sort_container']")
//	private WebElement dropDown;
//	
//	public void clickOnDropDown()
//	{
//		dropDown.click();
//		s.selectByVisibleText("Price (high to low)");
//	}
	
	//Constructor
	public LoginPOMPage1(WebDriver driver)
	
	{	//global		local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
//		act= new Actions(driver);
//		s=new Select(dropDown);

		
	}
	
}
