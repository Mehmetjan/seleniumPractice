package tutoring1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/#:~:text=Radio%20buttons%20are%20used%20when,previously%20selected%20in%20the%20list.");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.xpath("	//input[@name='permission']"));
		WebElement checkBox2 =driver.findElement(By.xpath("//input[@name='discardinfo']"));
		checkBox.click();
		checkBox2.click();
		driver.findElement(By.xpath("//input[@id='six']")).click();
		
		
	}

}
