package nov16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_celldata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fi = new FileInputStream("D:\\eclipes\\Externals files\\sample_lyst9730.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);	
		XSSFSheet ws = wb.getSheetAt(0);
		int lastrow = ws.getLastRowNum();
		System.out.println(lastrow);
		XSSFRow row = ws.getRow(9);
		XSSFCell c1 = row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		XSSFCell c3 = row.getCell(2);
		XSSFCell c4 = row.getCell(3);
		
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3.getStringCellValue();
		int eid = (int) c4.getNumericCellValue();
		
		System.out.println(fname+ " " + mname +"" +lname + " " +eid+ " ");
		
		fi.close();
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
