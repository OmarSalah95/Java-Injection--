package com.company.ConstructorInjection;

public class MyApplication
{
	private MessageService msgSrv;


	public MyApplication(MessageService msgSrv)
	{
		this.msgSrv = msgSrv;
	}

	public void send (String message, String address)
	{
		message = message + "\n *** For your eyes only ***";
		msgSrv.sendMessage(message, address);
	}

}
