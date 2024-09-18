	package com.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority_Test {
	public static WebDriver driver;
	public static Actions act;
	private static final Logger logger = LogManager.getLogger(Parameterization.class);
	@Test(priority = 1)
	public void launch_url() {
		logger.info("Launching Chrome Browser");
		// Setup WebDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver
		driver = new ChromeDriver();
		logger.info("Launching Amazon");
		// Open the Amazon website
		driver.get("https://www.amazon.in/");

		// Maximize the browser window
		driver.manage().window().maximize();
		

	}

	@Test(priority = 4)
	public void todayDeal() throws AWTException {
		WebElement todaydeal = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
		Actions act = new Actions(driver);
		act.contextClick(todaydeal).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 3)
	public void Mobiles() throws AWTException {
		WebElement Mobiles = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(Mobiles).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 2)
	public void fashion() throws AWTException {
		WebElement Mobiles = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion']"));
		Actions act = new Actions(driver);
		act.contextClick(Mobiles).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 5)
	public void WindowHandle1() {
		String parent = driver.getWindowHandle();
		List<String> windowsList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsList.get(3));

	}
}
