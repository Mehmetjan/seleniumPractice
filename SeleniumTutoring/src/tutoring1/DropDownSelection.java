package tutoring1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");	
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("mehmet");
		driver.findElement(By.name("lastName")).sendKeys("bugra");
		driver.findElement(By.name("phone")).sendKeys("134553");
		driver.findElement(By.name("userName")).sendKeys("bugra731@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("522 piedmont str");
		driver.findElement(By.name("city")).sendKeys("Arlington");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("33002");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANGOLA");
		
		driver.findElement(By.name("email")).sendKeys("bugra47@gail.com");
		driver.findElement(By.name("password")).sendKeys("mb553");
		driver.findElement(By.name("confirmPassword")).sendKeys("mb553");
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
	}

}
