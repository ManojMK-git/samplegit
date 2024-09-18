package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public WebDriver getDriver() {
		return driver;
	}
		
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public SelectHotel(WebDriver driver) {   /// constructor
		this.driver= driver;
		PageFactory.initElements(this.driver,this);
	
//	
}
}

