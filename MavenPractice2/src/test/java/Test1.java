import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test
	public void chromeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver87\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:///wwww.yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[3]/div/div[3]/div[1]/div/a")).click();
		
		
	}
	
	
	
	

}
