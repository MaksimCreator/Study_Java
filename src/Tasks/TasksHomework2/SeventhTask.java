package Tasks.TasksHomework2;

import Service_Locator.IService;

public class SeventhTask implements IService
{
    private final int _loseWeight = 7000;
    private final int _oneDayMinLoseWeight = 250;
    private final int _oneDayMaxLoseWeight = 500;
    private final float _oneDayMiddleLoseWeight = (_oneDayMinLoseWeight + _oneDayMaxLoseWeight) / 2 ;

    public void Print()
    {
        int dayLoseWightForMin = _loseWeight / _oneDayMinLoseWeight;
        int dayLoseWightForMax = _loseWeight / _oneDayMaxLoseWeight;
        float dayLoseWightForMiddle = _loseWeight / _oneDayMiddleLoseWeight;

        IO.println(dayLoseWightForMin);
        IO.println(dayLoseWightForMax);
        IO.println((dayLoseWightForMax + dayLoseWightForMin) / 2);
        IO.println(dayLoseWightForMiddle);
    }
}
