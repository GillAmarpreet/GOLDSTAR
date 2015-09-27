package utils;

import java.util.Random;

public class RandomUtil {
	
	
	public static String getRandomString(int len){
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) {
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		}
		return sb.toString();
	}
	
	public static String getRandomAlphaNumericString(int len){
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) {
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		}
		return sb.toString();
	}
	
	public static String getRandomNumericString(int len){
		String AB = "0123456789";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) {
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		}
		return sb.toString();
	}
	
	
	
	

}
