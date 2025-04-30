package com.yw.features;

public class UpiPayment 
{
	//upi payment feature version 1.0
	public String upiPayment(long fromPhone, long toPhone, double amount) {
		return amount+" transferred from "+fromPhone+" to phone "+toPhone;
	}
	
	//net banking feature
	public String netBanking(long sourceAccNo, long destAccno, double amount) {
		return amount+" transferred from source Account : "+sourceAccNo+" to Destination Account : "+destAccno;
	}
}
