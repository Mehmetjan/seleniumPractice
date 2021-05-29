package readFile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellBase;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Mehme\\Downloads\\apache\\testData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet0 = wb.getSheetAt(0);
		int rownum = sheet0.getLastRowNum();
		System.out.println(rownum);
		
		for(int i=0;i<=rownum;i++) {
			
			String data = sheet0.getRow(i).getCell(0).getStringCellValue();
			 Cell ages = sheet0.getRow(i).getCell(1);
			 System.out.println(data+" "+ages);
		}
		
		

	}

}
