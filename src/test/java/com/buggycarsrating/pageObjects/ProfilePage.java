package com.buggycarsrating.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage
{
	WebDriver ldriver;
	
	public ProfilePage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Declaring web elements in profile page
	
	@FindBy(xpath="/html/body/my-app/header/nav/div/my-login/div/ul/li[2]/a") 
	@CacheLookup 
	WebElement profile;
	
	@FindBy(xpath="//*[@id='gender']") 
	@CacheLookup 
	WebElement gender;
	
	@FindBy(xpath="//*[@id='genders']/option[1]") 
	@CacheLookup 
	WebElement male;
	
	@FindBy(xpath="//*[@id='genders']/option[2]") 
	@CacheLookup 
	WebElement female;
	
	@FindBy(xpath="//*[@id='age']") 
	@CacheLookup 
	WebElement age;
	
	@FindBy(xpath="//*[@id='address']") 
	@CacheLookup 
	WebElement address;
	
	@FindBy(xpath="//*[@id='phone']") 
	@CacheLookup 
	WebElement phone;
	
	@FindBy(xpath="//*[@id='hobby']") 
	@CacheLookup 
	WebElement hobby;
	
	@FindBy(xpath="//*[@id='currentPassword']") 
	@CacheLookup 
	WebElement cpassword;
	
	@FindBy(xpath="//*[@id='newPassword']") 
	@CacheLookup 
	WebElement npassword;
	
	@FindBy(xpath="//*[@id='newPasswordConfirmation']") 
	@CacheLookup 
	WebElement confirmpassword;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-profile/div/form/div[2]/div/button") 
	@CacheLookup 
	WebElement save_Button;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-profile/div/form/div[2]/div/a") 
	@CacheLookup 
	WebElement cancel_Button;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-profile/div/form/div[1]/div[1]/div[2]") 
	@CacheLookup 
	WebElement success_message;
	
	
	//Adding Additional Info
	public void add_infor(String age1,String address1,String phoneNo1,String hobby1,String currpassword,String newpassword,String confirmpass) 
	{
		profile.click();
		age.sendKeys(age1);
		address.sendKeys(address1);
		phone.sendKeys(phoneNo1);
		hobby.sendKeys(hobby1);
		cpassword.sendKeys(currpassword);
		npassword.sendKeys(newpassword);
		confirmpassword.sendKeys(confirmpass);
		save_Button.click();
		
		
	}
	
	
}
