package com.walmart.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.pages.Homepage;

import com.walmart.pages.PrimeLoginPage;
import com.walmart.pages.Primepagee;

public class LoginPageTest extends BaseTest {

	Homepage hm;
	Primepagee pm;
	PrimeLoginPage pl;

	@Test
	public void test1() {
		hm = new Homepage(driver);
		pm = hm.amazonPrime();
		pl = pm.loginInToPrime();
		String actual = pl.getTitle();
		assertEquals(actual, "Amazon Sign In");
	}

}
