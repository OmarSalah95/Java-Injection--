package com.company.ConstructorInjection;

public class MessageService
{
	public void sendMessage(String msg, String address)
	{
		System.out.println(msg + " For : " + address);
	}
}
