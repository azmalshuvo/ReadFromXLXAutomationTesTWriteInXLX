package base;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebElement;

import testcase.SearchBoxTest;
import testcase.StringComparison;
import utilities.ReadXLXdata;
import utilities.WriteIntoExelFile;
import utilities.getSheetName;


public class Main {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		getSheetName gsn = new getSheetName();
		String nm = gsn.dayName();
		ReadXLXdata red = new ReadXLXdata();
		SearchBoxTest sbt = new SearchBoxTest();
		StringComparison scmp = new StringComparison();
		WriteIntoExelFile wief = new WriteIntoExelFile();
		
		
		for (int i=2; i<12; i++) {
		
		String s[] = new String [2];	
			
		String cd = red.getData(nm, i);
		List<WebElement> list = sbt.searchTest(cd);
		s = scmp.stringCmp(list);
		wief.writedata(nm, s, i);	
		/*list = null;
		cd = null;*/
		}		
		
	}

}
