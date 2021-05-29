package seleniumAdvanced;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoseMove2 {

	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
      
      WebDriver driver =  new ChromeDriver();
      driver.get("http://www.uyghurmovement.com");
      WebElement element1 = driver.findElement(By.xpath("//li[@id='menu-item-231']"));
      WebElement element2 = driver.findElement(By.xpath("//li[@id='menu-item-232']"));
      WebElement element3 = driver.findElement(By.xpath("//li[@id='menu-item-235']"));
      WebElement element4 = driver.findElement(By.xpath("//li[@id='menu-item-373']"));
      Actions act = new Actions(driver);
      act.moveToElement(element1).build().perform();
      Thread.sleep(2000);
      act.moveToElement(element2).build().perform();
      Thread.sleep(2000);
      act.moveToElement(element3).build().perform();
      Thread.sleep(2000);
      act.moveToElement(element4).build().perform();

	}

}
