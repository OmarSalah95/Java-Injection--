package com.company.ConstructorInjection;

public class MessageService
{
	public void sendMessage(String msg, String address)
	{
		System.out.println("For : " + address + " : " + msg);
	}
}
