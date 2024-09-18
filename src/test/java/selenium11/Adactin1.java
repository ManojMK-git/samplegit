package selenium11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Adactin1 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/h/eclipse-workspace/Java 2.0/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("adactin hotel");

		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);

		// Login Link
		driver.findElement(By.xpath("//h3[text()='Adactin.com - Hotel Reservation System']")).click();

		driver.findElement(By.id("username")).sendKeys("akshiakshi");
		driver.findElement(By.id("password")).sendKeys("18122000");
		driver.findElement(By.id("login")).click();

		// Location
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		Select city = new Select(location);
		city.selectByVisibleText("Sydney");

		// Hotels
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Hotels.click();
		Select Hotel = new Select(Hotels);
		Hotel.selectByVisibleText("Hotel Hervey");

		// Room Type
		WebElement RoomType = driver.findElement(By.id("room_type"));
		RoomType.click();
		Select Roomtype = new Select(RoomType);
		Roomtype.selectByVisibleText("Double");

		// Rooms no
		WebElement roomno = driver.findElement(By.id("room_nos"));
		roomno.click();
		Select roomno_ = new Select(roomno);
		roomno_.selectByVisibleText("1 - One");

		// check in date
		WebElement checkindate = driver.findElement(By.id("datepick_in"));
		checkindate.clear();
		checkindate.sendKeys("12/07/2000");

		// check out date
		WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
		checkoutdate.clear();
		checkoutdate.sendKeys("13/07/2000");

		// rooms for adults
		WebElement roomforadults = driver.findElement(By.id("adult_room"));
		roomforadults.click();
		Select roomava = new Select(roomforadults);
		roomava.selectByVisibleText("1 - One");

		// rooms for child

		WebElement roomforchild = driver.findElement(By.id("child_room"));
		roomforchild.click();
		Select roomava1 = new Select(roomforchild);
		roomava1.selectByVisibleText("0 - None");

		// search
		driver.findElement(By.id("Submit")).click();

		// select hotel
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

		// first name
		driver.findElement(By.id("first_name")).sendKeys("Manoj");
		driver.findElement(By.id("last_name")).sendKeys("Kesavaraj");

		// Adreess

		driver.findElement(By.id("address")).sendKeys("4/123 b1 Krishna nagar");

		// credit card

		driver.findElement(By.id("cc_num")).sendKeys("1234567892467345");

		// Credit Card Type

		WebElement Creditcardtype = driver.findElement(By.id("cc_type"));
		Creditcardtype.click();
		Select Creditcardtype1 = new Select(Creditcardtype);
		Creditcardtype1.selectByVisibleText("Master Card");

		WebElement Month = driver.findElement(By.id("cc_exp_month"));
		Month.click();
		Select Selectmonth = new Select(Month);
		Selectmonth.selectByVisibleText("October");

		// year
		WebElement Year = driver.findElement(By.id("cc_exp_year"));               
		Year.click();
		Select Selectyear = new Select(Year);
		Selectyear.selectByVisibleText("2017");
		
		// ccv number
		driver.findElement(By.id("cc_cvv")).sendKeys("786");

       
		//Book now
	    driver.findElement(By.id("book_now")).click();
	    
	    //Logout
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    
	    
	    Thread.sleep(2000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Java 2.0\\Screenshot\\adactin.png");
	    FileUtils.copyFile(source, destination);
	    
	 }

}

	
	
	
	

