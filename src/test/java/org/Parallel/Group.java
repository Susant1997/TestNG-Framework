package org.Parallel;

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
	
	@Test(groups = {"reg", "daily"})
	public void test04() {
		System.out.println("Test4");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test05() {
		System.out.println("Test5");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test06() {
		System.out.println("Test6");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test07() {
		System.out.println("Test7");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test08() {
		System.out.println("Test8");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test09() {
		System.out.println("Test9");
	}
	
	@Test(groups = {"reg", "daily"})
	public void test10() {
		System.out.println("Test10");
	}
}
