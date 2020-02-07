package com.cg.aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LoggerService implements AfterReturningAdvice{


	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		Log l = LogFactory.getLog(BankBusiness.class);
		l.info("logging service......");
	}

}
