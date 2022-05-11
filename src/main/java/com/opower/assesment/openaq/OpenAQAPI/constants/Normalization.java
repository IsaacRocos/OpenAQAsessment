package com.opower.assesment.openaq.OpenAQAPI.constants;

public enum Normalization {
	
	MAX_VAL(255) , MIN_VAL(0);
	
	double val;
	
	private Normalization(double val){
		this.val = val; 
	}

}
