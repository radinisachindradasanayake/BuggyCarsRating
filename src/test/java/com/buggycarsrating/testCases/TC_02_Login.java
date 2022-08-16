package com.buggycarsrating.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.buggycarsrating.pageObjects.LoginPage;
import com.buggycarsrating.utilities.BaseClass;
import com.buggycarsrating.utilities.ExcelUtils;
import com.buggycarsrating.utilities.util;



public class TC_02_Login extends BaseClass 
{
	
	
	
	@Test(dataProvider="TestData")
	public void Login_Test(String username,String password) throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.enterDetails(username,password);
		logger.info("Enter username and password");
		lp.clickLogin();
		logger.info("Click login button");
		
					String msg1 = lp.getTextusername();
					if(util.verifyTextMatch(msg1, "Hi, userrad12")) 
					{
						Assert.assertTrue(true);
						logger.info("Login test Passed");
						
					}
					else 
					{
						captureScreen(driver,"TC_02_Login");
						Assert.assertTrue(false);
						logger.info("Failed - TC_02_Login");
					}
					
				
	}
	
	@DataProvider(name="TestData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
		
		int rownum=ExcelUtils.getRowCount(path, "Sheet4");
		int colcount=ExcelUtils.getCellCount(path,"Sheet4",1);
		System.out.println(rownum);
		System.out.println(colcount);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=ExcelUtils.getCellData(path,"Sheet4", i,j);//1 0
				System.out.println(logindata[i-1][j]);
			}
				
		}
	return logindata;
	}
}
