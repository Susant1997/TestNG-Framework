package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicClass {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Before Group");

	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before Method");

	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterGroups
	public void afterGroup() {
		System.out.println("After Group");

	}
	
	@AfterMethod
	public void after() {
		System.out.println("After Method");

	}


}
