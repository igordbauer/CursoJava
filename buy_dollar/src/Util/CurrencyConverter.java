package Util;

public class CurrencyConverter {

	public static double converter_dollar_to_real(double dollar, double real) {
		double amount = dollar*real;
		amount += dollar*real*0.06;
		return amount; 

	}

}
