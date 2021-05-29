package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	
//		public static void main(String[] args) {
//			
			public void gmailTest() {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver87\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.gmail.com");
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mbbugra196@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
				
				
				
			   }

	}

