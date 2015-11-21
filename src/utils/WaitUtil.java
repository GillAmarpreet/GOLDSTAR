package utils;

public class WaitUtil {
	
	public static void waitHere(long millis) {
		try {
			Thread.sleep(millis);
		} catch(Exception e) {
			// do nothing
		}
	}
	
	public static void waitFiveSeconds() {
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			// do nothing
		}
	}

}
