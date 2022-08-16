package com.buggycarsrating.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverallRating 
{

WebDriver ldriver;
	
	public OverallRating(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Declaring web elements for login
	@FindBy(xpath="/html/body/my-app/div/main/my-home/div/div[3]/div/a/img") 
	@CacheLookup 
	WebElement List;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-overall/div/div/table/tbody/tr[1]/td[7]/a") 
	@CacheLookup 
	WebElement view_more;
	
	@FindBy(xpath="//*[@id='comment']") 
	@CacheLookup 
	WebElement comment; 
	
	@FindBy(xpath="/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/div/button") 
	@CacheLookup 
	WebElement vote;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-model/div/div[3]/table/tbody/tr[1]/td[3]") 
	@CacheLookup 
	WebElement comment2;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-model/div/div[3]/table/tbody/tr[1]/td[2]") 
	@CacheLookup 
	WebElement authur;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/p") 
	@CacheLookup 
	WebElement confirmvote;
	
	@FindBy(xpath="/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/p") 
	@CacheLookup 
	WebElement see;
	
	
	
	public void clickList() throws InterruptedException 
	{
		
		List.click();
		view_more.click();
		Thread.sleep(10000);
		
		
	}
	
	public void vote() throws InterruptedException 
	{
		comment.sendKeys("Vote 123");
		Thread.sleep(1000);
		vote.click();
		Thread.sleep(5000);
	}
	
	public String getComment() 
	{
		System.out.println(comment2.getText());
		return comment2.getText();
		
		
	}
	
	public String getauthur() 
	{
		return authur.getText();
	}
	public void confirmvote() 
	{
		confirmvote.isDisplayed();
	}
	
	public String checkTovote() 
	{
		see.isDisplayed();
		String see1=see.getText();
		return see1;
	}
	
}
