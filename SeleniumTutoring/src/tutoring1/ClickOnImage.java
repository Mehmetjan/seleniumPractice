package tutoring1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver85\\chromedriver.exe");	
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.cheapoair.com/flights/booknow/cheap-flights?fpaffiliate=coa-google-competitor&fpsub=&utm_campaign=competitors_exact_atlas&utm_term=expedia&utm_term_id=kwd-12670071&utm_source={google}&utm_medium={cpc}&device=c&fpprice=&campaignID=938819657&adgroupId=56710356712&gclid=Cj0KCQjwqfz6BRD8ARIsAIXQCf0bDyeo3Jjx4CG4V8n80QmYfYnBxIdG5Aj5zW8hKkMawV62I7snq1UaAicOEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(".deal-list0 > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1) > span:nth-child(1) > figure:nth-child(1) > img:nth-child(1)")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("scroll(280, 939)");
		
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/article[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]/figure[1]/img[1]")).click();
//    )
//		Actions action = new Actions(driver);
//		WebElement image = driver.findElement(By.cssSelector(".deal-list0 > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1) > span:nth-child(1) > figure:nth-child(1) > img:nth-child(1)"));
//       action.moveToElement(image).click().perform();
       
	}

}
