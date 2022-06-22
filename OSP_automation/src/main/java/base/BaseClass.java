package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

import utils.DriverSetup;
import utils.ExtentReportManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	JavascriptExecutor js;
	public static WebDriverWait wait;
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public static ExtentTest logger;
	public String browser;

	// To call different browsers
	public void invokeBrowser() {
		prop = new Properties();

		try {
			prop.load(new FileInputStream("C:\\Users\\Pratty Chakraborty\\workspace\\Main_Project\\src\\main\\resources\\Config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		browser = prop.getProperty("Browser");
		report = ExtentReportManager.getReportInstance();
		driver = DriverSetup.getWebDriver(browser);

		// To maximize the Browser Window
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void OpenUrl() {

		driver.get(prop.getProperty("URL"));
		pageLoad(20);
		
	}

	// Function to show the failed test cases in the report
	public static void reportFail(String report) {
		logger.log(Status.FAIL, report);
	}

	// Function to show the passed test cases in the report
	public static void reportPass(String report) {
		logger.log(Status.PASS, report);
	}

	// pageLoadTime
	public void pageLoad(int t) {
		driver.manage().timeouts().pageLoadTimeout(t, TimeUnit.SECONDS);
	}

	// HoldOn
	public void Hold() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Function to take Screenshot of screen
	public void Screenshot() throws IOException {
		TakesScreenshot capture = (TakesScreenshot) driver;
		File srcFile = capture.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "/Screenshot/Error.png");
		Files.copy(srcFile, destFile);
	}

	// Navigate
	public void navigateBack() {
		driver.navigate().back();
	}

	// To input all data to the report
	public void endReport() {
		report.flush();
	}

	// To close the Browser
	public void closeBrowser() {
		driver.quit();
	}

}
