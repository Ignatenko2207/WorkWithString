package ua.com.qalight.ArithmeticServiseHomeWork;

import java.util.logging.Logger;

import ua.com.qalight.AppRunner;

public class AppRunnerServices {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		
		int number = 345238;
		logger.info("The sum by div of " + number + "equals " + getSumByDivision(number));
		logger.info("The sum by symbols of " + number + "equals " + getSumBySymbols(number));

	}

	private static int getSumBySymbols(int number) {
		
		String numberAsString = String.valueOf(number);
		char[] symbols = numberAsString.toCharArray();
		int result = 0;
		for (char symbol : symbols) {
			result += Character.getNumericValue(symbol);
		}
		
		return result;
	}

	private static int getSumByDivision(int number) {

		int result = 0;
		while (number != 0) {
			result += number % 10;
			number /= 10;
			
		}
		return result;
	}

}
