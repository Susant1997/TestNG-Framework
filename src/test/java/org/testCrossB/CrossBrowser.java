package org.testCrossB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	@Parameters({"username","password", "browser"})
	@Test

	public void crossBrowser(String s1, String s2, String browser1) throws InterruptedException {
		
		WebDriver driver = null;
		switch (browser1) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		}

		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
	}

}
