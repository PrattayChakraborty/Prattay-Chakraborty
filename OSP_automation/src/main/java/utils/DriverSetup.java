package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	public static WebDriver driver;
	public static String exePath;
	public static String browserType;

	public static WebDriver getWebDriver(String browser) {
		//PropertiesRead prop = new PropertiesRead();
		// Defining Browser Type chrome or edge
		browserType = browser;
		if (browserType.equalsIgnoreCase("chrome")) {

			exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("Firefox")) {
			exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void driverClose() {
		driver.close();
	}
}
