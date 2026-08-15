package Tasks.Homework5;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FifthTask implements IService
{
    private final int start = 1904;
    private final int end = 2096;

    public void Print()
    {
        for(int i = start; i < end; i++)
        {
            if(i % 4 == 0)
            {
                IO.print(i);
                IO.println(" год является високосным");
            }
        }

    }
}
