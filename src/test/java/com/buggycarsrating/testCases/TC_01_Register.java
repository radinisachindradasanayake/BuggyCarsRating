package com.buggycarsrating.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.buggycarsrating.pageObjects.RegisterPage;
import com.buggycarsrating.utilities.BaseClass;
import com.buggycarsrating.utilities.ExcelUtils;
import com.buggycarsrating.utilities.util;


public class TC_01_Register extends BaseClass
{
	@Test(dataProvider="RegiData")
	public void Register_Test(String f1,String f2,String f3,String f4,String f5) throws InterruptedException, IOException 
	{
		//driver.get(baseURL);
		//logger.info("URL is Opened");
		RegisterPage rp = new RegisterPage(driver);
		rp.clickRegisterButton(); 
		logger.info("Click Register Button");
		rp.enterDatatoRegister(f1,f2,f3,f4,f5);
		logger.info("Entering data to register");
		rp.click_RegisterButton2();
		logger.info("Click register button");
		String msg = rp.display_successmsg();
		
		if(util.verifyTextMatch(msg, "Registration is successful")) 
		{
			Assert.assertTrue(true);
			logger.info("Registration test Passed");
			
		}
		else 
		{
			captureScreen(driver,"TC_01_Register");
			Assert.assertTrue(false);
			logger.info("Failed - TC_01_Register");
		}
		
		
	}
	
	
	@DataProvider(name="RegiData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
		
		int rownum=ExcelUtils.getRowCount(path, "Sheet6");
		int colcount=ExcelUtils.getCellCount(path,"Sheet6",1);
		System.out.println(rownum);
		System.out.println(colcount);
		String regidata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				regidata[i-1][j]=ExcelUtils.getCellData(path,"Sheet6", i,j);//1 0
				System.out.println(regidata[i-1][j]);
			}
				
		}
	return regidata;
	}

}
