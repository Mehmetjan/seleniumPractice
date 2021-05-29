package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterate {

	public static void main(String[] args) throws Exception {

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
					
			WebDriver driver =  new ChromeDriver();   
			driver.get("http://demo.guru99.com/insurance/v1/index.php");
		    driver.manage().window().maximize();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a")).click();
			Thread.sleep(2000L);
			driver.navigate().back();
			Thread.sleep(2000L);
			driver.navigate().forward();
	     }


	}

