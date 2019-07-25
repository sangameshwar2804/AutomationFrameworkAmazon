package com.walmart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.walmart.base.Commonpage;

public class SearchResultspage extends Commonpage {

	public SearchResultspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String submitFeedBack(String feedBack) {
		driver.findElement(By.cssSelector("textarea")).sendKeys(feedBack);
		driver.findElement(By.cssSelector(".s-feedback-submit-button [type]")).click();
		return driver.getTitle();
	}

	public SearchResultDetailsPage onSelectedLaptop() {
		driver.findElement(By.cssSelector("[data-component-id='2'] .a-size-medium")).click();
		return new SearchResultDetailsPage(driver);
	}

}
