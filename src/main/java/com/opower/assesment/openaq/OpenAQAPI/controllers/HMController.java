package com.opower.assesment.openaq.OpenAQAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opower.assesment.openaq.OpenAQAPI.services.HMService;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/hm")
@Api(value = "Heat Map API", description = "API to obtain heatmap data")
public class HMController {

	@Autowired
	HMService hmService;
	
	@GetMapping("/measurements")
	public void measurements() {
		
	}
	
	
	@GetMapping("/locations")
	public String locations() {
		return hmService.getHMLocations();
	}
	
	
}
