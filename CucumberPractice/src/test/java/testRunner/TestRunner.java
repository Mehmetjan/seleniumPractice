package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mehme\\eclipse-workspace\\SeleniumPractice\\CucumberPractice\\src\\test\\java\\feature\\login.feature", glue = {
		"stepDefinition" }, // step definition package name

		format = { "pretty", "html:test-output" }, dryRun = true

)

public class TestRunner {

}
