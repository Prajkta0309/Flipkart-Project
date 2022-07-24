package trail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{ 

	
	public static void main(String[] args) throws Exception 
	{   //Browser Launch
		System.setProperty("webdriver.chrome.driver", "P:\\Drivers\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    
	     //Open apllication 
	       driver.get("https://www.flipkart.com/");
	       
	       //Cancel login window
	       driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	       
	       //navigate to login
	       Actions act=new Actions(driver);
	       WebElement b=driver.findElementByXPath("//*[@class='_1_3w1N']");
	     act.moveToElement(b).build().perform();
	       //Click on login 
	     driver.findElementByXPath("//*[text()='My Profile']").click();
	     //Enter username
	     Thread.sleep(5000);
	     driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("7756973693");
	     //Enter password
	     driver.findElementByXPath("//*[@type='password']").sendKeys("Praj0309");
	     //Click on login button
	     driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	    
	       
	}

}
