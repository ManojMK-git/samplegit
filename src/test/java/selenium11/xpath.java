package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=mobiles&rh=n%3A1389401031&ref=nb_sb_noss");
		 driver.findElement(By.xpath("//li[@aria-label='Redmi']//descendant::i[@class='a-icon a-icon-checkbox']")).click();
}
}
