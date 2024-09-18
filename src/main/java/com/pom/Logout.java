package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	
	
	@FindBy(id = "logout")
	private WebElement logoutButton;


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public Logout(WebDriver driver) {   /// constructor
		this.driver= driver;
		PageFactory.initElements(this.driver,this);
}
}