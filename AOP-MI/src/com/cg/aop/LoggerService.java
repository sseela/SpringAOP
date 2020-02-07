package com.cg.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggerService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Log l = LogFactory.getLog(BankBusiness.class);
		l.info("logging service......");
		Integer i=(Integer)arg0.proceed();
		l.info("after deposit method");
		return i;
	}

}
