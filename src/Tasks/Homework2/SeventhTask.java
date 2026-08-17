package Tasks.Homework2;

import Service_Locator.IService;

public class SeventhTask implements IService
{
    private final int loseWeight = 7000;
    private final int oneDayMinLoseWeight = 250;
    private final int oneDayMaxLoseWeight = 500;

    public void Print()
    {
        int dayLoseWightForMin = loseWeight / oneDayMinLoseWeight;
        int dayLoseWightForMax = loseWeight / oneDayMaxLoseWeight;

        IO.println(dayLoseWightForMin);
        IO.println(dayLoseWightForMax);
        IO.println((dayLoseWightForMax + dayLoseWightForMin) / 2);
    }
}
