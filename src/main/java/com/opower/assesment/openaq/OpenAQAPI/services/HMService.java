package com.opower.assesment.openaq.OpenAQAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opower.assesment.openaq.OpenAQAPI.clients.HMClients;

@Service
public class HMService {
	
	@Autowired
	private HMClients hmClients;
	
	
	public String getHMLocations() {
		return hmClients.doGet("https://u50g7n0cbj.execute-api.us-east-1.amazonaws.com/v2/locations?country=MX&parameter=pm25");
	}
	
	

}
