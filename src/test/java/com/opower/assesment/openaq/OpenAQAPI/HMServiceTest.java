package com.opower.assesment.openaq.OpenAQAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.opower.assesment.openaq.OpenAQAPI.constants.AirQualityParameter;
import com.opower.assesment.openaq.OpenAQAPI.schemas.LocationsHeatMap;
import com.opower.assesment.openaq.OpenAQAPI.services.HMService;

@SpringBootTest
public class HMServiceTest {
	
	@Autowired
	HMService hmService; 
	
	@Test
	void testGetHMLocations() throws MalformedURLException, URISyntaxException {
		//Correct call
		LocationsHeatMap lhm = hmService.getHMLocations("MX", AirQualityParameter.PM25.getName());
		assertNotEquals(0, lhm.getMeta().getFound());
		// Incorrect call
		lhm = hmService.getHMLocations("WW", AirQualityParameter.PM25.getName());
		assertEquals(0, lhm.getMeta().getFound());
	}
	
	

}
