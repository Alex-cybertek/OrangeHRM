Feature: This is a feature for OrangeHRM
@1
Scenario:  As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and see the user log in information on the right side of the page
	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.
	
@2	
Scenario: As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and add a employee by going to PIM and click on employee list.
	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.
	And I should be able to click on PIM and see 'Add Employee' text on the page
	And I should be able to fill up the information for my user
	Then I should see the new employee get created on the page with employee's detail displayed on the page
	
@3	
Scenario: As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and add a job title by going to Admin page and then click on Job page.
	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.
	And I should be able to click on Admin and navigate to 'Job' page
	And I should be able to add a job title by clicking on 'Add' button
	Then I should see the new job title get created on the page 