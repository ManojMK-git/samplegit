package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataReadAndWrite {

	static List<String> username = new ArrayList<String>();
	static List<String> password = new ArrayList<String>();

	public static void username() throws IOException {
    
	
	
	File f = new File("C:\\Users\\h\\eclipse-workspace\\Adactin\\data\\eclipse.excel.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
	Sheet sheetAt = wb.getSheetAt(0);
	int rowSize = sheetAt.getPhysicalNumberOfRows();
	for (int i= 0; i < rowSize; i++) {
		Row row = sheetAt.getRow(i);
		Cell cell = row.getCell(0);
		CellType typeOfCell = cell.getCellType();
		if(typeOfCell.equals(CellType.STRING)){
String Str = cell.getStringCellValue();
username.add(Str);

		} else if (typeOfCell.equals (CellType.NUMERIC)) {
			double val = cell.getNumericCellValue();
			System.out.println(val); 
				
			}
		}
		System.out.println(username.get(1));
	}
	
	public static void password() throws IOException {
	    
		
		
		File f = new File("C:\\Users\\h\\eclipse-workspace\\Adactin\\data\\eclipse.excel.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowSize = sheetAt.getPhysicalNumberOfRows();
		for (int i= 0; i < rowSize; i++) {
			Row row = sheetAt.getRow(1);
			Cell cell = row.getCell(1);
			CellType typeOfCell = cell.getCellType();
			if(typeOfCell.equals(CellType.STRING)){
	String Str = cell.getStringCellValue();
	password.add(Str);

			} else if (typeOfCell.equals (CellType.NUMERIC)) {
				double val = cell.getNumericCellValue();
				System.out.println(val); 
					
				}
			}
			System.out.println(password.get(2));
		}

	public static void logIn() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/h/eclipse-workspace/Java 2.0/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("akshiakshi");
		driver.findElement(By.id("password")).sendKeys("18122000");
		driver.findElement(By.id("login")).click();
	}
	public static void main(String[] args) throws IOException {
		username();
		password();
		logIn();
		
	}
	
	
}

