package Tasks.Homework5;

import Service_Locator.IService;

public class SeventhTask implements IService
{
    private final int startValue = 1;
    private final int multiplay = 2;
    private final int endValue = 512;

    public void Print()
    {
        for(int i = startValue; i <= endValue; i *= multiplay)
            IO.println(i);
    }
}
