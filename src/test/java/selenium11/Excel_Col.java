package selenium11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Col {

		public static void main(String[] args) throws IOException {
	        FileInputStream file = new FileInputStream("C:\\Users\\h\\eclipse-workspace\\Adactin\\data\\eclipse.excel.xlsx");
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheetAt(0);

	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }

	        workbook.close();
	        file.close();
	    }
	}
