package package3_exercise.part1_text_file;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date getDateFromString(String string) {
		try {
			Date date = sdf.parse(string);
			return date;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static String getStringFromDate(Date date) {
		return sdf.format(date);
	}
}
