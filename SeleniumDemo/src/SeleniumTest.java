import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumTest {

	public static void main(String[] args) {
	

  
//Chrome Deriver	
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");			
//    	 WebDriver driver = new ChromeDriver();
//         driver.get("https://yandex.ru/");
//         driver.quit();

		
// FireFox Driver	
//    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();	 
//        driver1.get("https://yandex.ru");
//        driver1.quit();
        
        
// IE driver,  don't forget browser zoom set 100%;
        
		
        System.setProperty("webdriver.ie.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\IEDriverServer64\\IEDriverServer.exe");
     //  System.setProperty("webdriver.ie.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\ie_driver\\IEDriverServer.exe");
        WebDriver driver2 = new InternetExplorerDriver();
        driver2.get("https://yandex.ru");
        driver2.quit();
		
	}

}
