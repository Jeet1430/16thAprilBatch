package com.souceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMPage2 
{
	private WebDriver driver;
	//single product 
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement singleProductAddToCart;
	
	public void clickOnSingleProductAddToCart()
	{
		singleProductAddToCart.click();
	}
	
	//product text
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement textOfCartSymbol;
	
	public String getTextFromCartSymbol()
	{
		String totalProducts = textOfCartSymbol.getText();
		return totalProducts;
	}
	
	//multiple products
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> mulitpleProducts;
	
	public void clickOnMulitpleProducts()
	{
		for(int i=0; i<mulitpleProducts.size();i++)
		{
			mulitpleProducts.get(i).click();
		}
	}
	
	//open menu
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement openMenu;
	
	public void clickOnOpenMenu()
	{
		openMenu.click();
	}
	//logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	public void clickOnLogout()
	{
		logOut.click();
	}
	
	
	public HomePOMPage2(WebDriver driver) 
	{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
