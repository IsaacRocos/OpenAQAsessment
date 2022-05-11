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
import com.opower.assesment.openaq.OpenAQAPI.schemas.MeasurementsHeatmap;
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
	
	@Test
	void testGetHMMeasurements() throws MalformedURLException, URISyntaxException {
		
		//Correct call
		MeasurementsHeatmap mhm = hmService.getHMMeasurements("MX", AirQualityParameter.PM25.getName(), "19.4858249,-99.1995944", 10000 );
		assertNotEquals(0, mhm.getMeta().getFound());
		
		// Incorrect call
		mhm = hmService.getHMMeasurements("WW", AirQualityParameter.PM25.getName(), "19.4858249,-99.1995944", 1000 );
		assertEquals(0, mhm.getMeta().getFound());
	}
	
}
