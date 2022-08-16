package com.buggycarsrating.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.buggycarsrating.pageObjects.OverallRating;
import com.buggycarsrating.utilities.BaseClass;
import com.buggycarsrating.utilities.util;

public class TC_05_Verify_Voting_without_login extends BaseClass
{
	@Test
	public void Verify_Voting_without_login() throws InterruptedException, IOException 
	{
	OverallRating OR = new OverallRating(driver);
	OR.clickList();
	String msg = OR.checkTovote() ;
if(util.verifyTextMatch(msg , "You need to be logged in to vote.")) 
{
	Assert.assertTrue(true);
	logger.info("TC_05_Verify_Voting_without_login Passed");
}
else
{
	captureScreen(driver,"TC_05_Verify_Voting_without_login");
	Assert.assertTrue(false);
	logger.info("Failed - TC_05_Verify_Voting_without_login");
	
}
	}
}
