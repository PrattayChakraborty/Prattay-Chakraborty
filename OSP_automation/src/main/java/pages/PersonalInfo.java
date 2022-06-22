package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.LoginPage;

public class PersonalInfo extends LoginPage{
	
	
	public void PersonalData() {
		
	driver.findElement(By.xpath("//input[@id='DERIVED_NM_LVL2_UPDATE_NAME_BTN$0']")).click();	 
	Hold();
	
	driver.switchTo().parentFrame();
	WebElement IFrame2= driver.findElement(By.xpath("//iframe[@id='ptModFrame_0']"));
	driver.switchTo().frame(IFrame2);

	//add a name	
	WebElement Dropdown=driver.findElement(By.xpath("//select[@id='HCR_UPDNAME_DVW_NAME_PREFIX$0']"));
	Select dropdwn=new Select(Dropdown);
	dropdwn.selectByVisibleText("Mr");
	Hold();
	
	driver.findElement(By.xpath("//input[@id='HCR_UPDNAME_DVW_FIRST_NAME$1']")).sendKeys("Prrt");
	Hold();
	driver.findElement(By.xpath("//input[@id='HCR_UPDNAME_DVW_LAST_NAME$3']")).sendKeys("Ckkg");
	Hold();
	driver.findElement(By.xpath("//input[@id='DERIVED_NM_LVL2_OK_PB']")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	driver.findElement(By.xpath("//*[@id='NAMES_EFFDT$0']")).clear();
	Hold();
	driver.findElement(By.xpath("//*[@id='NAMES_EFFDT$0']")).sendKeys("12/04/2010");
	Hold();
	driver.findElement(By.xpath("//*[@id=\"PERSON_BIRTHCOUNTRY$prompt$img\"]")).click();
	driver.switchTo().parentFrame();
	WebElement ifr=driver.findElement(By.xpath("//*[@id=\"ptModFrame_1\"]"));
	driver.switchTo().frame(ifr);
	driver.findElement(By.xpath("//*[@id=\"RESULT0$106\"]")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	/*driver.findElement(By.xpath("//*[@id=\"PERS_NID_COUNTRY$prompt$img$0\"]")).click();
	driver.switchTo().parentFrame();
	WebElement iframe3=driver.findElement(By.xpath("//*[@id=\"ptModFrame_0\"]"));
	driver.switchTo().frame(iframe3);
	driver.findElement(By.xpath("//*[@id=\"RESULT0$12\"]")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	Select dd=new Select(driver.findElement(By.xpath("//*[@id=\"PERS_NID_NATIONAL_ID_TYPE$0\"]")));
	dd.selectByIndex(0);
	driver.findElement(By.xpath("//*[@id='DERIVED_HR_NID_SPECIAL_CHAR$0']")).sendKeys("AASH2222AZ");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	Hold();
	
	//contact
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);

	driver.findElement(By.xpath("//span[text()='ontact Information']")).click();
    Hold();
    
   
    //address 
    
    driver.findElement(By.xpath("//a[@id='ADDR_HISTORY_BTN$0']")).click();
	Hold();
	//driver.findElement(By.xpath("//*[@id=\"ADDRESSES_COUNTRY$prompt$img$0\"]")).click();
	//WebElement iframe4=driver.findElement(By.xpath("//*[@id=\"win0divPAGECONTAINER\"]"));
	//driver.switchTo().parentFrame();
	//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ptModFrame_0\"]")));
	//driver.findElement(By.xpath("//*[@id=\"COUNTRY_TBL_COUNTRY\"]")).sendKeys("IND");
	//driver.findElement(By.xpath("//*[@id=\"RESULT0$106\"]")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDR_UPDATE_ADDRESS$0']")).click();
	Hold();
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_ADDRESS1']")).sendKeys("eaf ninja");
	Hold();
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_ADDRESS2']")).sendKeys("vilge");
	Hold();
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_CITY']")).sendKeys("Chicago");
	Hold();
	//driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_STATE']")).sendKeys("NY");
	//Hold();
	//driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_STATE$prompt$img']")).click();
	//Hold();
	
	//driver.switchTo().parentFrame();
	//WebElement Iframe3=driver.findElement(By.xpath("//*[@id=\"ptModFrame_1\"]"));
	//driver.switchTo().frame(Iframe3);
	//driver.findElement(By.xpath("//*[@id=\"RESULT1$40\"]")).click();
	
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_POSTAL']")).sendKeys("60001");
	Hold();
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_COUNTY']")).sendKeys("IND");
	Hold();
	driver.findElement(By.xpath("//*[@id='DERIVED_ADDRESS_OK_PB']")).click();
	Hold();
	driver.findElement(By.xpath("//*[@id='#ICSave']")).click();   
	Hold();
	
	//phonenumber
	
	WebElement PhNoDD=driver.findElement(By.xpath("//*[@id='PERSONAL_PHONE_PHONE_TYPE$0']"));
	Select dropdwn1=new Select(PhNoDD);
	dropdwn1.selectByVisibleText("Mobile");
	Hold();
	driver.findElement(By.xpath("//*[@id='PERSONAL_PHONE_PHONE$0']")).sendKeys("090/90-4098");
	Hold();
	
	
	//email
	
	driver.findElement(By.xpath("//*[@id='EMAIL_ADDRESSES_E_ADDR_TYPE$0']")).click();
	Hold();
	WebElement EmailDD=driver.findElement(By.xpath("//*[@id='EMAIL_ADDRESSES_E_ADDR_TYPE$0']"));
	Select dropdwn2=new Select(EmailDD);
	dropdwn2.selectByVisibleText("Other");
	Hold();
	driver.findElement(By.xpath("//*[@id='EMAIL_ADDRESSES_EMAIL_ADDR$0']")).sendKeys("jcs8@gmail.com");
	Hold();
	
	driver.findElement(By.xpath("//*[@id='MCF_IM_PROTOCOL$0']")).click();
	Hold();
	driver.findElement(By.xpath("//*[@id='MCF_IM_PROTOCOL$0']")).sendKeys("YAHOO");
	
	Hold();
	driver.findElement(By.xpath("//*[@id='MCF_IMUSERID$0']")).sendKeys("qwdfc4@yahoo.com");
	Hold();
	
	//OrganizationalRelationship
	
	driver.findElement(By.xpath("//span[text()='rganizational Relationships']")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id=\"DERIVED_HCR_PER_DERIVED_EMP\"]")).click();
	Hold();
	
	driver.findElement(By.xpath("//*[@id='DERIVED_HCR_PER_ADD_INSTANCE_LINK']")).click();
	Hold();
	driver.findElement(By.xpath("//*[@id=\"alertbutton\"]/a[1]")).click();
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/div[2]/a[1]")).click();
	//Add Relationship
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	//driver.findElement(By.xpath("//*[@id=\"#ICOK\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"#ICOK\"]")).click();
	
	WebElement Reason=driver.findElement(By.name("JOB_ACTION_REASON$0"));//*[@id="JOB_ACTION_REASON$0"]
	Select select=new Select(Reason);
	Hold();
	select.selectByIndex(1);
	Hold();
	driver.findElement(By.xpath("//*[@id=\"JOB_DEPTID$0\"]")).sendKeys("13120");
	
	
	
	driver.findElement(By.xpath("//*[@id=\"JOB_DEPTID$prompt$img$0\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	WebElement Iframe5=driver.findElement(By.xpath("//*[@id=\"ptModFrame_2\"]"));
	driver.switchTo().frame(Iframe5);
	driver.findElement(By.xpath("//*[@id=\"RESULT4$0\"]")).click();
	Hold();
	
	//Job Information
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id=\"ICTAB_1\"]/span")).click();
	Hold();
	
	
	//job code
	WebElement jobcode=driver.findElement(By.xpath("//*[@id=\"JOB_JOBCODE$0\"]"));
	jobcode.sendKeys("120000");
	Hold();
	
	driver.findElement(By.xpath("//*[@id=\"JOB_JOBCODE$prompt$img$0\"]")).click();
	Hold();
	driver.switchTo().parentFrame();
	WebElement Iframe6=driver.findElement(By.xpath("//*[@id=\"ptModFrame_3\"]"));
	driver.switchTo().frame(Iframe6);
	driver.findElement(By.xpath("//*[@id=\"SEARCH_RESULT1\"]")).click();
	Hold();
	
	
	//Payroll
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	driver.findElement(By.xpath("//*[@id=\"ICTAB_3\"]/span")).click();
	Hold();
	
	driver.findElement(By.xpath("//*[@id=\"JOB_TAX_LOCATION_CD$0\"]")).sendKeys("KUWA00");
	Hold();
	driver.findElement(By.xpath("//*[@id=\"JOB_TAX_LOCATION_CD$prompt$img$0\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	WebElement Iframe7=driver.findElement(By.xpath("//*[@id=\"ptModFrame_4\"]"));
	driver.switchTo().frame(Iframe7);
	driver.findElement(By.xpath("//*[@id=\"RESULT2$0\"]")).click();
	Hold();
	
	
	//Compensation
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
		
	driver.findElement(By.xpath("//*[@id=\"ICTAB_5\"]/span")).click();
	Hold();


	driver.findElement(By.xpath("//*[@id=\"JOB_COMP_FREQUENCY$0\"]")).clear();
	Hold();

	driver.findElement(By.xpath("//*[@id=\"JOB_COMP_FREQUENCY$0\"]")).sendKeys("D");
	Hold();

	driver.findElement(By.xpath("//*[@id=\"JOB_COMP_FREQUENCY$prompt$img$0\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	WebElement Iframe8=driver.findElement(By.xpath("//*[@id=\"ptModFrame_5\"]"));//*[@id="ptModFrame_11"]
	driver.switchTo().frame(Iframe8);
	
	driver.findElement(By.xpath("//*[@id=\"RESULT3$0\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	
	driver.findElement(By.xpath("//*[@id=\"COMPENSATION_COMP_RATECD$0\"]")).clear();
	Hold();
	
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMP_RATECD$0']")).sendKeys("ANTCON");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMP_RATECD$prompt$img$0']")).click();
	Hold();
	driver.switchTo().parentFrame();
	WebElement Iframe81=driver.findElement(By.xpath("//*[@id=\"ptModFrame_6\"]"));
	driver.switchTo().frame(Iframe81);
	driver.findElement(By.xpath("//*[@id=\"SEARCH_RESULT1\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMPRATE$0']")).sendKeys("3000");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$0']")).clear();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$0']")).sendKeys("INR");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$prompt$img$0']")).click();
	Hold();
	driver.switchTo().parentFrame();
	WebElement Iframe82=driver.findElement(By.xpath("//*[@id=\"ptModFrame_7\"]"));
	driver.switchTo().frame(Iframe82);
	driver.findElement(By.xpath("//*[@id=\"SEARCH_RESULT1\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	
	driver.findElement(By.xpath("//*[@id='COMPENSATION$new$0$$0']")).click();
	driver.findElement(By.xpath("//*[@id=\"COMPENSATION_COMP_RATECD$1\"]")).clear();
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMP_RATECD$1']")).sendKeys("AUTPV");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMP_RATECD$prompt$img$1']")).click();
	Hold();
	driver.switchTo().parentFrame();
	WebElement Iframe83=driver.findElement(By.xpath("//*[@id=\"ptModFrame_8\"]"));
	driver.switchTo().frame(Iframe83);
	driver.findElement(By.xpath("//*[@id=\"SEARCH_RESULT1\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id='COMPENSATION_COMPRATE$1']")).sendKeys("2000");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$1']")).clear();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$1']")).sendKeys("INR");
	Hold();
	driver.findElement(By.xpath("//*[@id='COMPENSATION_CURRENCY_CD$prompt$img$1']")).click();
	Hold();
	driver.switchTo().parentFrame();
	WebElement Iframe84=driver.findElement(By.xpath("//*[@id=\"ptModFrame_9\"]"));
	driver.switchTo().frame(Iframe84);
	driver.findElement(By.xpath("//*[@id=\"SEARCH_RESULT1\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	driver.findElement(By.xpath("//*[@id=\"DERIVED_HR_CMP_CALC_COMP_BTN$0\"]")).click();
	Hold();

	
	
	//Click ok button
	driver.findElement(By.xpath("//*[@id='#ICSave']")).click();
	Hold();

	
	driver.switchTo().parentFrame();
	
	//Click the Warning Ok button
	WebElement alert=driver.findElement(By.xpath("//*[@id='alertbutton']/a[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(alert).build().perform();
	alert.click();
	Hold();
	
	
	driver.findElement(By.xpath("//*[@id=\"alertbutton\"]/a[1]")).click();
	Hold();//*[@id="#ICOK"]
	
	/*WebElement alert1=driver.findElement(By.xpath("//*[@id=\\\"alertbutton\\\"]/a[1]"));
	Actions action1=new Actions(driver);
	action1.moveToElement(alert1).build().perform();
	alert1.click();
	Hold();*/

	
	/*WebElement alert11=driver.findElement(By.xpath("//*[@id=\"#ICOK\"]"));
	//alert11.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
	Actions action2=new Actions(driver);
	action2.moveToElement(alert11).build().perform();
	alert11.click();
	Hold();*/
	
	//driver.findElement(By.xpath("//*[@id=\"#ICSave\"]")).click();
	//driver.switchTo().parentFrame();
	//driver.switchTo().frame(IFrame1);
	
	
	//Correct History
	driver.switchTo().frame(IFrame1);
	driver.findElement(By.xpath("//*[@id=\"#ICCorrection\"]")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	
	driver.findElement(By.xpath("//*[@id='PERALL_SEC_SRCH_EMPLID']")).sendKeys("2215");
	driver.findElement(By.xpath("//*[@id='#ICSearch']")).click();
	Hold();
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame(IFrame1);
	
	}

}
