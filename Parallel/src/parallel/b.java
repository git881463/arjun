package parallel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class b {
	
	@Test
	public void testb()
	{
		
	System.setProperty("webdriver.chrome.driver","F:\\64bitAutomationSW/chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://desktop-pdi6mu2:81/login.do");
	c.findElementByName("username").sendKeys("admin");
	c.findElementByName("pwd").sendKeys("manager");
	c.findElementByXPath("//input[@type='submit']").click();
	c.findElementByLinkText("Projects & Customers").click();
	c.findElementByXPath("//input[@value='Add New Customer']").click();
	c.findElementByName("name").sendKeys("Ramcharan");
	c.findElementByXPath("//input[@value='Create Customer']").click();
	

}
}

