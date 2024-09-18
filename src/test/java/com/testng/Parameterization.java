package com.testng;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import com.bassclass.Base_Class;

public class Parameterization extends Base_Class {

	private static final Logger logger = LogManager.getLogger(Parameterization.class);
	@BeforeClass	
	public void browserLaunch() {
		logger.info("Launching Chrome Browser");
		browserLaunch("chrome");
		logger.info("Launching Adactin Url");
		driver.get("https://adactinhotelapp.com/");
		
	}
	
	@Parameters({"Username","Password"})
	@Test
	public void login(String username, String password) {
		driver.findElement(By.id("username")).sendKeys("akshiakshi");
		driver.findElement(By.id("password")).sendKeys("18122000");
		driver.findElement(By.id("login")).click();

}
	@AfterClass
	public void tearDown() {
		logger.info("Closing the browser");
		driver.quit();
	}
}
