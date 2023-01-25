package testcase;

import java.util.List;

import org.openqa.selenium.WebElement;

public class StringComparison {
	
	public String[] stringCmp (List <WebElement> l) {

		
		String longest = "";		
		for (int k=0; k<l.size(); k++) {			
			String listitem = l.get(k).getText();
			
			if (listitem.length()>longest.length()) {
				longest = listitem;
			}
			
		}
		String shortest = longest;
		for (int m=0; m<l.size(); m++) {			
			String listitem = l.get(m).getText();
			
			if (listitem.length()<shortest.length()) {
				shortest = listitem;
			}
			
		}
		
		String ss[] = new String[2];
		ss[0] = longest;
		ss[1] = shortest;

		return ss;
	}

}
