package com.opower.assesment.openaq.OpenAQAPI.util;

public class Util {
	
	
	/**
	 * 
	 * @param newMax
	 * @param currentValue
	 * @param min
	 * @param max
	 * @return
	 */
	public static int normalize(int newMax , double currentValue, double min, double max) {
		return (int) (newMax - ((currentValue - min) / (max - min)));
	}
	
	

}
