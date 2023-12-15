package nov16;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class alterantive_method_for_readingcells{

	public static void main(String[] args) throws Throwable{
		
	
	FileInputStream fi = new FileInputStream("D:\\\\eclipes\\\\Externals files\\\\sample_lyst9730.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheet("Emp");
	int lastrow = sh.getLastRowNum();
	System.out.println(lastrow);
	String fname = sh.getRow(16).getCell(3).getStringCellValue();
	System.out.println(fname);
	
	
	
	
	
	
	
	}
}
