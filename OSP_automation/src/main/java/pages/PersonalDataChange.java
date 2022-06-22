package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PersonalDataChange extends LoginPage {

	public void DataChange() {

		// Phone Number change
		driver.findElement(By.xpath("//*[@id=\"ICTAB_1\"]/span")).click();
		Hold();

		WebElement PhNoDD1 = driver.findElement(By.xpath("//*[@id='PERSONAL_PHONE_PHONE_TYPE$0']"));
		Select dropdwn5 = new Select(PhNoDD1);
		dropdwn5.selectByVisibleText("Mobile");
		Hold();

		driver.findElement(By.xpath("//*[@id='PERSONAL_PHONE_PHONE$0']")).clear();
		Hold();
		driver.findElement(By.xpath("//*[@id='PERSONAL_PHONE_PHONE$0']")).sendKeys("499/173-9026");
		Hold();
		driver.findElement(By.xpath("//*[@id='#ICSave']")).click();
		Hold();
		
		

		// contract change
		// *[@id="pthdr2home"]
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//*[@id=\"pthdr2home\"]")).click();
		Hold();

		driver.switchTo().parentFrame();

		//WebElement IFramenav=driver.findElement(By.xpath("//*[@id='psNavBarIFrame']"));
		//driver.switchTo().frame(IFramenav);
		// *[@id="PT_NAVBAR$IMG"]
		driver.findElement(By.xpath("//*[@id=\"PT_NAVBAR$IMG\"]")).click();
		Hold();

		WebElement IFrameHome = driver.findElement(By.xpath("//*[@id='psNavBarIFrame']"));
		driver.switchTo().frame(IFrameHome);

		driver.findElement(By.xpath("//*[@id=\"PTNUI_MENU_ICN$2\"]")).click();
		Hold();
		// *[@id="PTNUI_MENU_BACKBTN$IMG"]

		driver.findElement(By.xpath("//*[@id=\"PTNUI_MENU_BACKBTN$IMG\"]")).click();
		Hold();
		driver.findElement(By.xpath("//*[@id=\"PTNUI_MENU_BACKBTN$IMG\"]")).click();
		Hold();
		driver.findElement(By.xpath("//*[@id=\"PTNUI_NB_CNTREC_PTNUI_LINK$1\"]")).click();
		Hold();
		driver.findElement(By.xpath("//*[@id=\"PTNUI_NB_CNTREC_PTNUI_LINK$6\"]")).click();
		Hold();
		
		
		/*****************************Job data search********************************************/		
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(IFrame1);
		
		//driver.findElement(By.xpath("//*[@id=\"#ICCorrection\"]")).click();
		//Thread.sleep(5000);	
		driver.switchTo().parentFrame();
		WebElement IFrameHome1=driver.findElement(By.xpath("//*[@id=\"ptifrmtgtframe\"]"));//*[@id="ptifrmtgtframe"]
		driver.switchTo().frame(IFrameHome1);	
		
		//*[@id="EMPLMT_SRCH_COR_EMPLID"]
		driver.findElement(By.xpath("//*[@id='EMPLMT_SRCH_COR_EMPLID']")).sendKeys("9413");
		driver.findElement(By.xpath("//*[@id=\"#ICSearch\"]")).click();
		Hold();
		
/******************************Job data*action--contract******************************/
		
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(IFrame1);
		
		//correct history
		driver.findElement(By.xpath("//*[@id=\"#ICCorrection\"]")).click();
		Hold();
		//new row
		driver.findElement(By.xpath("//*[@id=\"$ICField12$new$0$$0\"]")).click();//*[@id="$ICField12$new$0$$0"]
		Hold();
		
		WebElement AddrowDD=driver.findElement(By.xpath("//*[@id=\"$ICField12$hpage$0\"]"));
		Select AddrowDDchn1=new Select(AddrowDD);
		AddrowDDchn1.selectByValue("0");
		Hold();
		
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(IFrameHome1);
		
		//change the date
		driver.findElement(By.xpath("//*[@id='NAMES_EFFDT$0']")).sendKeys("03/21/2019");
		Hold();
		
		
		/***alert***/

		
		//driver.switchTo().parentFrame();
		
		//Click the Warning Ok button
		WebElement alertdd1=driver.findElement(By.xpath("//*[@id='alertbutton']/a[1]"));
		Actions actiond1 = new Actions(driver);
		actiond1.moveToElement(alertdd1).build().perform();
		alertdd1.click();
		Hold();
		
		driver.switchTo().frame(IFrame1);
		
		//Action		
		WebElement actionDD1=driver.findElement(By.xpath("//select[@id='JOB_ACTION$0']"));
		Select actionDDN1=new Select(actionDD1);
		actionDDN1.selectByVisibleText("Data Change");
		Hold();
		//Reason		
		WebElement reasonDD1=driver.findElement(By.xpath("//*[@id=\"JOB_ACTION_REASON$0\"]"));
		Select reasonDDN1=new Select(reasonDD1);
		reasonDDN1.selectByVisibleText("Contract");
		Hold();
		
		driver.findElement(By.xpath("//*[@id=\"#ICSave\"]")).click();

/*****************************Add new row -2******************************************/
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		//correct history	
		driver.findElement(By.xpath("//*[@id=\"#ICCorrection\"]")).click();
		
		//new row		
		driver.findElement(By.xpath("//*[@id=\"$ICField12$new$0$$0\"]")).click();
		
		WebElement AddrowDD2=driver.findElement(By.xpath("//*[@id=\"$ICField12$hpage$0\"]"));
		Select AddrowDDchn2=new Select(AddrowDD2);
		AddrowDDchn2.selectByValue("0");
		Hold();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		

		
		//Action		
		WebElement actionDD2=driver.findElement(By.xpath("//select[@id='JOB_ACTION$0']"));
		Select actionDDN2=new Select(actionDD2);
		actionDDN2.selectByVisibleText("Transfer");
		Hold();
		//Reason		
		WebElement reasonDD2=driver.findElement(By.xpath("//*[@id=\"JOB_ACTION_REASON$0\"]"));
		Select reasonDDN2=new Select(reasonDD2);
		reasonDDN2.selectByVisibleText("Promotion");
		Hold();
		
		//date
		driver.findElement(By.xpath("//*[@id='NAMES_EFFDT$0']")).sendKeys("02/15/2019");
		Hold();
		
		
		/***alert***/
		
	    driver.switchTo().parentFrame();
		
		//Click the Warning Ok button
		WebElement alertdd2=driver.findElement(By.xpath("//*[@id='alertbutton']/a[1]"));
		Actions actiond2 = new Actions(driver);
		actiond2.moveToElement(alertdd2).build().perform();
		alertdd2.click();
		Hold();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		

		
		driver.findElement(By.xpath("//*[@id=\"#ICSave\"]")).click();

		
/*****************************Add new row -2******************************************/
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		
		//correct history		
		driver.findElement(By.xpath("//*[@id=\"#ICCorrection\"]")).click();
		
		//new row		
		driver.findElement(By.xpath("//*[@id=\"$ICField12$new$0$$0\"]")).click();
		
		WebElement AddrowDD3=driver.findElement(By.xpath("//*[@id=\"$ICField12$hpage$0\"]"));
		Select AddrowDDchn3=new Select(AddrowDD3);
		AddrowDDchn3.selectByValue("0");
		Hold();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		

		
		//Action		
		WebElement actionDD3=driver.findElement(By.xpath("//select[@id='JOB_ACTION$0']"));
		Select actionDDN3=new Select(actionDD3);
		actionDDN3.selectByVisibleText("Termination");
		Hold();
		//Reason		
		WebElement reasonDD3=driver.findElement(By.xpath("//*[@id=\"JOB_ACTION_REASON$0\"]"));
		Select reasonDDN3=new Select(reasonDD3);
		reasonDDN3.selectByVisibleText("Misconduct");
		Hold();
		//date	
		driver.findElement(By.xpath("//*[@id='NAMES_EFFDT$0']")).sendKeys("03/19/2019");
		Hold();
		
		
		/***alert***/
	    driver.switchTo().parentFrame();
		
		//Click the Warning Ok button
		WebElement alertdd3=driver.findElement(By.xpath("//*[@id='alertbutton']/a[1]"));
		Actions actiond3 = new Actions(driver);
		actiond3.moveToElement(alertdd3).build().perform();
		alertdd3.click();
		Hold();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(IFrame1);
		driver.findElement(By.xpath("//*[@id=\"#ICSave\"]")).click();

		
		
	}

}
