package seleniumDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver_win32\\chromedriver.exe" );
     WebDriver webDriver = new  ChromeDriver();
     webDriver.get("https://www.youtube.com/watch?v=gkEjzcMOUwg");
  
	}

}
