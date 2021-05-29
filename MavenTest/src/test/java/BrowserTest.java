import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("please enter browser name:");
			String driverIn = sc.next();
		if(driverIn.equals("ie")){
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\ie_driver\\IEDriverServer.exe");
					
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		} else if(driverIn.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://gmail.com");
			System.out.println(driver.getTitle());
		}else if(driverIn.contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://gmail.com");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mehmet@gmail.com");
			
			
			System.out.println(driver.getTitle());
		}
		
	}

}
