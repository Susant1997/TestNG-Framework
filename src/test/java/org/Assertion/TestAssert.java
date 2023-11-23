package org.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class TestAssert {
	
	@Test
	public void test01() {
		
		String s = "abcdef";
		Assert.assertEquals("abcdef", s);
//		Assert.assertEquals("abcde", s, "My Actual value not meet out expected");
		System.out.println("Assert Passed");

	}
	
	@Test
	public void test02() {
		
		String s = "12345";
//		SoftAssert soft = new SoftAssert();
		Assert.assertEquals("123456", s);
		System.out.println("Soft Assert Passed");

	}
	
	
	

}
