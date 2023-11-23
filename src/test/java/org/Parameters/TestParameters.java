package org.Parameters;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AdactTest.BaseClass;

public class TestParameters extends BaseClass {
	
	@Parameters({"url", "uname", "psw"})
	
	@Test
	public void login(String s1, String s2, String s0) throws IOException, InterruptedException {
		
		urlLaunch(s1);
		maximize();
		Thread.sleep(2000);
		
		findElement("//input[@id='username']");
		sendKeys(s2); 
		

		findElement("//input[@id='password']");
		sendKeys(s0);
		
		Thread.sleep(2000);
		
		findElement("//input[@id='login']");
		clicks();

	}

}
