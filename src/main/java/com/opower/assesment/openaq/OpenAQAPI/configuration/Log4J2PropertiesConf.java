package com.opower.assesment.openaq.OpenAQAPI.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2PropertiesConf {
	
     static Logger logger = LogManager.getLogger();
    
    public void performSomeLogs(){
        logger.debug("This is a DEBUG test message");
        logger.info("This is a INFO test message");
        logger.warn("This is a WARN test message");
        logger.error("This is a ERROR test message");
        logger.fatal("This is a FATAL test message");
    }
}
