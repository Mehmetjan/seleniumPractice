import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("http://google.com");
//		driver.get("http://www.gmail.com");
//		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mbbugra1986@gmail.com");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("uyghur");

		
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("user@gmail.com");
	}

}
