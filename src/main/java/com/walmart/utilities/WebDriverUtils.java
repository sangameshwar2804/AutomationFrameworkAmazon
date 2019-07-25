package com.walmart.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverUtils {
	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;

		try {
			switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.firefox.driver",
						System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "opera":

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/resources/drivers/operadriver.exe");
				driver = new OperaDriver();
			default:
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			}

		} catch (Exception e) {
			System.out.println("exception while creating a webdriver object");
			System.out.println(e.getStackTrace());
		}
		return driver;
	}
}
