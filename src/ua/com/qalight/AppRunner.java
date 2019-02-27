package ua.com.qalight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {

		List<String> listString = new ArrayList<String>();
		
		listString.add("Alex");
		listString.add("Boby");
		listString.add("Serg");
		listString.add("Sasha");
		
/*		logger.info("List size is  "+ listString.size());
		
		Set<String> setString = new HashSet<>(listString);
		
		logger.info("Set size is  "+ setString.size());
		
		Queue<String> queueString = new PriorityQueue<>();
		
		logger.info("queue size is  "+ queueString.size());
		
		String firstString = queueString.peek();
		
		logger.info("Queue size is  "+ queueString.size() + "first is " + firstString);
		
		firstString = queueString.poll();
		
		logger.info("Queue size is  "+ queueString.size() + "first is " + firstString);
		
		firstString = queueString.peek();
		
		logger.info("Queue size is  "+ queueString.size() + "first is " + firstString);*/
		
//		Map<Integer, String> mapString = new HashMap<>();
//		
//		int i = 0;
//		for(; i < listString.size(); ) {
//			mapString.put(i, listString.get(i));
//			i++;
//		}
//		logger.info("Map size is  " + mapString.size());
//		
//		logger.info("First is  " + mapString.get(0));
//		
//		mapString.put(0, "Super Alex");
//		logger.info("First is  " + mapString.get(0));
//		
//		mapString.put(null, "Super puper Alex");
//		logger.info("Second is  " + mapString.get(null));
//		
//		Integer nullobj = null;
//		logger.info(String.valueOf(nullobj));
		
		for (int i = 0; i < listString.size(); i++) {
			
			logger.info(listString.get(i));
			
			if (i < listString.size()-1) {
				logger.info(" Next index will be " + (i+1));
			}
			
		}
		logger.info("---//---");
		
		for (String element  : listString) {
			logger.info(element);
			
		}
		
		logger.info("---///---");
		
		boolean condition = true;
		while (condition) {
			logger.info("Never is called! ");
			if (condition) {
				break;
			}
		}
		condition = false;
		}
	
	boolean isNotLoggined = true;
	do {
		// service to login
		// if-statement to change condition
		isNotLoggined = false;
	}
	}

	

	
	
	

