package com.cg.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class LoggerService implements ThrowsAdvice{


	
	public void afterThrowing(Exception ex) {
		Log l = LogFactory.getLog(BankBusiness.class);
		l.info("logging service"+ex.getMessage());
	}

}
