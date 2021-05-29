package tutoring1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");	
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.cheapoair.com");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5 ,TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//*[@id=\"nowInteractSignUp\"]/div/div/input")).sendKeys("1234567");
//	driver.findElement(By.xpath("//*[@id=\"nowInteractSignUp\"]/div/div/div/button")).click();
	Actions  action = new Actions(driver);
	System.out.println("action started");
	WebElement target =driver.findElement(By.xpath("//a[@class='navigation__link dropdown-toggle']"));
	action.moveToElement(target).perform();
	driver.findElement(By.xpath("//a[@class='mega-menu__link'][contains(text(),'Gift Cards')]")).click();
	System.out.println("moved to target");
	
	//action.moveToElement()
	
 
	}

}
