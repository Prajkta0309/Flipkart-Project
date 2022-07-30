package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class ManageAddress
{
	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws Throwable 
	{
		Object[] input1=new Object[1];
		input1[0]="//*[@class='NS64GK _1MZ7_i']";
		Hashtable<String,Object> output1=SeleniumOperations.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"^user click on manage address$" , output1.get("MESSAGE").toString());
	  
	}
}
