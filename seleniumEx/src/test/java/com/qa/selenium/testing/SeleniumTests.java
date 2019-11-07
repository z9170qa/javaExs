package com.qa.selenium.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("test 001");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}
	@Ignore
	@Test
	public void testTwo() throws InterruptedException {
		System.out.println("test 002");
		driver.get("https://www.google.com");
		WebElement webele = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input"));
		webele.sendKeys("Halloween");
		
	}
	
	@After
	public void teardown() {
		
	}

}
