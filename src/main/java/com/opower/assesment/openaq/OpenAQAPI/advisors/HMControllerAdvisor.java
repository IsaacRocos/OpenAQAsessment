package com.opower.assesment.openaq.OpenAQAPI.advisors;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.http.HttpHeaders;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import com.opower.assesment.openaq.OpenAQAPI.constants.APIError;
import com.opower.assesment.openaq.OpenAQAPI.schemas.ErrorResponse;


@RestControllerAdvice
public class HMControllerAdvisor {
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(ConstraintViolationException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setMsg(APIError.UNPROCESSABLE_ENTITY.getErrorDetail());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(HttpServerErrorException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(HttpServerErrorException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setMsg(APIError.SERVICE_UNAVAILABLE.getErrorDetail());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	
	@ExceptionHandler(MalformedURLException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(MalformedURLException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setMsg(APIError.BAD_REQUEST.getErrorDetail());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(URISyntaxException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(URISyntaxException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setMsg(APIError.BAD_REQUEST.getErrorDetail());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setMsg(APIError.INTERNAL_SERVER_ERROR.getErrorDetail());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
