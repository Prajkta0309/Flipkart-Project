Feature: Login Functionality

Background: Open Application Succussfully
Given user open browser with "webdriver.chrome.driver" and 
Given open app with 


@SmokeTest
Scenario: Login Functinality with valid credentials
When user click on cancel inital login page
When user navigate on Login button
When user click on My Profile
When user enter "7756973693" as username
When user enter "Praj0309" as a password
When user click on Login button
Then application shows login successfully

