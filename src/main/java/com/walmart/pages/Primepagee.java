package com.walmart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.walmart.base.Commonpage;

public class Primepagee extends Commonpage {

	public Primepagee(WebDriver driver) {
		super(driver);

	}

	public PrimeLoginPage loginInToPrime() {
		driver.findElement(By.cssSelector("[id='a-autoid-0-announce']")).click();
		return new PrimeLoginPage(driver);
	}
}
