package ua.com.qalight;

import java.util.*;
import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {

		List<String> listString = new ArrayList<>();
		listString.add("Alex");
		listString.add("Olga");
		listString.add("Milena");
		listString.add("Anastasia");
//		listString.add("Milena");
//		listString.add("Anastasia");
//		logger.info("List size is " + listString.size());
//		
//		Set<String> setString = new HashSet<>(listString);
//		logger.info("Set size is " + setString.size());
//		
//		Queue<String> queueString = new PriorityQueue<>(listString);
//		logger.info("Queue size is " + queueString.size());
//		
//		String firstString = queueString.peek();
//		logger.info("Queue size is " + queueString.size() + " First is " + firstString);
//		
//		firstString = queueString.poll();
//		logger.info("Queue size is " + queueString.size() + " First is " + firstString);
//		
//		firstString = queueString.peek();
//		logger.info("Queue size is " + queueString.size() + " First is " + firstString);
		
//		Map<Integer, String> mapString = new HashMap<>();
//		
//		int i = 0;
//		for( ; i < listString.size(); ) {
//			mapString.put(i, listString.get(i));
//			i++;
//		}
//		logger.info("Map size is " + mapString.size());
//		
//		logger.info("First is " + mapString.get(0));
//		
//		mapString.put(0, "Super Alex");
//		
//		logger.info("First is " + mapString.get(0));
//
//		mapString.put(null, "Super-puper Alex");
//		
//		logger.info("Null is " + mapString.get(null));

		for (int i = 0; i < listString.size(); i++) {
			logger.info(listString.get(i));
			if(i < listString.size()-1) {
				logger.info("Next index will be " + (i+1));
			}
		}
		logger.info("--- // ---");
		
		for (String element : listString) {
			logger.info(element);
		}
		logger.info("--- // ---");
		
		boolean condition = true;
		while (condition) {
			logger.info("Never is called!");
			
			condition = false;
		}
		
		boolean isNotLogined = true;
		
		do {
			// service to login
			// if-statement to change condition
			isNotLogined = false;
		} while (isNotLogined);
		
		
	}
}
