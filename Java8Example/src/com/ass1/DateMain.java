package com.ass1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateMain {

	public static void main(String[] args) {
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date.minusDays(2));
	}

}
