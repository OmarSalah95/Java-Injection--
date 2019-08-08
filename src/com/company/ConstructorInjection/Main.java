package com.company.ConstructorInjection;


public class Main
{
	public static void main(String[] args)
	{
		MyApplication message = new MyApplication(new MessageService());
		message.send("Hello", "Omar");
	}
}
