package utilities;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class getSheetName {
	
	public String dayName() {
	String dayNames[] = new DateFormatSymbols().getWeekdays();
	Calendar date = Calendar.getInstance();
	String name = dayNames[date.get(Calendar.DAY_OF_WEEK)];
	return name;
	
	}
	
}
