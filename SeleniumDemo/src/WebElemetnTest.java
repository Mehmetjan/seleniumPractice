import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElemetnTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.gmail.com");
    String title = driver.getTitle();
    System.out.println(title);
    String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span")).getText();
    System.out.println(text);
  //  driver.findElement(By.linkText("Forgot email?")).click();
   // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
   
    driver.findElement(By.id("identifierId")).sendKeys("mehmet@gmail.com");
     driver.findElement(By.cssSelector(".RveJvd")).click();
     
	

}
}
