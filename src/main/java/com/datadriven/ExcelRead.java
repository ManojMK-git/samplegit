package com.datadriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
public static void main(String[] args) throws IOException {
	
	String filelocation = "C:\\Users\\h\\eclipse-workspace\\Adactin\\data\\eclipse.excel.xlsx";	
	XSSFWorkbook wb = new XSSFWorkbook(filelocation);
	XSSFSheet sheetAt = wb.getSheetAt(0);
	for (int i = 1; i <= 2; i++) {
		XSSFRow row = sheetAt.getRow(i);
		for (int j = 0; j < 2; j++) {
			XSSFCell cell = row.getCell(j);
			String StringCellValue = cell.getStringCellValue();
			System.out.println(StringCellValue);
		} 
	}
}
}	
	
	
	
	
	
	
	
	
	
	


