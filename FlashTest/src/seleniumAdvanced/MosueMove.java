package seleniumAdvanced;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class MosueMove{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\1\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://www.google.com");
		Actions action  =new Actions(driver);
		WebElement  element1 =driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		WebElement  element2 =driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a"));
		action.moveToElement(element2).perform();
	    System.out.print("performed");
		
		

	}

}
