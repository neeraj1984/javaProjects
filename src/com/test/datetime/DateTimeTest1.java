package com.test.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest1 {
	
	public static void main(String args[])
	{
		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);
		
		
		LocalDate date1 = LocalDate.of(2017, 07, 17);
		if(date1.equals(today)){
		    System.out.printf("Today %s and date1 %s are same date %n", today, date1);
		}
		
		LocalTime time = LocalTime.now();
		System.out.println("local time now : " + time);
		
		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock);
		
		Instant timestamp = Instant.now();
		System.out.println("What is value of this instant " + timestamp);
		
		String dayAfterTommorrow = "20140116";
		LocalDate formatted = LocalDate.parse(dayAfterTommorrow,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("Date generated from String %s is %s %n",dayAfterTommorrow, formatted);

	}

}
