package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[] data=new String[3];
	
	
	public static void readData(int n) throws IOException {
		
		FileInputStream file=new FileInputStream("Input.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(n);
		for(int i=0;i<3;i++)
		{
			XSSFCell cell=row.getCell(i);
			DataFormatter formatter = new DataFormatter();
			data[i] = formatter.formatCellValue(cell);
			
		}
		
		//workbook close
		workbook.close();
		
		
	}

}
