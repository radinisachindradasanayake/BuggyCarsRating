package com.buggycarsrating.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class util 
{
	private static final Logger log = LogManager.getLogger(util.class.getName());
	
	
	public static boolean verifyTextMatch(String actualText, String expText) {
        if (actualText.equals(expText)){
            log.info("Actual Text From Web Application UI   --> : "+ actualText);
            log.info("Expected Text From Web Application UI --> : "+ expText);
            log.info("### Verification MATCHED !!!");
            return true;
        }else{
            log.error("Actual Text From Web Application UI   --> : "+ actualText);
            log.error("Expected Text From Web Application UI --> : "+ expText);
            log.error("### Verification DOES NOT MATCH !!!");
            return false;
        }
    }
	
	
	
	
	
}
