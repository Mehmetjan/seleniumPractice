package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) {
		
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
//	driver.get("http://www.gmail.com");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mbbugra47@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	driver.quit();
	
	
	}

}
