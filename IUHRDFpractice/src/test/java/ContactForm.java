import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactForm {
	
	public static void main(String[] args) {
		WebDriver  driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.iuhrdf.org/contact");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("Mehmetjan");
		driver.findElement(By.xpath("//*[@id=\"edit-mail\"]")).sendKeys("bugra@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"edit-subject\"]")).sendKeys("important issues");
		driver.findElement(By.xpath("//*[@id=\"edit-message\"]")).sendKeys("this is important practice \n  please notice");
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		
	}
	
	

}
