package com.cg.aop;

import org.springframework.aop.framework.ProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		
		BankBusiness bank = new BankBusiness();
		LoggerService log = new LoggerService();
		
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(log);
		
		BankBusiness b=(BankBusiness)pfb.getObject();			//mixed
		
		int balance = b.deposit(4000, "SBI000324");
		System.out.println(balance);
	}
}
