package com.opower.assesment.openaq.OpenAQAPI.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2PropertiesConf {
	
    private static Logger logger = LogManager.getLogger();
    
    public void performSomeLogs(){
        logger.debug("DEBUG test message");
        logger.info("INFO test message");
        logger.warn("WARN test message");
        logger.error("ERROR test message");
        logger.fatal("FATAL test message");
    }
}
