package com.opower.assesment.openaq.OpenAQAPI.schemas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Location {

	private String name;
	private String entity;
	private String country;
	private List<Parameter> parameters;
	private String sensorType;
	private Coordinate coordinates;
	private Date lastUpdated;
	private Date firstUpdated;
	private long measurements;

	public Location() {
	}

	public Location(Location location) {
		populate(location);
		parameters = location.getParameters();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public Coordinate getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinate coordinates) {
		this.coordinates = coordinates;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getFirstUpdated() {
		return firstUpdated;
	}

	public void setFirstUpdated(Date firstUpdated) {
		this.firstUpdated = firstUpdated;
	}

	public long getMeasurements() {
		return measurements;
	}

	public void setMeasurements(long measurements) {
		this.measurements = measurements;
	}

	public void populate(Location location) {
		name = location.getName();
		entity = location.getEntity();
		country = location.getCountry();
		sensorType = location.getSensorType();
		coordinates = location.getCoordinates();
		lastUpdated = location.getLastUpdated();
		firstUpdated = location.getFirstUpdated();
		measurements = location.getMeasurements();
		parameters = new ArrayList<>();
	}

}
