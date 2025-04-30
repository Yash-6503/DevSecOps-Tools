package com.yw.features;

public class UpiPayment 
{
	//upi payment feature version 1.0
	public String upiPayment(long fromPhone, long toPhone, double amount) {
		return amount+" transferred from "+fromPhone+" to phone "+toPhone;
	}
}
