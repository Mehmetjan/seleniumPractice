
public class StepDefinition {
	WebDriver driver;

	@Given("^open the main page$")  

	public void homePage(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
		driver=new ChomeDriver;
		driver.get("http://www.iuhrdf.org");
		driver.findElement(By.xpath("//*[@id=\"block-menu-block-1\"]/div/div/div/ul/li[7]/a")).click();
	}
	
	@When ("^title of the page is IUHRDDF$")
	public getTitle() {
		String title= driver.getTitle();
		System.out.println(title)
		Assert.assertEquals("IUHRDF",title);
	}
	
	
	@Then ("^user click on Contact textLink$")
	
	public clickOnLink() {
		driver.findElement(By.xpath"//*[@id=\"block-menu-block-1\"]/div/div/div/ul/li[7]/a").click();
	}
	
//	
//	Then ("^user enter contact info$")
//	Then ("^user fill message box$")
//	And ("^cilck on Send Message button$")

}
