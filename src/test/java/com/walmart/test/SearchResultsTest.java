package com.walmart.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.pages.Homepage;
import com.walmart.pages.SearchResultspage;

public class SearchResultsTest extends BaseTest {
	Homepage hm;
	SearchResultspage sp;

	@Test
	public void searchDataTest() {
		hm = new Homepage(driver);
		sp = hm.searchData("Lptop");
		Assert.assertTrue(sp.submitFeedBack("good").contains("Amazon.in: laptop"));
	}
}
