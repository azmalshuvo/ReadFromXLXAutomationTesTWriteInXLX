package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExelFile {
	
	public void writedata(String snm, String sss[], int n) throws IOException {
		String exelFileP = ".\\src\\test\\resources\\testdata\\testdata.xlsx";
		FileInputStream inputstream = new FileInputStream(exelFileP);

		XSSFWorkbook workbk = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbk.getSheet(snm);
		
		Row rw = sheet.getRow(n);
		Cell cl = rw.createCell(3);
		cl.setCellValue(sss[0]);
		Cell cl2 = rw.createCell(4);
		cl2.setCellValue(sss[1]);
		inputstream.close();
		FileOutputStream outputstream = new FileOutputStream(exelFileP);
		workbk.write(outputstream);
		outputstream.close();

	}

}
