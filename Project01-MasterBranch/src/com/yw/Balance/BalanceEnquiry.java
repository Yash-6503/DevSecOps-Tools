package com.yw.Balance;

public class BalanceEnquiry 
{
	private double balance;
	
	public BalanceEnquiry(double balance) {
		this.balance = balance;
	}
	
	//check balance feature version 3.0
	public double checkBalance() {
		return this.balance;
	}

}
