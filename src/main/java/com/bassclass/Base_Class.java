package com.bassclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	public static void browserLaunch(String browser) {
		//CHROME, Chrome, chrome, ChRoMe
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			}				
	}
	public static void launchUrl (String url) {
		driver.get(url);
	}
		public static void sendValues(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		
		 public static void selectDropdownByVisibleText(WebElement element, String text) {
		        Select dropdown = new Select(element);
		        dropdown.selectByVisibleText(text);	
		}
		 public static void selectDropdownByValue(WebElement element, String value) {
		        Select dropdown = new Select(element);
		        dropdown.selectByValue(value);
		 
}
		 public static void selectDropdownByIndex(WebElement element, int index) {
		        Select dropdown = new Select(element);
		        dropdown.selectByIndex(index);

		
		 }
		 public static void printScreen (String filename ) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File("C:\\Users\\h\\eclipse-workspace\\Adactin\\Reports\\" + filename + ".png");
		    FileUtils.copyFile(source, destination);
}
}
	









