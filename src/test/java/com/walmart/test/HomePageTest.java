package com.walmart.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.pages.Homepage;
import com.walmart.pages.SearchResultspage;
import com.walmart.utilities.ExcellUtils;

public class HomePageTest extends BaseTest {

	Homepage hm;

	@DataProvider(name = "searchData")
	public Object[][] getData() throws IOException {
		return ExcellUtils.getExcelData("Homepage.xlsx","Sheet1");
	}

	@Test
	public void pageHeadersTest() {
		hm = new Homepage(driver);
		int actual = hm.pageHeaders();
		assertEquals(actual, 6);
	}

	@Test
	public void footerLinksTest() {
		hm = new Homepage(driver);
		int actual = hm.footerLinksCount();
		assertEquals(actual, 9);
	}

	@Test
	public void amazonLink() {
		hm = new Homepage(driver);
		int actual = hm.amazonFooterLinks();
		assertEquals(actual, 1);
	}

	@Test(dataProvider = "searchData")
	public void sarchLaptop(String searhData, String expected) {
		hm = new Homepage(driver);
		SearchResultspage sp = hm.searchData(searhData);
		assertEquals(sp.getTitle(), expected);
	}

	@Test
	public void imeagesListTest() {
		hm = new Homepage(driver);
		int actual = hm.getImeagesList();
		assertEquals(actual, 12);
	}

	public void isImeageDispalyedTest() {
		hm = new Homepage(driver);
		boolean actual = hm.isImeageDisplayed();
		assertEquals(actual, true);
	}

	public void clickOnBakToTopButtonTest() {
		hm = new Homepage(driver);
		String actual = hm.clickOnBackToTop();

	}

	public void clickonPrime() {
		hm = new Homepage(driver);
		hm.amazonPrime();
		hm.getTitle();
	}

}
