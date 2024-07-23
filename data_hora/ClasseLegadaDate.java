package data_hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ClasseLegadaDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date dt1 = sdf1.parse("20/07/2024");
		Date dt2 = sdf2.parse("17/07/2024 09:24:25");
		Date hoje = new Date();
		Date hoje2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		Date y1 = Date.from(Instant.parse("2024-07-17T09:40:40Z"));

		System.out.println("-------------------------");
		System.out.println("dt1:  " + sdf2.format(dt1));
		System.out.println("dt2: " + sdf2.format(dt2));
		System.out.println("Hoje: " + sdf2.format(hoje));
		System.out.println("Hoje2: " + sdf2.format(hoje2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("-------------------------");
		System.out.println("dt1:  " + sdf3.format(dt1));
		System.out.println("dt2: " + sdf3.format(dt2));
		System.out.println("Hoje: " + sdf3.format(hoje));
		System.out.println("Hoje2: " + sdf3.format(hoje2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
	}

}
