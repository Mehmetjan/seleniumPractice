package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class LoginPageSteps {
	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        throw new PendingException();
    }

    @When("^user gets the title of the page$")
    public void user_gets_the_title_of_the_page() throws Throwable {
        throw new PendingException();
    }

    @When("^user is on login page$")
    public void loginPage() throws Throwable {
        throw new PendingException();
    }

    @When("^user enters username \"([^\"]*)\"$")
    public void enterUsername(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^user enter password \"([^\"]*)\"$")
    public void enterPassword(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^page title should be \"([^\"]*)\"$")
    public void pageTitile(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^Forgot passwoed link should be displayed$")
    public void forgotPassword() throws Throwable {
        throw new PendingException();
    }

    @Then("^user gets the title of the page$")
    public void getTitle() throws Throwable {
        throw new PendingException();
    }

    @And("^page title should be \"([^\"]*)\"$")
    public void title(String strArg1) throws Throwable {
        throw new PendingException();
    }

}

	
	

