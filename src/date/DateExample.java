package date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {
	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy�� MM�� dd�� hh�� mm�� 55��");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}
}
