package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_review {

	public static void main(String[] args) throws ParseException {
		
		// é necessario adicionar o parse exception
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("10/06/2021");
		
		Date y2 = sdf2.parse("10/06/2021 00:12:30");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 =  new Date(0L);
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(x3);
		
	}

}
