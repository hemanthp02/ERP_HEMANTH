package nov16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fromat_cell {

	public static void main(String[] args) throws Throwable
	{
		
		FileInputStream fi = new FileInputStream("D:\\\\eclipes\\\\Externals files\\\\sample_lyst9730.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet sh = wb.getSheet("Emp");
		int lastrow = sh.getLastRowNum();
		System.out.println(lastrow);
		
		for(int i= 1;i<=lastrow;i++)
		{
			sh.getRow(i).createCell(4).setCellValue("pass");
			XSSFCellStyle style = wb.createCellStyle();
			XSSFFont font = wb.createFont();
			//gree
			font.setColor(IndexedColors.GREEN.getIndex());
			font.setBold(true);
			style.setFont(font);
			sh.getRow(i).getCell(4).setCellStyle(style);
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:\\\\\\\\eclipes\\\\\\\\Externals files\\\\\\\\sample.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		

	}

}
