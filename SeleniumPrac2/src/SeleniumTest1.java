import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {
	
	
	public static void main(String[] args)  {
	
		 System.setProperty("webdriver.gecko.driver",("C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe"));
		
		WebDriver driver = new FirefoxDriver();
	     //driver.get("http:///www.google.com");
		driver.navigate().to("http://www.google.com");
  
}
}