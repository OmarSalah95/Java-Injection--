package com.company.InterfaceInjection;

public class LambdaTextingServiceInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaTextingImpl());
    }
}
