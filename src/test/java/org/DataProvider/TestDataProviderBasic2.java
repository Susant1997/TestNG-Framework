package org.DataProvider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AdactTest.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProviderBasic2 extends BaseClass {
	
	
	
	
	@Test(dataProvider = "login", dataProviderClass = TestData.class)
	public void login( String s1, String s2) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);

	}

}
