package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainDataHora {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		// Data-hora no instante atual
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		LocalDate d04 = LocalDate.parse("2024-07-13");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-13T18:45:01");
		Instant d06 = Instant.parse("2024-07-13T10:07:20Z");
		Instant d07 = Instant.parse("2024-07-13T10:07:20-03:00");
		LocalDate d08 = LocalDate.parse("13/07/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("13/07/2024 10:30:20", fmt2);
		LocalDate d10 = LocalDate.of(2024, 7, 13);
		LocalDateTime d11 = LocalDateTime.of(2024, 7, 13, 10, 38);

		// o java implicitamente coloca o .toString() já convertendo para o padrao ISO
		// 8601
		System.out.println("LocalDate: " + d01);
		System.out.println("LocalDateTime: " + d02);
		System.out.println("Instant: " + d03);
		System.out.println("ISO 8601 -> LocalDate: " + d04);
		System.out.println("ISO 8601 -> LocalDateTime: " + d05);
		System.out.println("ISO 8601 -> Instant: " + d06);
		System.out.println("ISO 8601 -> Instant -03:00: " + d07);
		System.out.println("Formato customizado: " + d08.format(fmt1));
		System.out.println("Formato customizado hora: " + d09.format(fmt2));
		System.out.println("Ano, mes, dia isoladamente: " + d10);
		System.out.println("Ano, mes, dia, hora, min isoladamente: " + d11);

	}

}
