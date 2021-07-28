
public class HerokuappLogin {

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import login.Utile;
import login.Utile.Utileauthen;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	
	Webdriver driver;
	
	
	@Before
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "http://the-internet.herokuapp.com/login";



	@Given("^I visit the\-internet\.herokuapp\.com\/login$")
	    public void i_visit_theinternetherokuappcomlogin() throws Throwable {
	        
			driver.get(url);
			driver.manage().window().maximize();
	                
	    }

	@When("^I enter user in the user name correct$")
	public void i_enter_user_in_the_user_name_correct() throws Throwable {

		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Name);

	}

	@And("^I enter user in the password field$")
	public void i_enter_user_in_the_password_field() throws Throwable {
		throw new PendingException();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

	@And("^I press the login button$")
	public void i_press_the_login_button() throws Throwable {
		throw new PendingException();

		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

	}

	@Then("^I should see the Your username is invalid!$")
	public void i_should_see_the_your_username_is_invalid() throws Throwable {
		throw new PendingException();

	}

}

}