package com.walmart.pages;

import org.openqa.selenium.WebDriver;

import com.walmart.base.Commonpage;

public class PrimeLoginPage extends Commonpage{

	public PrimeLoginPage(WebDriver driver) {
		super(driver);
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
