package stepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runnerPackage.OrangeHRM_runner_1;

public class stepDefinition extends OrangeHRM_runner_1 {
	
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
}
