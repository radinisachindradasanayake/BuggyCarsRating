package com.buggycarsrating.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.buggycarsrating.pageObjects.LoginPage;
import com.buggycarsrating.pageObjects.ProfilePage;
import com.buggycarsrating.utilities.BaseClass;
import com.buggycarsrating.utilities.ExcelUtils;

public class TC_03_Editing_Profile extends BaseClass
{
	@Test(dataProvider="ProfileData")
	public void Editing_Profile_Test(String age,String address, String phoneNo, String hobby, String cpassword,String npassword,String confirmpass)
	{
		LoginPage lp= new LoginPage(driver);
		lp.enterDetails("Radtest","Password.1");
		lp.clickLogin();
		ProfilePage pp = new ProfilePage(driver);
		pp.add_infor(age,address,phoneNo,hobby,cpassword,npassword,confirmpass);
		logger.info("Adding information");
		
	}
	
	@DataProvider(name="ProfileData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
		
		int rownum=ExcelUtils.getRowCount(path, "Sheet5");
		int colcount=ExcelUtils.getCellCount(path,"Sheet5",1);
		
		String profiledata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				profiledata[i-1][j]=ExcelUtils.getCellData(path,"Sheet5", i,j);
				System.out.println(profiledata[i-1][j]);//1 0
			}
				
		}
	return profiledata;
	}
	

}
