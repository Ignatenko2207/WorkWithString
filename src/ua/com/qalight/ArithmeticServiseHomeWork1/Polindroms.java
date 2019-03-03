package ua.com.qalight.ArithmeticServiseHomeWork1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import javafx.print.Collation;
import ua.com.qalight.AppRunner;

public class Polindroms {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		
		int min = 1000;
		int max = 9999;
		
		logger.info("The sum by numbers of is " + getMaxPolindromInRange(min, max));

	}

	private static int getMaxPolindromInRange(int min, int max) {
		
		
		Set<Integer> polindroms = new HashSet<>();
		String polindromsAsString = String.valueOf(polindroms);
		StringBuffer polindromsBuffer = new StringBuffer(polindromsAsString);
		polindromsBuffer = polindromsBuffer.reverse();
		
		
		for (int i = min; i <= max; i++) {
			for (int j = min; j <= max; j++) {
				int tempResult = i*j;
				if (isPolindroms(tempResult)) {
					polindroms.add(tempResult);
				}
				
			}
			
		}
		
		return Collections.max(polindroms);
	}

	private static boolean isPolindroms(int tempResult) {
	
		if (po) {
			
		}
		
		return false;
	}

}
