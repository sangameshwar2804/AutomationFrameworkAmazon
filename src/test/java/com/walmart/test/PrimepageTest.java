package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.pages.Homepage;
import com.walmart.pages.Primepagee;

public class PrimepageTest extends BaseTest {
	Homepage hm;
	Primepagee pm;

	@Test
	public void liginCheckk() {
		hm = new Homepage(driver);
		hm.amazonPrime();

	}
}
