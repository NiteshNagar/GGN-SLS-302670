package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d:\\selenium1.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheet("Sheet2");

		
		System.out.println(sheet.getLastRowNum()+1);
		System.out.println(sheet.getRow(0).getLastCellNum()+1);
		
			
		System.out.println("sheet name is "+sheet.getSheetName());
		
		
		/*	System.out.println("sheet1 name is "+sheet.getSheetName());
		System.out.println(sheet.getLastRowNum()+1);
		System.out.println(sheet.getLastRowNum()+1);
		System.out.println(sheet.getLastRowNum()+1);
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	     System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
*/
}

}