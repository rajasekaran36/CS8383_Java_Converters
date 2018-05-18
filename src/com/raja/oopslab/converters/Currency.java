package com.raja.oopslab.converters;

public class Currency {

	public static double covertEUROtoINR(double EURO) {
		return EURO * 80;
	}

	public static double convertDOLLARtoINR(double DOLLAR) {
		return DOLLAR * 66.89;
	}

	public static double convertYENtoINR(double YEN) {
		return YEN * 0.61;
	}

	public static double covertINRtoEURO(double INR) {
		return INR * 0.013;
	}

	public static double convertINRtoDOLLAR(double DOLLAR) {
		return DOLLAR * 0.015;
	}

	public static double convertINRtoYEN(double YEN) {
		return YEN * 1.63;
	}
}
