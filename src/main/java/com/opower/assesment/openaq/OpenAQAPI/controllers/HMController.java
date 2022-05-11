package com.opower.assesment.openaq.OpenAQAPI.controllers;


import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opower.assesment.openaq.OpenAQAPI.services.HMService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/hm")
@Api(value = "Heat Map API", description = "API to obtain heatmap data")
public class HMController {
	
	private static Logger logger = LogManager.getLogger(HMController.class);
	
	@Autowired
	HMService hmService;
	
	@GetMapping("/measurements")
	public String measurements(@RequestParam("parameter") String parameter, @RequestParam("coordinates") String coordinates,
			@RequestParam("radius") Integer radius, @RequestParam("country") String country) {
		logger.debug("{} {} {} {}", country, parameter, coordinates, radius);
		return hmService.getHMMeasurements(country, parameter, coordinates, radius);
	}
	
	
	@GetMapping("/locations")
	public String locations(@RequestParam("country") String country, @RequestParam("parameter") String parameter) throws MalformedURLException, URISyntaxException {
		logger.debug("{} {}", country, parameter);
		return hmService.getHMLocations(country , parameter);
	}
	
	
}
