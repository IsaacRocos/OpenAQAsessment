package com.opower.assesment.openaq.OpenAQAPI.constants;

public enum APIQueryParameter {
	
	COUNTRY("country"), PARAMETER("parameter"), COORDINATES("coordinates"), RADIUS("radius");
	
	private String value;

	APIQueryParameter(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
