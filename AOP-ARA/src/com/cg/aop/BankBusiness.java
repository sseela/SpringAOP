package com.cg.aop;

public class BankBusiness {

	private String accountNo="SBI000324";
	private int amount = 5000;
	
	public int deposit(int amt, String accNo) {
		
		if(accNo.equals(this.accountNo)) {
			System.out.println("in the deposit method");
			this.amount = this.amount + amt;
			return this.amount;
		} else {
			return 0;
		}
	}
}
