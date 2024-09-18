package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement billingAddress;
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	@FindBy(id = "cc_type")
	private WebElement creditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id = "book_now")
	private WebElement bookNowButton;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	public Book_A_Hotel(WebDriver driver) {   /// constructor
		this.driver= driver;
		PageFactory.initElements(this.driver,this);
	
	}
}
