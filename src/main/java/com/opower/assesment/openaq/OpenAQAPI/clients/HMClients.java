package com.opower.assesment.openaq.OpenAQAPI.clients;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HMClients {
	
	
	public String doGet(String url) {
		RestTemplate template = new RestTemplate();
		String result = template.getForObject(url, String.class);
		return result;
	}
	
	

}
