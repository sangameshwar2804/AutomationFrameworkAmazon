package com.walmart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.walmart.base.Commonpage;

public class SearchResultDetailsPage extends Commonpage {

	public SearchResultDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		return driver.getTitle();
	}

	public String askQuestion(String askQuestion) {
		driver.findElement(By.cssSelector(".askDPSearchPostTextInput")).sendKeys(askQuestion);
		return driver.getTitle();
	}
}
