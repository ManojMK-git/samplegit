package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bassclass.Base_Class;

public class Login_Page  {
	public WebDriver driver;
	
	@FindBy(id = "username")
    private WebElement username;
	@FindBy(id = "password")
    private WebElement password;
	@FindBy(id = "login")
    private WebElement login;
	
    public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	public Login_Page(WebDriver driver) {   /// constructor
this.driver= driver;
PageFactory.initElements(this.driver,this);
}
}