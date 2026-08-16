package Tasks.Homework5;

import Service_Locator.IService;

public class SecondTask implements IService
{
    private final int start = 10;
    private final int end = 1;

    public void Print()
    {
        for(int i = start; i >= end; i--)
            IO.println(i);
    }
}