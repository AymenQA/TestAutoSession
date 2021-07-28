package login;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/login.feature",
//		glue = "src\\test\\java\\MyStepDefinitions",
		plugin = {"pretty", "html:target/test-report",
				  "json:target/test-report.json", 
				  "json:target/cucumber-report.json", 
			   	  "junit:target/test-report.xml" })

public class Runner {

}
