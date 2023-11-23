package org.testng;

import org.testng.annotations.Test;

public class TestBasics1 {
	
	@Test(priority = 1, invocationCount = 2) // enabled = false)
	public void test01() {
		System.out.println("Test1");
	}
	
	@Test(priority = 2, invocationCount = 2, alwaysRun = true)
	public void test02() {
		System.out.println("Test2");
	}
	
	@Test(dependsOnMethods = "test01")
	public void test03() {
		System.out.println("Test3");
	}

}
