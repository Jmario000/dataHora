package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d04 = LocalDate.parse("2024-07-14");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-14T10:15:45");
		Instant d06 = Instant.parse("2024-07-14T01:41:45Z");

		LocalDate pastWeek = d04.minusWeeks(1);
		LocalDate nextWeek = d04.plusWeeks(1);
		LocalDate nextYears = d04.plusYears(10);

		System.out.println("Past week: " + pastWeek);
		System.out.println("Next week: " + nextWeek);
		System.out.println("Next Years: " + nextYears);

		LocalDateTime nextHour = d05.plusHours(5);

		System.out.println("Next Hour: " + nextHour);

		Instant inst = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("Next week: " + inst);

		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(d05, nextHour);
		Duration t3 = Duration.between(d06, inst);

		System.out.println("duração t1: " + t1.toDays());
		System.out.println("duração t2: " + t2.toHours());
		System.out.println("duração t3: " + t3.toDays());
	}

}
