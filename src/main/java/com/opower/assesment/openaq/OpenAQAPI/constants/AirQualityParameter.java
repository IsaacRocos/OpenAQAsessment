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

}
