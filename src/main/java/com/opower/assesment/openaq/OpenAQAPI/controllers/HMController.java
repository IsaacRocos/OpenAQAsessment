package com.opower.assesment.openaq.OpenAQAPI.controllers;

import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opower.assesment.openaq.OpenAQAPI.schemas.LocationsHeatMap;
import com.opower.assesment.openaq.OpenAQAPI.schemas.MeasurementsHeatmap;
import com.opower.assesment.openaq.OpenAQAPI.services.HMService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/hm")
@Validated
@Api(value = "Heat Map API", description = "API to obtain heatmap data")
public class HMController {

	private static Logger logger = LogManager.getLogger(HMController.class);

	@Autowired
	HMService hmService;

	@GetMapping("/locations")
	public LocationsHeatMap locations(
			@RequestParam("country") @Valid @Pattern(regexp = "[a-zA-Z][a-zA-Z]") String country,
			@RequestParam("parameter") @Valid @Pattern(regexp = "[a-zA-Z]([a-zA-Z])?([0-9]([0-9])?)?") String parameter)
			throws MalformedURLException, URISyntaxException {
		logger.debug("{} {}", country, parameter);
		return hmService.getHMLocations(country, parameter);
	}

	@GetMapping("/measurements")
	public MeasurementsHeatmap measurements(
			@RequestParam("parameter") @Valid @Pattern(regexp = "[a-zA-Z]([a-zA-Z])?([0-9]([0-9])?)?") String parameter,
			@RequestParam("coordinates") @Valid @Pattern(regexp = "^-?\\d{1,2}\\.?\\d{0,8},-?1?\\d{1,2}\\.?\\d{0,8}$") String coordinates,
			@RequestParam("radius") @Valid @Min(1) @Max(100000) Integer radius,
			@RequestParam("country") @Valid @Pattern(regexp = "[a-zA-Z][a-zA-Z]") String country)
			throws MalformedURLException, URISyntaxException {
		logger.debug("{} {} {} {}", country, parameter, coordinates, radius);
		return hmService.getHMMeasurements(country, parameter, coordinates, radius);
	}

}
