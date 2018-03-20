package stepDefinitionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runnerPackage.OrangeHRM_runner_1;

public class stepDefinition extends OrangeHRM_runner_1 {
	int k;
	@Given("^I navigate to Orange HRM page$")
	public void i_navigate_to_Orange_HRM_page(){
	    driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@Given("^I log in with admin credential$")
	public void i_log_in_with_admin_credential(){
	    WebElement userName=driver.findElement (By.name("txtUsername"));
	    userName.sendKeys("Admin");
	    WebElement userPassword=driver.findElement (By.name("txtPassword"));
	    userPassword.sendKeys("admin" + Keys.ENTER);	
	}

	@Then("^I should be able to see my user info on the right side of the screen\\.$")
	public void i_should_be_able_to_see_my_user_info_on_the_right_side_of_the_screen(){
		WebElement userInfo=driver.findElement(By.id("welcome"));
		Assert.assertEquals(userInfo.getText(),"Welcome Admin");

	}

	@Then("^I should be able to click on PIM and see 'Add Employee' text on the page$")
	public void i_should_be_able_to_click_on_PIM_and_see_Add_Employee_text_on_the_page(){
	WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	pim.click();
	WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	Assert.assertEquals(addEmployee.getText(),"Add Employee");
	addEmployee.click();
	}

	@Then("^I should be able to fill up the information for my user$")
	public void i_should_be_able_to_fill_up_the_information_for_my_user(){
	WebElement firstName=driver.findElement(By.id("firstName"));
	firstName.sendKeys("John");
	WebElement lastName=driver.findElement(By.id("lastName"));
	lastName.sendKeys("Alban");
	WebElement saveButton=driver.findElement(By.id("btnSave"));
	saveButton.click();	
	}

	@Then("^I should see the new employee get created on the page with employee's detail displayed on the page$")
	public void i_should_see_the_new_employee_get_created_on_the_page_with_employee_s_detail_displayed_on_the_page(){
	WebElement personalFirstName=driver.findElement(By.id("profile-pic"));
	Assert.assertEquals(personalFirstName.getText(),"John Alban");
	WebElement personalDetails=driver.findElement(By.className("personalDetails"));
	System.out.println(personalDetails.getText());
	}

	@Then("^I should be able to click on Admin and navigate to 'Job' page$")
	public void i_should_be_able_to_click_on_Admin_and_navigate_to_Job_page(){
    WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
    admin.click();
    Actions action=new Actions(driver);
    WebElement job=driver.findElement(By.id("menu_admin_Job"));
    action.moveToElement(job).build().perform();
    WebElement jobTitles=driver.findElement(By.id("menu_admin_viewJobTitleList"));
    jobTitles.click();
	}

	@Then("^I should be able to add a job title by clicking on 'Add' button$")
	public void i_should_be_able_to_add_a_job_title_by_clicking_on_Add_button(){
	WebElement addButton=driver.findElement(By.id("btnAdd"));
	addButton.click();
	WebElement jobTitleField=driver.findElement(By.id("jobTitle_jobTitle"));
	jobTitleField.sendKeys("Project Engineer");
	WebElement saveButton=driver.findElement(By.id("btnSave"));
	saveButton.click();
	}

	@Then("^I should see the new job title get created on the page$")
	public void i_should_see_the_new_job_title_get_created_on_the_page(){

	 List<WebElement> tableArr=driver.findElements(By.xpath("//div[@id='tableWrapper']/table[1]//td"));
		for (k=1;k<tableArr.size();k++){ 
			if(tableArr.get(k).getText().equals("Project Engineer")){
			System.out.println("Passed");
			}
			}
		}
	}

