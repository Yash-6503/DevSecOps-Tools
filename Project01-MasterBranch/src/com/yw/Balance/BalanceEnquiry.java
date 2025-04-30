package com.yw.Balance;

public class BalanceEnquiry 
{
	//Task1 implement new check balance feature
	private double balance;
	
	public BalanceEnquiry(double balance) {
		this.balance = balance;
	}
	
	//check balance feature
	public double checkBalance() {
		return this.balance;
	}

}
