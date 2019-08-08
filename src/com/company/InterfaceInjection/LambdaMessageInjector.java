package com.company.InterfaceInjection;

public class LambdaMessageInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaMessagingImpl());
    }
}
