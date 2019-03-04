package ua.com.qalight.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ArifmeticService {
	
	public static Logger logger = Logger.getLogger(ArifmeticService.class.getName());

	public static void main(String[] args) {
				
		int number = 347267;
		
		logger.info("The sum by div of " + number + " equals " + getSumByDivision(number));
		logger.info("The sum by symbols of " + number + " equals " + getSumBySymbolsSplit(number));
		
		int min = 15;
		int max = 267;
		logger.info("The sum by numbers of " + getMaxMultiplyPairInRange(min, max));
		
		
	}

	private static int getMaxMultiplyPairInRange(int min, int max) {
		int result = 0;
		
		Set<Integer> multipliers = new HashSet<>();
		for (int i = min; i <= max; i++) {
			for (int j = min; j <= max ; j++) {
				int tempResult = i*j;
			if(tempResult %2 == 0)	{
				multipliers.add(tempResult);
			}
			}
		}
		
		return Collections.max(multipliers);
	}

	private static int getSumBySymbolsSplit(int number) {
		String numberAsString = String.valueOf(number); // "347267"
		char[] symbols = numberAsString.toCharArray();  // {'3','4',...,'7'}
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
