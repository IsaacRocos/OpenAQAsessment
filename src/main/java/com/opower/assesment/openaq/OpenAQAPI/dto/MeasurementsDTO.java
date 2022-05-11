package com.opower.assesment.openaq.OpenAQAPI.dto;

import java.util.List;

import com.opower.assesment.openaq.OpenAQAPI.schemas.Measurement;
import com.opower.assesment.openaq.OpenAQAPI.schemas.Meta;

public class MeasurementsDTO {

	private Meta meta;
	private List<Measurement> results;

	
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Measurement> getResults() {
		return results;
	}

	public void setResults(List<Measurement> results) {
		this.results = results;
	}
	
	
	
}
