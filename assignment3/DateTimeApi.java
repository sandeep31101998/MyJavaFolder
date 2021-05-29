package com.technoelevate.assignment3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	public static void main(String[] args) {

		/*
		 * 1 Working With LocalDate The LocalDate represents a date in ISO format
		 * (yyyy-MM-dd) without time. We can use it to store dates like birthdays and
		 * paydays. An instance of current date can be created from the system clock:
		 */

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); // 2021-05-29
		System.out.println(LocalDate.of(2015, 02, 20)); // 2015-02-20
		System.out.println(LocalDate.parse("2015-02-20")); // 2015-02-20

		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow); // 2021-05-30

		DayOfWeek saturday = LocalDate.parse("2021-05-29").getDayOfWeek();
		System.out.println(saturday); // SATURDAY

		int twentyNine = LocalDate.parse("2021-05-29").getDayOfMonth();
		System.out.println(twentyNine); // 29

		// To check leapyear
		boolean leapYear = LocalDate.now().isLeapYear();
		leapYear = LocalDate.parse("2020-05-29").isLeapYear();
		System.out.println(leapYear); // true

		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(notBefore); // false

		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
		System.out.println(isAfter); // true

		/*
		 * Working With LocalTime The LocalTime represents time without a date. Similar
		 * to LocalDate, we can create an instance of LocalTime from the system clock or
		 * by using parse and of methods. We'll now take a quick look at some of the
		 * commonly used APIs. An instance of current LocalTime can be created from the
		 * system clock
		 */

		LocalTime now = LocalTime.now();
		System.out.println(now); // 19:51:55.842065300

		LocalTime sixThirty = LocalTime.of(6, 30);
		System.out.println(sixThirty); // 06:30

		LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
		System.out.println(sevenThirty); // 07:30

		int six = LocalTime.parse("06:30").getHour();
		System.out.println(six); // 6

		boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		System.out.println(isbefore); // true

		/*
		 * LocalDateTime is used to represent a combination of date and time. This is
		 * the most commonly used class when we need a combination of date and time. The
		 * class offers a variety of APIs. Here, we'll look at some of the most commonly
		 * used ones. An instance of LocalDateTime can be obtained from the system clock
		 * similar to LocalDate and LocalTime:
		 */

		System.out.println(LocalDateTime.now()); // 2021-05-29T19:57:54.921630900
		System.out.println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30)); // 2015-02-20T06:30
		System.out.println(LocalDateTime.parse("2015-02-20T06:30:00")); // 2015-02-20T06:30

		/* Date and Time Formatting */
		
		LocalDateTime localDateTime = LocalDateTime.of(2021, Month.MAY, 29, 8, 30);
		System.out.println(localDateTime);								//2021-05-29T08:30
		
		String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(localDateString);                           //2021-05-29
		//localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}

}
