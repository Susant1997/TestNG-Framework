package AdactTest;

import org.testng.annotations.Test;

public class Addact_4_InvalidPass extends BaseClass{
	
	
	int rw = 4;
	
	@Test
	public void test01() throws Exception {
		urlLaunch(excelRead(rw, 1));
		maximize();
		Thread.sleep(3000);
		findElement("//input[@id='username']");
		sendKeys(excelRead(rw, 2));
		Thread.sleep(2000);
		findElement("//input[@id='password']");
		sendKeys(excelRead(rw, 3));
		Thread.sleep(2000);
		findElement("//input[@id='login']");
		clicks();
			}
	
	
	
	


}
