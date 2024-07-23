package data_hora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MainDataHora2 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		LocalDate d04 = LocalDate.parse("2024-07-14");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-14T10:15:45");
		Instant d06 = Instant.parse("2024-07-14T01:41:45Z");

		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("d05: " + d05.format(fmt2));
		System.out.println("d05: " + d05.format(fmt4));
		System.out.println("d06: " + fmt3.format(d06));
		System.out.println("d06: " + fmt5.format(d06));
	}

}
