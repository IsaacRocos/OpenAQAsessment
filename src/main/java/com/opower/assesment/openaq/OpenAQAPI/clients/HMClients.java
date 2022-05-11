package com.opower.assesment.openaq.OpenAQAPI.clients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.opower.assesment.openaq.OpenAQAPI.dto.LocationsDTO;
import com.opower.assesment.openaq.OpenAQAPI.dto.MeasurementsDTO;
import com.opower.assesment.openaq.OpenAQAPI.schemas.Location;

@Component
public class HMClients {
	
	/**
	 * 
	 * @param url
	 * @return
	 */
	public LocationsDTO doGetLocations(String url) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<LocationsDTO> response =  template.getForEntity(url, LocationsDTO.class);
		return response.getBody();
	}
	
	/**
	 * 
	 * @param url
	 * @return
	 */
	public MeasurementsDTO doGetMeasurements(String url) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<MeasurementsDTO> response =  template.getForEntity(url, MeasurementsDTO.class);
		return response.getBody();
	}
	

}
