package com.opower.assesment.openaq.OpenAQAPI.constants;

public enum APIError {
	
	INTERNAL_SERVER_ERROR(500, "Content unavailable") , SERVICE_UNAVAILABLE(503 , "Service unavailable") ,  UNPROCESSABLE_ENTITY(422, "Unprocessable Entity") , BAD_REQUEST(400, "Bad request") ;
	
	private int code;
	private String errorDetail;
	
	APIError(int code, String errorDetail){
		this.code = code;
		this.errorDetail = errorDetail;
	}

	public int getCode() {
		return code;
	}

	public String getErrorDetail() {
		return errorDetail;
	}

	
	
}
