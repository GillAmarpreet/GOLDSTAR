package utils;

public class WaitUtil {
	
	public static void waitHere(long millis) {
		try {
			Thread.sleep(millis);
		} catch(Exception e) {
			// do nothing
		}
	}

}
