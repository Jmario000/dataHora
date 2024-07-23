package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d04 = LocalDate.parse("2024-07-14");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-14T10:15:45");
		Instant d06 = Instant.parse("2024-07-14T01:41:45Z");

		/*
		 * for(String x : ZoneId.getAvailableZoneIds()) { System.out.println(x); }
		 */

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("d06 -> Local: " + r1);
		System.out.println("zulu -> Portugal: " + r2);
		System.out.println("d06 -> Local: " + r3);
		System.out.println("zulu -> Portugal: " + r4);
		System.out.println("getDay of d04: " + d04.getDayOfMonth());
		System.out.println("getMonth of d04: " + d04.getMonthValue());
		System.out.println("getYear of d04: " + d04.getYear());
		System.out.println("getHour of d05: " + d05.getHour());
		System.out.println("getMinute of d05: " + d05.getMinute());
		System.out.println("getSecond of d05: " + d05.getSecond());
	}

}
