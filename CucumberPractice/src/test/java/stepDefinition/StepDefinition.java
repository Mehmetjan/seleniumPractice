package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {

	WebDriver driver;

	@Given("^user is on the google page$")

	public void homePage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gooogle.com");
	}

	@When("^title of the page is Google$")
	public void getTitle() {
		String title= driver.getTitle();
		Assert.assertEquals("Google",title);
}

	@Then ("^user click on gmail TextLink$")
	
	public void GmailPage() {
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
	}
	
	@Then ("^user enter username and password$") 
	public void logIn() {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mbbugra196");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Shahrizat@0901");
//		
	}
	
//	@And ("^button is cliked$")
//	public void clickNext() {
//		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
//	}
	
	
}
