package TestSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PersonalDataChange;
import pages.PersonalInfo;
import base.BaseClass;

public class TestCases extends BaseClass{
	
	LoginPage login=new LoginPage();
	PersonalInfo perInfo=new PersonalInfo();
	PersonalDataChange perData=new PersonalDataChange();
	@BeforeTest
	public void invokeBrowser() {
		logger = report.createTest("Executing Test Cases");

		login.invokeBrowser();
		//reportPass("Browser is Invoked");
		login.OpenUrl();
	}

	@Test
	public void login1() {
		
		login.Login();
		perInfo.PersonalData();
		//perData.DataChange();
		
	}

}
