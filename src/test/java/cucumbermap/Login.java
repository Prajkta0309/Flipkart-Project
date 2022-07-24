package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login
{
	@Given ("^user open browser with \"(.*)\" and$") 
	public void bLaunch(String key)
	{
	Object[] input1=new Object[1];
	input1[0]=key;
	SeleniumOperations.browserLaunch(input1);
	}
	
	@Given ("^open app with$") 
	public void openApp()
	{
		SeleniumOperations.openApp();
	}

	@When("^user click on cancel inital login page$")
	public void user_click_on_cancel_inital_login_page() throws Throwable 
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object> output3=SeleniumOperations.clickOnElement(input3);
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable 
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output4=SeleniumOperations.moveToElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user navigate on Login button$", output4.get("MESSAGE").toString());
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable 
	{
		Object[] input5=new Object[1];
		input5[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user click on My Profile$", output5.get("MESSAGE").toString());
	}

	@When ("^user enter \"(.*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]=uname;
		Hashtable<String,Object> output6=SeleniumOperations.sendTextOnUi(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output6.get("MESSAGE").toString());
	}

	@When ("^user enter \"(.*)\" as a password$")
   public void user_enter_as_a_password(String pass) throws Throwable 
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@type='password']";
		input7[1]=pass;
		Hashtable<String,Object> output7=SeleniumOperations.sendTextOnUi(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"(.*)\" as a password$", output7.get("MESSAGE").toString());
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input8=new Object[1];
		input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user click on Login button$", output8.get("MESSAGE").toString());
	}

	@Then ("^application shows login successfully$")
	public void application_shows_login_successfully() throws Throwable 
	{
		Thread.sleep(9000);
		Object[] input9=new Object[2];
		input9[0]="Prajkta Aswar";
		input9[1]="//*[@class='_1ruvv2']";
		Hashtable<String,Object> output9= SeleniumOperations.validation(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^application shows login successfully$", output9.get("MESSAGE").toString());

	}



}
