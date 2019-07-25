package com.walmart.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.pages.Homepage;
import com.walmart.pages.SearchResultDetailsPage;
import com.walmart.pages.SearchResultspage;

public class SearchResultsDetailsTest extends BaseTest {

	Homepage hm;
	SearchResultspage sp;
	SearchResultDetailsPage sdp;

	@Test
	public void checkTest() {
		hm = new Homepage(driver);
		sp = hm.searchData("laptop");
		sdp = sp.onSelectedLaptop();
		String actual = sdp.scrollDown();
		assertEquals(actual, "Amazon.in: laptop");
	}

}
