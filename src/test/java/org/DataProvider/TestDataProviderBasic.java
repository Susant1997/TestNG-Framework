package org.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AdactTest.BaseClass;

public class TestDataProviderBasic extends BaseClass {
	
	
	@DataProvider(name ="login")
	public String[][] myData() {
		
		String Data[][] = new String[2][2];
		Data[0][0] = "susant1997";
		Data[0][1] = "December@06";
		
		Data[1][0] = "csasikumarmes";
		Data[1][1] = "sql403";
		
		return Data;

	}
	
	@Test(dataProvider = "login")
	public void login( String s1, String s2) throws IOException, InterruptedException {
		
		urlLaunch("https://adactinhotelapp.com/");
		maximize();
		Thread.sleep(2000);
		
		findElement("//input[@id='username']");
		sendKeys(s1); 
		

		findElement("//input[@id='password']");
		sendKeys(s2);
		
		Thread.sleep(2000);
		
		findElement("//input[@id='login']");
		clicks();

	}

}
