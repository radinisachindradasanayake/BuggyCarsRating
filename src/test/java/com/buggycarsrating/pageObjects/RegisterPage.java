package com.buggycarsrating.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buggycarsrating.utilities.util;

public class RegisterPage 
{
	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Declaring web elements on register page
	
	@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/form/a") 
	@CacheLookup 
	WebElement registerButton;
	
	@FindBy(xpath="//*[@id='username']") 
	@CacheLookup 
	WebElement login_field;
	
	@FindBy(xpath="//*[@id='firstName']") 
	@CacheLookup 
	WebElement fname_field;
	
	@FindBy(xpath="//*[@id='lastName']") 
	@CacheLookup 
	WebElement lname_field;
	
	@FindBy(xpath="//*[@id='password']") 
	@CacheLookup 
	WebElement password_field;
	
	@FindBy(xpath="//*[@id='confirmPassword']") 
	@CacheLookup 
	WebElement cpassword_field;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-register/div/div/form/button") 
	@CacheLookup 
	WebElement register_Button2;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-register/div/div/form/a") 
	@CacheLookup 
	WebElement cancel_Button;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-register/div/div/form/div[6]") 
	@CacheLookup 
	WebElement success_msg;
	
	
	
	//Click Register button in the Home page
	public void clickRegisterButton() throws InterruptedException 
	{
		registerButton.click();
		Thread.sleep(1000);
	}

	//Entering data to form
	public void enterDatatoRegister(String lfield,String ffield,String lnfield,String pfield,String cpfiled) throws InterruptedException 
	{
		login_field.sendKeys(lfield);
		fname_field.sendKeys(ffield);
		lname_field.sendKeys(lnfield);
		password_field.sendKeys(pfield);
		cpassword_field.sendKeys(cpfiled);
		
		
	}
	
	//Clicking register_Button
	public void click_RegisterButton2() 
	{
		register_Button2.click();	
	}
	
	public String display_successmsg() 
	{
		String msg = success_msg.getText();
		return msg;
	}
}
