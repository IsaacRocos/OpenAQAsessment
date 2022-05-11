package com.opower.assesment.openaq.OpenAQAPI.constants;

public enum AirQualityParameter {

	PM10(275, "pm10"), PM25(110, "pm25"), CO(12163.0422643604, "co"), NO2(1180.7619365949, "no2"), SO2(0.22, "so2"),
	BC(3.0, "bc"), O3(0.165, "o3");

	private double maxValue;
	private String name;

	AirQualityParameter(double maxValue, String name) {
		this.maxValue = maxValue;
		this.name = name;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public String getName() {
		return name;
	}
	
	public static AirQualityParameter getEnumParameter(String name) {
		
		if(name.equals(PM10.getName())) {
			return PM10;
		} else if(name.equals(PM25.getName())) {
			return PM25;
		}else if(name.equals(CO.getName())) {
			return CO;
		}else if(name.equals(NO2.getName())) {
			return NO2;
		}else if(name.equals(SO2.getName())) {
			return SO2;
		}else if(name.equals(BC.getName())) {
			return BC;
		}else if(name.equals(O3.getName())) {
			return O3;
		}
		
		return null;
	}

}
