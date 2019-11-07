package com.qa.selenium1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEx1 {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Ignore
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("test 001");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}

	@Test
	public void testTwo() throws InterruptedException {
		System.out.println("test 002");
		driver.get("http://thedemosite.co.uk/addauser.php");
		WebElement usr = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		usr.sendKeys("Chicken");
		WebElement pwd = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		pwd.sendKeys("Nuggets");
		WebElement save = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		save.submit();
		WebElement loginNav = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginNav.click();
		WebElement usrLog = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		usrLog.sendKeys("Chicken");
		WebElement pwdLog = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		pwdLog.sendKeys("Nuggets");
		WebElement login = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		login.submit();
		WebElement success = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

		assertEquals("Unsuccessful",true,success.getText().equals("**Successful Login**"));
		
	}

	@After
	public void teardown() {
		
	}

}
