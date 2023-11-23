package org.sequences;

import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.Test;

public class AddactPagemethod extends BaseClass {
	
	
	
	@Test(priority = 0, alwaysRun = true)
	public void login() throws IOException, InterruptedException {
		
		urlLaunch(excelRead(1, 1));
		maximize();
		Thread.sleep(2000);
		
		findElement("//input[@id='username']");
		sendKeys(excelRead(1, 2)); 
		

		findElement("//input[@id='password']");
		sendKeys(excelRead(1, 3));
		
		Thread.sleep(2000);
		
		findElement("//input[@id='login']");
		clicks();

	}
	
	@Test (dependsOnMethods = "login")
	
	public void Searchhotel() throws IOException, InterruptedException {
		
		findElement("//select[@id='location']");
		selectByvalue(excelRead(1, 4));
		Thread.sleep(1000);
		
		findElement("//select[@id='hotels']");
		selectByvalue(excelRead(1, 5));
		Thread.sleep(1000);
		
		findElement("//select[@name='room_type']");
		selectByVisibilText(excelRead(1, 6));
		Thread.sleep(1000);
		
		findElement("//select[@name='room_nos']");
		selectByVisibilText(excelRead(1, 7));
		
		Thread.sleep(2000);
		findElement("//input[@id='datepick_in']");
		clear();
		sendKeys(excelRead(1, 8));
		
		Thread.sleep(2000);
		findElement("//input[@id='datepick_out']");
		clear();
		sendKeys(excelRead(1, 9));
		Thread.sleep(1000);
		
		findElement("//select[@name='adult_room']");
		selectByVisibilText(excelRead(1, 10));
		Thread.sleep(1000);
		
		findElement("//select[@name='child_room']");
		selectByVisibilText(excelRead(1, 11));
		Thread.sleep(2000);
		
		findElement("//input[@id='Submit']");
		clicks();
		

	}
	
	@Test (dependsOnMethods = "Searchhotel")
	
	public void Selecthotel() throws InterruptedException {
		
		findElement("//input[@id='radiobutton_0']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@id='continue']");
		clicks();

	}
	
	@Test (dependsOnMethods = "Selecthotel")
	
	public void Booknow() throws IOException, InterruptedException {
		
		findElement("//input[@id='first_name']");
		sendKeys(excelRead(1, 12));
		
		findElement("//input[@id='last_name']");
		sendKeys(excelRead(1, 13));
		
		findElement("//textarea[@id='address']");
		sendKeys(excelRead(1, 14));
		
		findElement("//input[@id='cc_num']");
		sendKeys(excelRead(1, 15));
		
		findElement("//select[@id='cc_type']");
		selectByvalue(excelRead(1, 16));
		
		findElement("//select[@id='cc_exp_month']");
		selectByVisibilText(excelRead(1, 17));
		
		findElement("//select[@id='cc_exp_year']");
		selectByVisibilText(excelRead(1, 18));
		
		findElement("//input[@id='cc_cvv']");
		sendKeys(excelRead(1, 19));
		Thread.sleep(2000);
		
		findElement("//input[@id='book_now']");
		clicks();
		Thread.sleep(6000);
		

	}
	
	@Test (dependsOnMethods = "Booknow")
	
	public void Bookingconfirm() throws IOException, InterruptedException {
		
		findElement("//input[@id='order_no']");
		getAttributes();
		takesScreenShot();
		Thread.sleep(2000);
		
		findElement("//input[@id='logout']");
		clicks();
		
		//quit();

	}
	
	@Test (dependsOnMethods = "Bookingconfirm", enabled = false)
	
	public  void logout() {
		
		quit();
	
	}
	
	
	

}
