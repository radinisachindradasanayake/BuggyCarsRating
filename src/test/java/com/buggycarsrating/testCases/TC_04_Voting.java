package com.buggycarsrating.testCases;



import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.buggycarsrating.pageObjects.OverallRating;
import com.buggycarsrating.utilities.BaseClass;

public class TC_04_Voting extends TC_02_Login
{
	@Test
	public void TC_04_Voting1() throws IOException, InterruptedException 
	{
		OverallRating OR = new OverallRating(driver);
		OR.clickList();
		OR.vote();
		logger.info("Voting to brand");
		OR.confirmvote();
		String txt = OR.getComment();
		String auth = OR.getauthur();
		if((txt == "Vote 123") && (auth == "userrad12")) {
			Assert.assertTrue(true);
			logger.info("Vote Test Passed");
		
	}
	else 
	{
		captureScreen(driver,"TC_04_Voting");
		Assert.assertTrue(false);
		logger.info("Failed - TC_04_Voting");
	}
		
	
		
		
		
	
	
	
	
	}
	
}
