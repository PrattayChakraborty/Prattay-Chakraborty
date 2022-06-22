package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public static WebElement IFrame;
	public static WebElement IFrame1;

	
	public void Login(){
	
		
	driver.findElement(By.id("userid")).sendKeys(prop.getProperty("UserId"));
	driver.findElement(By.id("pwd")).sendKeys(prop.getProperty("Password"));
	driver.findElement(By.xpath("//input[@name='Submit' and @type='submit']")).click();
	
	driver.findElement(By.xpath("//*[@id='PT_NAVBAR$IMG']")).click();
	Hold();
	
	IFrame=driver.findElement(By.xpath("//*[@id='psNavBarIFrame']"));
	driver.switchTo().frame(IFrame);
	
	driver.findElement(By.xpath("//*[@id='PTNUI_MENU_ICN$2']")).click();
	Hold();
	
	driver.findElement(By.xpath("//a[@id='PTNUI_NB_CNTREC_PTNUI_LINK$3']")).click();
	Hold();
	driver.findElement(By.xpath("//a[@id='PTNUI_NB_CNTREC_PTNUI_LINK$0']")).click();
	Hold();
	driver.findElement(By.xpath("//a[@id='PTNUI_NB_CNTREC_PTNUI_LINK$0']")).click();
	Hold();
	driver.findElement(By.xpath("//a[@id='PTNUI_NB_CNTREC_PTNUI_LINK$0']")).click();
	Hold();
	
	
	//IFrame1=driver.findElement(By.xpath("//iframe[@id='ptifrmtgtframe']"));
	IFrame1=driver.findElement(By.xpath("//*[@id=\"ptifrmtgtframe\"]"));
	driver.switchTo().frame(IFrame1);
	driver.findElement(By.xpath("//input[@id='DERIVED_HR_EMPLID']")).clear();
	Hold();
	driver.findElement(By.xpath("//input[@id='DERIVED_HR_EMPLID']")).sendKeys("2295");
	Hold();
	driver.findElement(By.xpath("//input[@id='DERIVED_HCR_PER_ADD_PERSON_LINK']")).click();
	Hold();
	
	
	
	}
}
