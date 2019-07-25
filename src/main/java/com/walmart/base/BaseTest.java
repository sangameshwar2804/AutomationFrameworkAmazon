package com.walmart.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.walmart.utilities.ConfigUtils;
import com.walmart.utilities.Constants;
import com.walmart.utilities.WebDriverUtils;

public class BaseTest {
	protected WebDriver driver;
	protected static String url;
	protected static String browser;

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws FileNotFoundException, IOException {
		ConfigUtils config = new ConfigUtils(Constants.Resources_PATH + "config.properties");
		url = config.getProperty("Url");
		browser = config.getProperty("browser");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		System.out.println("Test Execution starts");
		driver = WebDriverUtils.getDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterTest(alwaysRun = true)
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
