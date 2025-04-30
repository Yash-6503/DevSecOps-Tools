package com.yw.main;

import com.yw.features.UpiPayment;

public class MainClass 
{
	public static void main(String[] args) 
	{
		UpiPayment upi = new UpiPayment();
		
		System.out.println(upi.upiPayment(987654321, 911111111, 5000.55));
	}

}
