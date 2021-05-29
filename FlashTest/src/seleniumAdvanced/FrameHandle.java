package seleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class FrameHandle {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
	      
	      WebDriver driver =  new ChromeDriver();
	      driver.get("https://www.guru99.com/handling-iframes-selenium.html");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
	      driver.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x250_2_0__container__");
	      driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/24132379/guru99.com_300x250_1_0\"]")).click();
	         
	System.out.println("printed");     
	}

}
