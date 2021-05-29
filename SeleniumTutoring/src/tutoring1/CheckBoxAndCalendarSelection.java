package tutoring1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxAndCalendarSelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/?pwaLob=wizard-hotel-pwa-v2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[1]/div/div/div/div/div/button")).click();
        
		WebElement field = driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[1]/div/div/div/div/div/button"));
		Actions move = new Actions(driver);
		move.click();
		move.moveToElement(field).sendKeys("washi");

		
		
		//driver.findElement(By.xpath("//input[@id='location-field-destination']")).sendKeys("washi");
		driver.findElement(By.xpath("//strong[contains(text(),'Washington (DCA - Ronald Reagan Washington Nationa')]")).click();

	}

}
