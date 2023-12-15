package nov16;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Conversion {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:\\eclipes\\Externals files\\sample_lyst9730.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Emp");
		int lastrow = sh.getLastRowNum();
		System.out.println(lastrow);
		
		for(int i=1;i<=lastrow;i++)
		{
			if(wb.getSheet("Emp").getRow(i).getCell(3).getCellType()==CellType.NUMERIC)
			{
				int celldata = (int) wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
				String eid = String.valueOf(celldata);
				System.out.println(eid);
				
				
				
			}
				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
