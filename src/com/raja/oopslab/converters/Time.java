package com.raja.oopslab.converters;

public class Time {
	public static int convertHoursToMinutes(int hours) {
		return hours * 60;
	}

	public static int convertHoursToSeconds(int hours) {
		return hours * 60 * 60;
	}

	public static double convertMinutesToHours(int minutes) {
		return minutes / 60;
	}

	public static double convertSecondsToHours(int seconds) {
		return seconds / 60 / 60;
	}
}
