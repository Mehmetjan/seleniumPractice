package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("^open the main page$")  

	public void homePage(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.iuhrdf.org");
		driver.findElement(By.xpath("//*[@id=\"block-menu-block-1\"]/div/div/div/ul/li[7]/a")).click();
	}
	
	@When ("^title of the page is IUHRDDF$")
	public void getTitle() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("IUHRDF",title);
	}
	
	
	@Then ("^user click on Contact textLink$")
	
	public void clickOnLink() {
		driver.findElement(By.xpath("//*[@id=\"block-menu-block-1\"]/div/div/div/ul/li[7]/a")).click();
	}
	
//	
//	Then ("^user enter contact info$")
//	Then ("^user fill message box$")
//	And ("^cilck on Send Message button$")

}
