package flashTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertHandling {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
		
WebDriver driver =  new ChromeDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("mehmet");
driver.findElement(By.xpath("//input[@name='submit']")).click();
driver.switchTo().alert().accept();
driver.switchTo().alert().accept();
	}
	
	

}
