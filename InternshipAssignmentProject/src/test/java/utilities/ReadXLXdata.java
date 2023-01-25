package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLXdata {
	
		
	public String getData(String sheetName, int j) throws IOException {
		String exelFilePath = ".\\src\\test\\resources\\testdata\\testdata.xlsx";
		FileInputStream inputstream = new FileInputStream(exelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		
		XSSFRow rowData = sheet.getRow(j);		
		XSSFCell cellData = rowData.getCell(2);
		String value = cellData.toString().trim();
		return value;
	
		
	}

}
