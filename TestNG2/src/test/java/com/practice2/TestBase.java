package com.practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	protected WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\Documents\\Dependencies\\chromedriver\\chromedriver87\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

}
