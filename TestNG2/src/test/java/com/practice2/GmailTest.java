package com.practice2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailTest extends TestBase {

	@Test
	public void gmail() {

		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mbbugra1986");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).click();
	}

	@Test

	public void recoverPswd() {

		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).click();
	}
}
