Feature: Manage Addresses functionality

Background: user successfully logged in 
Given user open browser with "webdriver.chrome.driver" and 
Given open app with 
When user click on cancel inital login page
When user navigate on Login button
When user click on My Profile
When user enter "7756973693" as username
When user enter "Praj0309" as a password
When user click on Login button

@SmokeTest
Scenario: Manage Address with valid functionallity
When user click on manage address
When user click on add new address
When user enter "Abhishek Aswar" as a name
When user enter "7558449335" as a mobile number
When user enter "414701" as pin code
When user enter "Near Kadam Hospital" as locality
When user enter "A/P-Hangewadi" as address
When user click on home as address type
When user click on save button
Then Application shows new address added to user

