package com.opower.assesment.openaq.OpenAQAPI.services;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.opower.assesment.openaq.OpenAQAPI.clients.HMClients;
import com.opower.assesment.openaq.OpenAQAPI.constants.APIQueryParameter;
import com.opower.assesment.openaq.OpenAQAPI.dto.LocationsDTO;
import com.opower.assesment.openaq.OpenAQAPI.dto.MeasurementsDTO;
import com.opower.assesment.openaq.OpenAQAPI.schemas.Location;
import com.opower.assesment.openaq.OpenAQAPI.schemas.LocationsHeatMap;
import com.opower.assesment.openaq.OpenAQAPI.schemas.MeasurementsHeatmap;
import com.opower.assesment.openaq.OpenAQAPI.util.Util;

@Service
public class HMService {

	@Value("${url.base.locations}")
	private String locationsBaseUrl;

	@Value("${url.base.measurements}")
	private String measurementsBaseUrl;

	@Autowired
	private HMClients hmClients;

	/**
	 * 
	 * @param country
	 * @param parameter
	 * @return
	 * @throws MalformedURLException
	 * @throws URISyntaxException
	 */
	public LocationsHeatMap getHMLocations(String country, String parameter)
			throws MalformedURLException, URISyntaxException {

		URIBuilder b = new URIBuilder(locationsBaseUrl);
		b.addParameter(APIQueryParameter.COUNTRY.getValue(), country);
		b.addParameter(APIQueryParameter.PARAMETER.getValue(), parameter);
		URL url = b.build().toURL();

		LocationsDTO locationsAPIInfo = hmClients.doGetLocations(url.toString());

		LocationsHeatMap locationsHeatMap = new LocationsHeatMap();
		locationsHeatMap.setMeta(locationsAPIInfo.getMeta());
		locationsHeatMap.getMeta().setFound(0);

		Location auxLocation = new Location();

		// Process data: Calculate heatmap values and populate heatmap object using DTO
		locationsAPIInfo.getResults().stream().forEach(location -> {
			auxLocation.populate(location);
			location.getParameters().stream().forEach(locParam -> {
				// Filter params to include only the given by the user
				if (parameter.equals(locParam.getParameter())) {
					locParam.setHeatMapValue(Util.normalizeForParam(locParam));
					auxLocation.getParameters().add(locParam);
				}
			});
			locationsHeatMap.getResults().add(new Location(auxLocation));
			locationsHeatMap.getMeta().increaseFound();
		});

		return locationsHeatMap;
	}

	/**
	 * 
	 * @param country
	 * @param parameter
	 * @param coordinates
	 * @param radius
	 * @return
	 * @throws URISyntaxException
	 * @throws MalformedURLException
	 */
	public MeasurementsHeatmap getHMMeasurements(String country, String parameter, String coordinates, Integer radius)
			throws URISyntaxException, MalformedURLException {

		URIBuilder b = new URIBuilder(measurementsBaseUrl);
		b.addParameter(APIQueryParameter.COUNTRY.getValue(), country);
		b.addParameter(APIQueryParameter.PARAMETER.getValue(), parameter);
		b.addParameter(APIQueryParameter.COORDINATES.getValue(), coordinates);
		b.addParameter(APIQueryParameter.RADIUS.getValue(), radius.toString());
		URL url = b.build().toURL();

		MeasurementsDTO measurementsDTO = hmClients.doGetMeasurements(url.toString().replace("%2C", ","));

		MeasurementsHeatmap measurementsheatMap = new MeasurementsHeatmap();
		measurementsheatMap.setMeta(measurementsDTO.getMeta());
		measurementsheatMap.getMeta().setFound(0);

		measurementsDTO.getResults().stream().forEach(measurement -> {
			measurement.setHeatMapValue(Util.normalizeForParam(measurement.getParameter(), measurement.getValue()));
			measurementsheatMap.getResults().add(measurement);
			measurementsheatMap.getMeta().increaseFound();
		});

		return measurementsheatMap;
	}

}
