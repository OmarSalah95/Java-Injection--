package com.company.TightlyCoupled;

public class MyApplication
{
	public void send(String message, String address)
	{
		System.out.println("For " + address + ": " + message);
	}

	public String read()
	{
		return "Still Building function.";
	}
}
