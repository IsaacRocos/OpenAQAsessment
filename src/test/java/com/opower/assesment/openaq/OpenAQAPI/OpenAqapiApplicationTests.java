package com.opower.assesment.openaq.OpenAQAPI;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenAqapiApplicationTests {


	@Value("${url.base.locations}")
	private String locationsBaseUrl;

	@Value("${url.base.measurements}")
	private String measurementsBaseUrl;
	
	@Test
	void contextLoads() {
		assertNotNull(locationsBaseUrl);
		assertNotNull(measurementsBaseUrl);
	}

}
