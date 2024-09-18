package com.bstepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.FileReader.FileReaderManager;

import com.bassclass.Base_Class;
import com.configuration.ConfigurationClass;
import com.pom.Book_A_Hotel;
import com.pom.Login_Page;
import com.pom.Logout;
import com.pom.SearchHotelPage;
import com.pom.SelectHotel;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition extends Base_Class {
	
	
	@Before
  public static void setUp() {
      // Launch browser
     browserLaunch("chrome");
  }

	@After
    public static void tearDown(Scenario scenario) throws IOException {
        
        if (scenario.isFailed()) {
        	printScreen("Demo");
        }
            
    }
//public static WebDriver driver;
	//public static ConfigurationClass Config;

	public static Login_Page Login;
	// public static SearchHotelPage Search;
	//public static SelectHotel Select;
	//public static Book_A_Hotel Book;
    //public static Logout Logout1;
	

	@Given("^user Launch The Url Of The Adactin Application$")
	public void user_Launch_The_Url_Of_The_Adactin_Application() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Login = new Login_Page (driver);
		driver.get("https://adactinhotelapp.com/");
//		launchUrl(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
	
		
	}

//@When("^user Enter The Username In The Respective Field$")
//public void user_Enter_The_Username_In_The_Respective_Field() throws Throwable {
//	Login = new Login_Page (driver);
//	
//
//    sendValues(Login.getUsername(),FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
//}
//
//
//@When("^user Enter The Password In The Respective Field$")
//public void user_Enter_The_Password_In_The_Respective_Field() throws Throwable {
//	Login = new Login_Page (driver);
//
//	sendValues(Login.getPassword(),FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
//}
	
	


	
//	@When("^user Enter The Username \"([^\"]*)\" In The Respective Field$")
//	public void user_Enter_The_Username_In_The_Respective_Field(String Username) throws Throwable {
//		Login = new Login_Page (driver);
//		sendValues(Login.getUsername(), Username);
//	}
//
//	@When("^user Enter The Password \"([^\"]*)\" In The Respective Field$")
//	public void user_Enter_The_Password_In_The_Respective_Field(String Password) throws Throwable {
//		Login = new Login_Page (driver);
//		sendValues(Login.getPassword(), Password);
//	}
//	
	@When("^user Enter The Username In The Respective Field$")
public void user_Enter_The_Username_In_The_Respective_Field() throws Throwable {
	 //  driver.findElement(By.id("username")).sendKeys("akshiakshi");
		sendValues(driver.findElement(By.id("usrname")),"akshiakshi");
		
	}

	@When("^user Enter The Password In The Respective Field$")
	public void user_Enter_The_Password_In_The_Respective_Field() throws Throwable {
	  // driver.findElement(By.id("password")).sendKeys("18122000");
		sendValues(driver.findElement(By.id("password")),"18122000");
		
	}
//	@When("^user Enter The Following Credentials$")
//	public void user_Enter_The_Following_Credentials(DataTable dataTable) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		// For automatic transformation, change DataTable to one of
//		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//		// E,K,V must be a scalar (String, Integer, Date, enum etc)
//		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);
//
//		String Username = asMaps.get(0).get("Username");
//		String Password = asMaps.get(0).get("Password");
//
//		Login = new Login_Page(driver);
//		sendValues(Login.getUsername(), Username);
//		sendValues(Login.getPassword(), Password);
//
//	}
//
	@Then("^user Clicks The Loginbutton and Its Navigates To The Home Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Home_Page() throws Throwable {
		// driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		clickOnElement(Login.getLogin());
		// clickOnElement(driver.findElement(By.id("login")));

	}
}

