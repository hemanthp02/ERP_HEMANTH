package nov16;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row_CountAnd_Cell {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fi = new FileInputStream("D:/eclipes/Externals files/sample_lyst9730.xlsx/");
		 Workbook wb = new XSSFWorkbook(fi);
     	 Sheet sh = wb.getSheet("Emp");
     	 Row row = sh.getRow(0);
     	 int rc = sh.getLastRowNum();
     	 
     	 int cc = row.getLastCellNum();
     	 System.out.println(+rc+" "+cc+ " ");
     	 
		
	}

}
