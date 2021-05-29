package flashTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType.ForSeleniumServer;

public class YoutubeTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		//driver.findElement(By.className("#h-c-header__nav-li-link")).click();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,2000)");
		Thread.sleep(2000L);

	 driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/a")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/footer/section/ul[1]/li[1]/a")).click();
		 
		
	}

}
