package com.opower.assesment.openaq.OpenAQAPI.schemas;

public class Parameter {

	private long id;
	private String unit;
	private long count;
	private double average;
	private double lastValue;
	private String parameter;
	private String displayName;
	private java.util.Date lastUpdated;
	private int parameterId;
	private java.util.Date firstUpdated;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getLastValue() {
		return lastValue;
	}
	public void setLastValue(double lastValue) {
		this.lastValue = lastValue;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public java.util.Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(java.util.Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public int getParameterId() {
		return parameterId;
	}
	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}
	public java.util.Date getFirstUpdated() {
		return firstUpdated;
	}
	public void setFirstUpdated(java.util.Date firstUpdated) {
		this.firstUpdated = firstUpdated;
	}
	
	

}
