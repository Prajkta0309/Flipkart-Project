package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.configReader;



public class SeleniumOperations 
{
	public static configReader config;
	public static ChromeDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
{
	try
	{
		config=new configReader();
	String strBrowserName=(String)inputParameters[0];
	
	System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:browserLaunch,inputGiven: "+inputParameters[0].toString() );
	}catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
    outputParameters.put("MESSAGE", "methodUsed:browserLaunch,inputGiven: "+inputParameters[0].toString());
	}
   
	return outputParameters;
}
public static Hashtable<String,Object> openApp()
{
	try
	{

	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	driver.get(config.getApplicationUrl());
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:openApp,inputGiven: "+config.getApplicationUrl().toString());
	}catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methodUsed:openApp,inputGiven: "+config.getApplicationUrl().toString());	
	}
	return outputParameters;
}
public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
{
	try
	{
	String path=(String)inputParameters[0];
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	driver.findElementByXPath(path).click();
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:clickOnElement,inputGiven: "+inputParameters[0].toString());
	}catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methodUsed:clickOnElement,inputGiven: "+inputParameters[0].toString());	
	}
	return outputParameters;
}
public static Hashtable<String,Object> moveToElement(Object[]inputParameters )
{
	try
	{
	String xpath=(String)inputParameters[0];
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	Actions act=new Actions(driver);
	WebElement b=driver.findElementByXPath(xpath);
	act.moveToElement(b).build().perform();
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:moveToElement,inputGiven: "+inputParameters[0].toString());
	}catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methodUsed:moveToElement,inputGiven: "+inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> sendTextOnUi(Object[]inputParameters) throws InterruptedException
{
	try
	{Thread.sleep(5000);
	String path=(String)inputParameters[0];
	String text=(String)inputParameters[1];
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	driver.findElementByXPath(path).sendKeys(text);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:sendTextOnUi,inputGiven: "+inputParameters[1].toString());
	}catch(Exception e)
	{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methodUsed:sendTextOnUi,inputGiven: "+inputParameters[1].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> validation(Object[]inputParameters) throws InterruptedException
{
	try
	{Thread.sleep(5000);
	String givenText=(String)inputParameters[0];
	String locator=(String)inputParameters[1];
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	String capturedText=driver.findElement(By.xpath(locator)).getText();
	if(givenText.equalsIgnoreCase(capturedText))
	{
		System.out.println("test is pass");
	}
	else{
		System.out.println("test is failed");
	}outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:validation,inputGiven: "+inputParameters[1].toString());
	}catch(Exception e)
	{
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:validation,inputGiven: "+inputParameters[1].toString());	}
	return outputParameters;
}
public static void main(String[] args) throws InterruptedException 
{
	Object[] input1=new Object[2];
	input1[0]="webdriver.chrome.driver";
	input1[1]="P:\\Drivers\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input1);
	
	Object[] input2=new Object[1];
	input2[0]="https://www.flipkart.com/";
	SeleniumOperations.openApp();
	
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input3);

	Object[] input4=new Object[1];
	input4[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.moveToElement(input4);
	
	Object[] input5=new Object[1];
	input5[0]="//*[text()='My Profile']";
	SeleniumOperations.clickOnElement(input5);

	Object[] input6=new Object[2];
	input6[0]="//*[@class='_2IX_2- VJZDxU']";
	input6[1]="7756973693";
	SeleniumOperations.sendTextOnUi(input6);
	
	Object[] input7=new Object[2];
	input7[0]="//*[@type='password']";
	input7[1]="Praj0309";
    SeleniumOperations.sendTextOnUi(input7);
    
    Object[] input8=new Object[1];
    input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
    SeleniumOperations.clickOnElement(input8);
    
    Object[] input9=new Object[2];
    input9[0]="Prajkta Aswar";
    input9[1]="//*[@class='_1ruvv2']";
    SeleniumOperations.validation(input9);
}
}
