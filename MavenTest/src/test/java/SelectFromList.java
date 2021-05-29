import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromList {

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
//		element.sendKeys("Dansk");
		// element.click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   Select select = new Select(element);
   //   select.selectByVisibleText("Latina");
   //   select.selectByIndex(2);
      
      List<WebElement> languages = driver.findElements(By.tagName("option"));
      		System.out.println(languages.get(7).getText());
		
		
		
		
	

	}

}
