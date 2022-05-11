package com.opower.assesment.openaq.OpenAQAPI.services;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.opower.assesment.openaq.OpenAQAPI.clients.HMClients;
import com.opower.assesment.openaq.OpenAQAPI.constants.APIQueryParameter;
import com.opower.assesment.openaq.OpenAQAPI.dto.LocationsDTO;

@Service
public class HMService {
	
	@Value("${url.base.locations}")
	private String locationsBaseUrl;
	
	@Value("${url.base.measurements}")
	private String measurementsBaseUrl;
	
	
	
	@Autowired
	private HMClients hmClients;
	
	
	public String getHMLocations(String country, String parameter) throws MalformedURLException, URISyntaxException {
		
		URIBuilder b = new URIBuilder(locationsBaseUrl);
		b.addParameter(APIQueryParameter.COUNTRY.getValue(), country);
		b.addParameter(APIQueryParameter.PARAMETER.getValue(), parameter);
		URL url = b.build().toURL();
		LocationsDTO locationsAPIInfo = hmClients.doGetLocations(url.toString());
		
		
		
		return "";
	}


	
	public String getHMMeasurements(String country, String parameter, String coordinates, Integer radius) {
		
		return null;
	}
	
	

}
