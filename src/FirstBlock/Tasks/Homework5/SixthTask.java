package FirstBlock.Tasks.Homework5;

import Service_Locator.IService;

public class SixthTask implements IService
{
    private final int start = 7;
    private final int increment = 7;
    private final int end = 98;

    public void Print()
    {
        for(int i = start; i <= end; i+= increment)
            IO.println(i);
    }
}
