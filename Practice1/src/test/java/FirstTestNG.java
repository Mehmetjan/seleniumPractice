
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class FirstTestNG {
	
	public void firstTest() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	   driver.get("http://www.gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mbbugra");
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
	}
	
	
	 public void secondTest() {
	  
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver87\\chromedriver.exe");
	   WebDriver driver1 = (WebDriver) new ChromeDriver();
	   driver1.get("http://www.gmail.com");
	   driver1.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mehmetjan");
	   driver1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	   
		 }
}
