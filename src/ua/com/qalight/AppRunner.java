package ua.com.qalight;

import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {

		// комментарий на русском
		
		String name = "Alex";
		
		name = name + " Ignatenko";
		
		logger.info(name);
		
		/*
		 * 25899852
		 * 28582
		 * 258852
		 * 12345
		 * 259652 -> "259652" == "256952"
		 */
		
		StringBuilder nameBuilder = new StringBuilder("Alex");
			
		nameBuilder = nameBuilder.reverse();
		
		StringBuffer nameBuffer = new StringBuffer("Alex");
		
		nameBuffer = nameBuffer.reverse();
		
		logger.info(nameBuilder.toString());
	}
}
