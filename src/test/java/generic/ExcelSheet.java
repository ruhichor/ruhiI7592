package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import com.mysql.cj.result.Row;

public class ExcelSheet implements AutoConstant {
	public static String readDataFromexcel() throws IOException {
		//Path of the excel file
		FileInputStream fs = new FileInputStream("D:\\AURO1\\AuroProject\\ExcelSheet\\Excel.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String value=null;
		int rowCount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			 XSSFCell cell = row.getCell(0);
			value = cell.getStringCellValue();
			//sheet.getRow(0).getCell(0)
			
		}
		return value;
		
		}
	}



