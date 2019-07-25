package com.walmart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.walmart.base.Commonpage;

public class Homepage extends Commonpage {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	public String signInButton() {
		driver.findElement(By.cssSelector(".a-spacing-top-small [role]")).click();
		return driver.getTitle();
	}

	public String todaysDeals() {
		driver.findElement(By.cssSelector(".deals-shoveler .a-color-base")).click();
		return driver.getTitle();
	}

	public int getImeagesList() {
		return driver.findElements(By.xpath("//a[@class=\"a-link-normal quadrant-overlay\"]")).size();// 12
	}

	public boolean isImeageDisplayed() {
		return driver.findElement(By.xpath("///img[@alt='Up to 30% off | Skincare']")).isDisplayed();
	}

	public String getTitle() {
		return driver.getTitle();

	}
}
