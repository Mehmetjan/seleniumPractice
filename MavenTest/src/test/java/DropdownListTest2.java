import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest2 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	WebElement element =  driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
	 
	 
	 Select select = new Select(element);
	// select.selectByIndex(2);
	// select.selectByVisibleText("Dansk");
	// select.getAllSelectedOptions();
	 List<WebElement> options = driver.findElements(By.tagName("option"));
	 System.out.println(options.size());
//	  for(WebElement i:options) {
//		  System.out.println(i.getText());
//	 for(int i = 0; i<options.size();i++) {
//		   System.out.println(options.get(i).getAttribute("lang"));
//     }
	
	
 List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(WebElement link: links) {
    	System.out.println("language is "+link.getText()+", url is:"+link.getAttribute("href"));
    }
	
	
	}

}
