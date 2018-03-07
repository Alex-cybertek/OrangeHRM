Feature: This is a feature for OrangeHRM

Scenario:  As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and see the user log in information on the right side of the page
	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.