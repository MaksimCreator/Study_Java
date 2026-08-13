package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class SixthTask implements IService
{
    private final float _gramToKilogram = 1000;
    private final int _countBananа = 5;
    private final int _weightBanana = 80;
    private final int _countMilk = 2;
    private final int _weightMilk = 105;
    private final int _countIceCream = 2;
    private final int _weightIceCream = 100;
    private final int _countEgg = 4;
    private final int _weightEgg = 70;

    private int WeightDrink() { return _countBananа * _weightBanana + _countMilk * _weightMilk
        + _countIceCream * _weightIceCream + _countEgg * _weightEgg;}

    public void Print()
    {
        int weightDrink = WeightDrink();
        IO.println(weightDrink);
        IO.println((float)weightDrink / _gramToKilogram);
    }
}
