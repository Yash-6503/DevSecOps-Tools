package com.yw.balance;

public class BalanceEnquiry 
{
	private double balance;
	
	public BalanceEnquiry(double balance) {
		this.balance = balance;
	}
	
	//balance
	public double checkBalance() {
		return this.balance;
	}
}
