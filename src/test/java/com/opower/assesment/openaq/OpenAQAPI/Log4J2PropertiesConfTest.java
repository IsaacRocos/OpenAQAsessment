package com.opower.assesment.openaq.OpenAQAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.opower.assesment.openaq.OpenAQAPI.configuration.Log4J2PropertiesConf;


@SpringBootTest
public class Log4J2PropertiesConfTest {

    @Test
    void testPerformSomeTask() throws Exception {
        Log4J2PropertiesConf log4J2PropertiesConf = new Log4J2PropertiesConf();
        log4J2PropertiesConf.performSomeLogs();
        
    }
    
    
    
    
    
}
