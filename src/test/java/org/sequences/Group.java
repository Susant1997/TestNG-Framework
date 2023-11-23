package org.sequences;

import org.testng.annotations.Test;

public class Group {
	
	@Test(groups = {"smoke", "daily"})
	public void test01() {
		System.out.println("Test1");
	}
	
	@Test(groups = {"sanity", "daily"})
	public void test02() {
		System.out.println("Test2");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test03() {
		System.out.println("Test3");
	}

}
