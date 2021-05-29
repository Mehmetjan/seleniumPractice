package seleniumAdvanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Flash.FlashObjectWebDriver;



public class WindoswHandles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();  
		driver.get("https://support.start.me/hc/en-us/articles/360016816939-Set-start-me-as-the-homepage-on-your-Chromebook");
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		System.out.println(iterate.next());
		driver.findElement(By.xpath("//*[@id=\"article-container\"]/article/section[1]/div/div[1]/p[4]/a")).click();
		
		
		winds=driver.getWindowHandles();
		iterate=winds.iterator();
		
		String firstWin= iterate.next();
		String secondWin=iterate.next();
		
		System.out.println(firstWin);
		System.out.println(secondWin);
		Thread.sleep(3000);
		
		
		driver.switchTo().window(secondWin);
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div[1]/ytd-button-renderer[1]/a/yt-formatted-string")).click();
	
	 	

	}

}
