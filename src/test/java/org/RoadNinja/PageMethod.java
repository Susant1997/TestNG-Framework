 package org.RoadNinja;

import java.io.IOException;

public class PageMethod extends RoadNinjaBase{
	
	int rw = 1;
	
	public void login() throws IOException, InterruptedException {
		
		urlLaunch(excelRead(rw, 1));
		maximize();
		Thread.sleep(2000);
		
		findElement("//input[@name='username']");
		sendKeys(excelRead(rw, 2));
		Thread.sleep(2000);
		
		findElement("//input[@name='password']");
		sendKeys(excelRead(rw, 3));
		
		findElement("//button[@type='submit']");
		clicks();
		Thread.sleep(2000);

	}
	
	public void navigation() throws InterruptedException {
		
		findElement("//aside[@class='Sidebar_root__1ymce']");
		moveToElement();
		Thread.sleep(2000);
		
		findElement("//a[@href='/drivers']");
		clicks();
		Thread.sleep(2000);
		
//		findElement("//a[@href='/jobs']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//a[@href='/company']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//a[@href='/vehicles']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//a[@href='/payments']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//a[@href='/support']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//a[@href='/terms']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//button[contains(text(),'Log out')]");
//		clicks();
//		Thread.sleep(2000);
		

	}
	
	public void selectDate() throws InterruptedException {
		
		findElement("//div[contains(text(),'When')]");
		clicks();
		Thread.sleep(2000);
		
//		findElement("//button[contains(text(),'Add new period')]");
//		clicks();
//		Thread.sleep(4000);
		
//		findElement("//button[@class='rdrNextPrevButton rdrPprevButton']"); // previous button
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//button[@class='rdrNextPrevButton rdrNextButton']"); // next button
//		clicks();
//		Thread.sleep(2000);
		
//		findElement("//span[contains(text(),'19')]");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//span[contains(text(),'20')]");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//span[contains(text(),'Add')]");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//button[contains(text(),'Close')]");
//		clicks();
		
		

	}
	
	public void selectTime() throws InterruptedException {
		
//		findElement("//input[@type='checkbox']"); // Tickbox for time Unknown
//		clicks();
		// Start Time
		findElement("//input[@value='08:00 am']");
		clicks();
		
		findElement("//h6[contains(text(),'PM')]");
		clicks();
		Thread.sleep(2000);
		
//		findElement("//h6[contains(text(),'PM')]");
//		clicks();
//		Thread.sleep(2000);
		
		
		findElement("//div[@role='menu']");
		moveToElement();
		
		findElement("//span[contains(text(),'9')]");
		clicks();
		Thread.sleep(2000);
		
		
		// End Time 
		
		
		
		findElement("//input[@value='06:00 pm']");
		doubleClick();
		
		findElement("//h6[contains(text(),'PM')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//span[contains(text(),'07')]");
		clicks();
		
		findElement("//span[contains(text(),'25')]");
		clicks();
		
	}
	
	public void selectLocation() throws InterruptedException {
		
		findElement("//div[contains(text(),'Where')]");
		clicks();
		Thread.sleep(2000);
		
//		findElement("//input[@name='N']");
//		clicks();
//		Thread.sleep(2000);
//		
//		findElement("//input[@name='S']");
//		clicks();
//		Thread.sleep(2000);
		
		findElement("//input[@name='auckland']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@name='canterbury']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//a[@href='/drivers']");
		moveToElement();
		Thread.sleep(2000);
		
		
	}
	
	public void skills() throws InterruptedException {
		
		findElement("//div[contains(text(),'What skills')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//h3[contains(text(),'Licence class')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@name='1']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='2']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='3']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='4']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='5']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='6']");
		clicks();
		Thread.sleep(2000);

	}
	
	public void typesofVehicle() throws InterruptedException {
		findElement("//div[contains(text(),'Type of driving')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//button[contains(text(),'Taxi')]");
		clicks();
		Thread.sleep(2000);

	}
	
	public void endorsment() throws InterruptedException {
		findElement("//h3[contains(text(),'Endorsement')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@name='D']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='F']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='I']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='O']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='P']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='R']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='T']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='V']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='W']");
		clicks();
		Thread.sleep(2000);
	}
	
	public void gearboxExperience() throws InterruptedException {
		findElement("//h3[contains(text(),'Gearbox experience')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@name='auto-manual']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='automatic']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='manual-sync']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='manual-non-sync']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='road-ranger']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='split-shift-manual']");
		clicks();
		Thread.sleep(2000);


	}
	
	public void vehicleCombination() throws InterruptedException {
		findElement("//h3[contains(text(),'Vehicle combination')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@name='a-train']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='b-train']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='semi']");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@name='truck-and-trailer']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//div[contains(text(),'Payment')]");
		moveToElement();
		Thread.sleep(2000);
		

	}
	
	public void clearAll() {
		findElement("//button[contains(text(),'Clear all')]");
		clicks();

	}
	
	public void paymentsFR() throws InterruptedException, IOException {
		findElement("//div[contains(text(),'Payment')]");
		clicks();
		Thread.sleep(2000);
		
		findElement("//p[contains(text(),'Fix price offer')]");
		clicks();
		Thread.sleep(1000);
		
		findElement("//input[@inputmode='numeric']");
		sendKeys(excelRead(rw, 6));

		
		
	}
	
	public void search() {
		findElement("//button[@type='submit']");
		doubleClick();
		clicks();
	}
	
	

}
