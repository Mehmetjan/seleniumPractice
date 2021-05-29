

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;import org.openqa.selenium.interactions.Actions;

public class SeleniumDropdownSelect{

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.southwest.com/?src=SRCH_bi_cmp-361040697_adg-1176478302784804_ad-73530072968044_kwd-73530004675204:loc-190_dev-c_ext-_prd-&c");
//    driver.findElement(By.cssSelector("div.form-control_secondary:nth-child(1) > label:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > span:nth-child(1)")).click();
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}

}
