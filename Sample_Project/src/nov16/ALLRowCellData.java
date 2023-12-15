package nov16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ALLRowCellData 
{

	public static void main(String[] args)throws Throwable
	{
	
		FileInputStream fi = new FileInputStream("D:\\\\eclipes\\\\Externals files\\\\sample_lyst9730.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
	    XSSFSheet sh = wb.getSheet("Emp"); 
	    int lastrow = sh.getLastRowNum();
	    System.out.println("lastrow");
	
	for (int i = 1; i <=lastrow; i++) 
	{
		String fname = sh.getRow(i).getCell(0).getStringCellValue();
		String mname = sh.getRow(i).getCell(1).getStringCellValue();
		String lname = sh.getRow(i).getCell(2).getStringCellValue();
		int eid =  (int) sh.getRow(i).getCell(3).getNumericCellValue();
		System.out.println(fname+" "+mname+ "  " +lname+ " " +eid+" ");
		
	sh.getRow(i).createCell(4).setCellValue("pass");
		
		
	}
	fi.close();
	FileOutputStream out = new FileOutputStream("D:\\\\\\\\eclipes\\\\\\\\Externals files\\\\\\\\sample.xlsx");
	wb.write(out);
	out.close();
	wb.close();
	
		
		
		
		
		
	}
}
