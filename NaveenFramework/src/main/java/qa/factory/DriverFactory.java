package qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriverLocal = new ThreadLocal<>();
	public WebDriver int_driver(String browser) {
		System.out.println("browser is : "+browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriverLocal.set(new ChromeDriver());

		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriverLocal.set(new FirefoxDriver());

		}else {
			System.out.println("dirver is not correct");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		


	}
	public static synchronized WebDriver getDriver() {
		// TODO Auto-generated method stub
	return	tlDriverLocal.get();
	}
	


}
