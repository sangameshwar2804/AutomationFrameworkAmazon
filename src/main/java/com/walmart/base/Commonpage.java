package com.walmart.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.walmart.pages.Primepagee;
import com.walmart.pages.SearchResultspage;

public class Commonpage {
	protected WebDriver driver;

	public Commonpage(WebDriver driver) {
		this.driver = driver;
	}

	public SearchResultspage searchData(String data) {
		driver.findElement(By.cssSelector("[name='field-keywords']")).sendKeys(data);
		driver.findElement(By.cssSelector("[value='Go']")).click();
		return new SearchResultspage(driver);
	}

	public int pageHeaders() {
		int actual = driver.findElements(By.xpath("//span[@class=\"nav-line-2\"]")).size();// 6
		return actual;
	}

	public int footerLinksCount() {
		return driver.findElements(By.xpath("//span[@class=\"navFooterDescText\"]")).size();// 9
	}

	public int amazonFooterLinks() {
		return driver.findElements(By.xpath("//div[@class=\"navFooterLine navFooterLinkLine navFooterPadItemLine\"]"))
				.size(); // 1
	}

	public String clickOnBackToTop() {
		driver.findElement(By.cssSelector(".navFooterBackToTopText")).click();
		return driver.getTitle();
	}

	public Primepagee amazonPrime() {
		driver.findElement(By.cssSelector("[tabindex='7']")).click();
		;
		return new Primepagee(driver);
	}
}
