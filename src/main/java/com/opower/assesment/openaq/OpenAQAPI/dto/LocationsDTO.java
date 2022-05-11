package com.opower.assesment.openaq.OpenAQAPI.dto;

import java.util.List;

import com.opower.assesment.openaq.OpenAQAPI.schemas.Location;
import com.opower.assesment.openaq.OpenAQAPI.schemas.Meta;

public class LocationsDTO {
	
	private Meta meta;
	private List<Location> results;

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Location> getResults() {
		return results;
	}

	public void setResults(List<Location> results) {
		this.results = results;
	}
	

}
