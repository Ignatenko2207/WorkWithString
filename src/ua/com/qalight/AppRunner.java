package ua.com.qalight;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) throws UnsupportedEncodingException {

		// комментарий на русском
		
		String str = "My name 254833 is \"Alex\" and крякоЗябЛик other %1s symbols %2s %3d"
				+ "\\"
				+ "\t"
				+ "\n"
				+ "\r";
		byte[] bytes = str.getBytes();
		
		
//		String encStr = new String(bytes, "UTF-8");
		
		str = str + " Ignatenko";
		
		String formatedstr = str.format(str, "name", "lastName", 56);
		String editedStr = str.replaceAll("\"", "");
//		String editedStr = str.replaceAll("(.+\\d)(33)", "$1");
//		String editedStr = str.replaceAll("[a-zA-Z]", "");
				
		// My name is "Alex"
		
		logger.info(str);
		logger.info(formatedstr);
		
		/*
		 * 25899852
		 * 28582
		 * 258852
		 * 12345
		 * 259652 -> "259652" == "256952"
		 */
		
//		StringBuilder nameBuilder = new StringBuilder("Alex");
//			
//		nameBuilder = nameBuilder.reverse();
//		
//		StringBuffer nameBuffer = new StringBuffer("Alex");
//		
//		nameBuffer = nameBuffer.reverse();
//		
//		logger.info(nameBuilder.toString());
	}
}
