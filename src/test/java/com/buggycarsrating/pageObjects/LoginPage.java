package com.buggycarsrating.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buggycarsrating.utilities.util;

public class LoginPage 
{

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Declaring web elements for login
	
		@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/form/button") 
		@CacheLookup 
		WebElement loginButton;
		
		
		
		@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/form/div/input[1]") 
		@CacheLookup 
		WebElement username;
		
		@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/form/div/input[2]") 
		@CacheLookup 
		WebElement password;
		
		@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/ul/li[1]/span") 
		@CacheLookup 
		WebElement login;
		
		//Entering username and password
		public void enterDetails(String username1,String Password) 
		{
			username.sendKeys(username1);
			password.sendKeys(Password);
		}
		
		//Click Login button
		public void clickLogin() 
		{
			loginButton.click();
		} 
		
		public String getTextusername() 
		{
			String msg = login.getText();
			return msg; 
			
		}
}
