package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement element1= driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[1]/a"));
		act.moveToElement(element1).build().perform();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]/a"));
		act.moveToElement(element2).build().perform();
		Thread.sleep(2000);
		

	}

}