//	@When("^user Select The location Dropdown List$")
//	public void user_Select_The_location_Dropdown_List() throws Throwable {
//		//WebElement location = driver.findElement(By.id("location"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getLocation(), "Sydney");
//	       // selectDropdownByVisibleText(location, "Sydney");
//		
//	}
//
//
//	@When("^user Select The Hotel Dropdown List$")
//    public void user_Select_The_Hotel_Dropdown_List() throws Throwable {
//	// WebElement hotel = driver.findElement(By.id("hotels"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getHotels(), "Hotel Creek");
//    // selectDropdownByVisibleText(hotel, "Hotel Creek");
//	}
//	
//	@When("^user Select The Room Type Dropdown List$")
//	public void user_Select_The_Room_Type_Dropdown_List() throws Throwable {
//		//WebElement roomType = driver.findElement(By.id("room_type"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getRoom_type(), "Standard");
//       // selectDropdownByVisibleText(roomType, "Standard");
//	}
//
//	@When("^user Select The Number Of Rooms Dropdown List$")
//	public void user_Select_The_Number_Of_Rooms_Dropdown_List() throws Throwable {
//		// WebElement numOfRooms = driver.findElement(By.id("room_nos"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getRoom_nos(), "1 - One");
//	        //selectDropdownByVisibleText(numOfRooms, "1 - One");
//	}
//
//	@When("^user Write The Check In Date In The Respective Field$")
//	public void user_Write_The_Check_In_Date_In_The_Respective_Field() throws Throwable {
//		// WebElement checkInDate = driver.findElement(By.id("datepick_in"));
//		Search = new SearchHotelPage(driver);
//		sendValues(Search.getDatepick_in(),"20/08/2024");
//	        //sendValues(checkInDate, "20/08/2024");
//	}
//
//	@When("^user Write The Check Out Date In The Respective Field$")
//	public void user_Write_The_Check_Out_Date_In_The_Respective_Field() throws Throwable {
//		//WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
//		Search = new SearchHotelPage(driver);
//		sendValues(Search.getDatepick_out(),"22/08/2024");
//       // sendValues(checkOutDate, "22/08/2024");
//	}
//
//	@When("^user Select The Adults Per Room Dropdown List$")
//	public void user_Select_The_Adults_Per_Room_Dropdown_List() throws Throwable {
//		//WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getAdult_room(),"2 - Two");
//        //selectDropdownByVisibleText(adultsPerRoom, "2 - Two");
//
//	}
//
//	@When("^user Select The Children Per Room Dropdown List$")
//	public void user_Select_The_Children_Per_Room_Dropdown_List() throws Throwable {
//		// WebElement childrenPerRoom = driver.findElement(By.id("child_room"));
//		Search = new SearchHotelPage(driver);
//		selectDropdownByVisibleText(Search.getChild_room(),"0 - None");
//	        //selectDropdownByVisibleText(childrenPerRoom, "0 - None");
//	}
//
//	@Then("^user Clicks The Searchbutton and Its Navigates To The Select Hotel$")
//	public void user_Clicks_The_Searchbutton_and_Its_Navigates_To_The_Select_Hotel() throws Throwable {
//		//WebElement searchButton = driver.findElement(By.id("Submit"));
//		Search = new SearchHotelPage(driver);
//		clickOnElement(Search.getSubmit());
//		//clickOnElement(searchButton);
//	}
//
//
//	@When("^user Select The Radiobutton$")
//  public void user_Select_The_Radiobutton() throws Throwable {
//		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
//        radioButton.click();
//	}
//
//	@Then("^user Clicks The ContinueButton and Its Navigates To The Book A Hotel$")
//	public void user_Clicks_The_ContinueButton_and_Its_Navigates_To_The_Book_A_Hotel() throws Throwable {
//		//WebElement continueButton = driver.findElement(By.id("continue"));
//		Select = new SelectHotel(driver);
//		clickOnElement(Select.getContinueButton());
//	}
//	
//
//	@When("^user Write The First Name In Respective Field$")
//	public void user_Write_The_First_Name_In_Respective_Field() throws Throwable {
//		// WebElement firstName = driver.findElement(By.id("first_name"));
//		Book = new Book_A_Hotel(driver);
//	        sendValues(Book.getFirstName(), "Manoj");
//	}
//
//	@When("^user Write The Last Name In Respective Field$")
//	public void user_Write_The_Last_Name_In_Respective_Field() throws Throwable {
//		//WebElement lastName = driver.findElement(By.id("last_name"));
//		Book = new Book_A_Hotel(driver);
//        sendValues(Book.getLastName(), "Kesavaraj");
//	}
//
//	@When("^user Write The Billing Address In Respective Field$")
//	public void user_Write_The_Billing_Address_In_Respective_Field() throws Throwable {
//		// WebElement billingAddress = driver.findElement(By.id("address"));
//		 Book = new Book_A_Hotel(driver);
//	        sendValues(Book.getBillingAddress(), "4/123 b1 Krishna nagar");
//	}
//
//	@When("^user Write The Credit Card No In Respective Field$")
//	public void user_Write_The_Credit_Card_No_In_Respective_Field() throws Throwable {
//		//WebElement creditCardNo = driver.findElement(By.id("cc_num"));
//		Book = new Book_A_Hotel(driver);
//        sendValues(Book.getCreditCardNo(), "1234567812345678");
//	}
//
//	@When("^user Select The Credit Card Type Dropdown List$")
//	public void user_Select_The_Credit_Card_Type_Dropdown_List() throws Throwable {
//		//WebElement creditCardType = driver.findElement(By.id("cc_type"));
//		Book = new Book_A_Hotel(driver);
//        selectDropdownByVisibleText(Book.getCreditCardType(), "VISA");
//	}
//
//	@When("^user Select The Expiry Date, Month, Year Dropdown List$")
//	public void user_Select_The_Expiry_Date_Month_Year_Dropdown_List() throws Throwable {
//		// Select expiry month and year from the dropdown list
//        //WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));
//        Book = new Book_A_Hotel(driver);
//        selectDropdownByVisibleText(Book.getExpiryMonth(), "October");
//        
//       // WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
//        Book = new Book_A_Hotel(driver);
//        selectDropdownByVisibleText(Book.getExpiryYear(), "2017");
//	}
//
//	@When("^user Write The Cvv Number In Respective Field$")
//	public void user_Write_The_Cvv_Number_In_Respective_Field() throws Throwable {
//		 //WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
//		 Book = new Book_A_Hotel(driver);
//	        sendValues(Book.getCvvNumber(), "123");
//	}
//
//	@Then("^user Clicks The Booknowbutton and Its Navigates To The Booking Confirmation$")
//	public void user_Clicks_The_Booknowbutton_and_Its_Navigates_To_The_Booking_Confirmation() throws Throwable {
//		// WebElement bookNowButton = driver.findElement(By.id("book_now"));
//		 Book = new Book_A_Hotel(driver);
//		 clickOnElement(Book.getBookNowButton());
//	}
//
//	 @Then("^user Clicks The Logoutbutton$")
//	    public void user_Clicks_The_Logoutbutton() {
//	        // Click on the logout button
//	       // WebElement logoutButton = driver.findElement(By.id("logout"));
//		 Logout1 = new Logout(driver);
//	        clickOnElement(Logout1.getLogoutButton());
//	 }
//}
//	
