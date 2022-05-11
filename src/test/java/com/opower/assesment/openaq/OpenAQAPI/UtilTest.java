package com.opower.assesment.openaq.OpenAQAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.opower.assesment.openaq.OpenAQAPI.util.Util;

@SpringBootTest
public class UtilTest {
	
	@Test
	/**
	 * Normalizar un valor en el rango de 0 a 255. Si el rango es el mismo, debe retornar el mismo valor
	 */
	void testNormalization() {
		int val = 10;
		double normalizedVal = Util.normalize(val, 0, 255, 0, 255);
		assertEquals(normalizedVal, val);
	}

}
