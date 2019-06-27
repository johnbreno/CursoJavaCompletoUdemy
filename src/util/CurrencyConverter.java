package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double conversor(double cuotation, double dollars) {
		return (cuotation * dollars * (1 + IOF));
	}
	
}
