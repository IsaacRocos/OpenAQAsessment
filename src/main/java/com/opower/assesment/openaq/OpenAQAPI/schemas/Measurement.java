package com.opower.assesment.openaq.OpenAQAPI.schemas;

public class Measurement {
	
        private String locationId;
        private String location;
        private String parameter;
        private double value;
        private Date date;
        private String unit;
        private Coordinate coordinates;        
        private String country;
        private String city;
        private boolean isMobile;
        private boolean isAnalysis;
        private String entity;
        private String sensorType;
        
		public String getLocationId() {
			return locationId;
		}
		public void setLocationId(String locationId) {
			this.locationId = locationId;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getParameter() {
			return parameter;
		}
		public void setParameter(String parameter) {
			this.parameter = parameter;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public boolean isMobile() {
			return isMobile;
		}
		public void setMobile(boolean isMobile) {
			this.isMobile = isMobile;
		}
		public boolean isAnalysis() {
			return isAnalysis;
		}
		public void setAnalysis(boolean isAnalysis) {
			this.isAnalysis = isAnalysis;
		}
		public String getEntity() {
			return entity;
		}
		public void setEntity(String entity) {
			this.entity = entity;
		}
		public String getSensorType() {
			return sensorType;
		}
		public void setSensorType(String sensorType) {
			this.sensorType = sensorType;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Coordinate getCoordinates() {
			return coordinates;
		}
		public void setCoordinates(Coordinate coordinates) {
			this.coordinates = coordinates;
		}
        
}



