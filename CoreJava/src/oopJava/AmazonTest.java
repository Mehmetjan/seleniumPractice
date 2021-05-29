package oopJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;


public class AmazonTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://amazon.com");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='desktop-banner']//li[1]")).click();
	
	
		
		

	}

}
