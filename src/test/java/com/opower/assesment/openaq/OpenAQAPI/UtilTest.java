package com.opower.assesment.openaq.OpenAQAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.opower.assesment.openaq.OpenAQAPI.util.Util;

@SpringBootTest
public class UtilTest {
	
	@Test
	void testNormalization() {
		int val = 10;
		int normalizedVal = Util.normalize(255, val, 0, 255);
		assertEquals(normalizedVal, val);
	}

}
