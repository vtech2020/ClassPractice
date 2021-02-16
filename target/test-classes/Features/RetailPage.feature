@retailPage
Feature: Retail Website Features

# Every feature file starts with Feature: <Name of feature file>
# Every scenario starts with scenario: <Name of test case we want to automate>
# Gherkin keywords are Given When Then
# Given is precondition
# When is an action taken
# Then is an expected result (we write validation)
# And is repeating action or can be used following Given keyword as well
# But is used for negative scenarios verification



#ctrl+shift+F will format file


Background:
	Given User is on Retail website 
	
@Test
Scenario: Search functionality Test case
	When User search for 'iPhone'
	And User click on search button 
	Then User should see iphone image
	
#we can run same scenarios with multiple sets of data
#we will use Examples keyword to pass different data
#Every scenario outline follows with Example keyword
#Under Examples keyword we placed Data inside the pipes || and we can separate columns
#In Examples each row represents one time execution


	
Scenario Outline:: Test search functionality with multipple sets of Data
	When User search for '<itemName>'
	And User click on search button 
	
	Examples:
	|itemName|
	|iphone|
	|mac book|
	|Canon|
	
@RegisterTest	
Scenario: Register an Account test case
		When User click on MyAccount
		And User click on Register option 
		And User fill the Registration form with below information
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|alexaS123@gmail.com|101202633|testic|testic|no|
		And User accept the privacy and policy
		And User click on Continue button
		Then User will be registered in Retail website
		

