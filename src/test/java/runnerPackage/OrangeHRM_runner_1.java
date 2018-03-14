package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


@CucumberOptions (features= {"features"},tags="@3", glue = {"stepDefinitionPackage"})
public class OrangeHRM_runner_1 extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){		 
		WebDriverManager.chromedriver().setup();		  
		driver=new ChromeDriver();	
	}

//	@AfterTest
//	public void tearDown(){
//		driver.quit();
//	}

}
