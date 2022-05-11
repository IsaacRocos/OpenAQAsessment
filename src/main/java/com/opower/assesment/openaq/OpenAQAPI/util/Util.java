package com.opower.assesment.openaq.OpenAQAPI.util;

import com.opower.assesment.openaq.OpenAQAPI.constants.AirQualityParameter;
import com.opower.assesment.openaq.OpenAQAPI.schemas.Parameter;

public class Util {
	
	private Util() {
		throw new IllegalStateException("Utility class");
	}
	
	
	/**
	 * Normaliza un valor dado dentro del rango especificado
	 * @param value  Valor a normalizar
	 * @param dataMin  Minimo valor del rango del parámetro 
	 * @param dataMax  Máximo valor del rango del parámetro
	 * @param normalizedMin Mínimo valor del rango de normalización
	 * @param normalizedMax Maximo valor del rango de normalización
	 * @return double Valor normalizado
	 */
	public static double normalize(double value, double dataMin, double dataMax, double normalizedMin, double normalizedMax) {
		return ((value - dataMin)  / (dataMax - dataMin)) * (normalizedMax - normalizedMin) + normalizedMin;
	}
	
	
	/**
	 * 
	 * @param parameter
	 * @return
	 */
	public static double normalizeForParam(Parameter parameter) {
		return normalizeForParam(parameter.getParameter() , parameter.getAverage());
	}
	
	/**
	 * 
	 * @param paramName
	 * @return
	 */
	public static double normalizeForParam(String paramName , double value) {
		AirQualityParameter enumParameter = AirQualityParameter.getEnumParameter(paramName);
		if(enumParameter!= null) {
			return normalize(value, 0, enumParameter.getMaxValue(), 0, 255);
		}
		return -1;
	}
	
	

}
