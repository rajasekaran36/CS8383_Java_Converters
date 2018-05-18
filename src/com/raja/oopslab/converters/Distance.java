package com.raja.oopslab.converters;

public class Distance {
	public static double convertMeterToKiloMeter(double meter) {
		return meter / 1000;
	}

	public static double convertMilesToKiloMeter(double miles) {
		return miles * 1.60934;
	}

	public static double convertKiloMetertoMeter(double kilometer) {
		return kilometer * 1000;
	}

	public static double convertKiloMeterToMiles(double kilometer) {
		return kilometer / 1.60934;
	}
}
