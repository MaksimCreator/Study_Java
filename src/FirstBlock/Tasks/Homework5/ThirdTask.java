package FirstBlock.Tasks.Homework5;

import Service_Locator.IService;

public class ThirdTask implements IService
{
    private final int start = 0;
    private final int end = 17;

    public void Print()
    {
        for(int i = start; i <= end; i++)
        {
            if(i % 2 == 0)
                IO.println(i);
        }
    }
}
