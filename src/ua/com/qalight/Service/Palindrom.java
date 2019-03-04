package ua.com.qalight.Service;


import java.util.logging.Logger;

public class Palindrom {
	
	public static Logger logger = Logger.getLogger(Palindrom.class.getName());

	public static void main(String[] args) {
		
        int maxPalindrom = getMaxPalindrom(1000, 9999);


        
            logger.info("Max value is " + maxPalindrom);
       

	}

	private static int getMaxPalindrom(int min, int max) {
        int result = 0;


        for (int i = max; i >= min; i--) {
            for (int j = max; j >= min; j--) {
                result = i*j;
                if ( IsPalindrom(result) ) {
                    return result;
                }
            }
        }




        return result;
    }


    private static boolean IsPalindrom(int result) {


        String intAsString = String.valueOf(result);


        StringBuilder strBuilder = new StringBuilder(intAsString);
        strBuilder.reverse();


        return intAsString.equals(strBuilder.toString());
    }

}