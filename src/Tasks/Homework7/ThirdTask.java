package Tasks.Homework7;

import Service_Locator.IService;

public class ThirdTask implements IService
{
    private final Arrays arrays = new Arrays();

    public void Print()
    { arrays.PrintFlip(); }
}
