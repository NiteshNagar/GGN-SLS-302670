package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class stgNiit {

public static void main(String[] args) throws IOException {
	
	
	FileInputStream fio  = new FileInputStream("D:\\see.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fio);
	XSSFSheet sh1 = wb.getSheet("stagging");
	
	
	System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
	
	
	wb.close();
}	


}
