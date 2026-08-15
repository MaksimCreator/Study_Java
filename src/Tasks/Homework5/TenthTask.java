package Tasks.Homework5;

import Service_Locator.IService;

public class TenthTask implements IService
{
    private final int start = 1;
    private final int multiplay = 2;
    private final int end = 10;

    public void Print()
    {
        for(int i = start; i <= end; i++)
            IO.println(i * multiplay);
    }
}
