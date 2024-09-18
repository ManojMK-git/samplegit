package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tus.io/demo");
		WebElement FileUpload = driver.findElement(By.xpath("//*[@id='P0-0']"));
		
		String filePath ="C:\\Users\\h\\Documents";
		FileUpload.sendKeys(filePath);
		
}
}
