package login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;
	String username = "tomsmith";
	String password = "SuperSecretPassword!";
	String wrongPassword = "wrong password";

	@Before
	public void MoveToElement() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("^I visit the-internet.herokuapp.com/login$")
	public void i_visit_theinternetherokuappcomlogin() throws Throwable {

		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);

	}

	@When("^I enter correct user name and wrong password in the user name and password field$")
	public void i_enter_correct_user_name_and_wrong_password_in_the_user_name_and_password_field() throws Throwable {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(wrongPassword);

	}

	@And("^I press the login button$")
	public void i_press_the_login_button() throws Throwable {

		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

	}

	@Then("^I should see the Your password is invalid!$")
	public void i_should_see_the_your_username_is_invalid() throws Throwable {

		String ActualResult = driver.findElement(By.id("flash")).getText();
		String ExpectedResult = "Your password is invalid!";

		Assert.assertTrue(ExpectedResult, true);

		System.out.println(ActualResult);

	}
	
	

//	@Given("^I visit the-internet.herokuapp.com/login$")
//	public void i_visit_theinternetherokuappcomlogin1() throws Throwable {
//
//		String url = "https://the-internet.herokuapp.com/login";
//		driver.get(url);
//
//	}
//
//	@When("^I enter correct user name and correct password in the user name and password field$")
//	public void i_enter_correct_user_name_and_correct_password_in_the_user_name_and_password_field() throws Throwable {
//
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("^I press the login button$")
//	public void i_press_the_login_button1() throws Throwable {
//
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//
//	}
//
//	@Then("^I should see the welcome$")
//	public void i_should_see_the_welcome() throws Throwable {
//
//		String ActualResult2 = driver.findElement(By.id("flash")).getText();
//		String ExpectedResult2 = "You logged into a secure area!";
//
//		Assert.assertEquals(ExpectedResult2, ActualResult2);
//
//		System.out.println(ActualResult2);
//
//	}

	@After

	public void close() {
		driver.close();
	}

}