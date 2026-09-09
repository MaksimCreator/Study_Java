package FirstBlock.Tasks.Homework2;

import Service_Locator.IService;

public class SixthTask implements IService
{
    private final float gramToKilogram = 1000;
    private final int countBananа = 5;
    private final int weightBanana = 80;
    private final int countMilk = 2;
    private final int weightMilk = 105;
    private final int countIceCream = 2;
    private final int weightIceCream = 100;
    private final int countEgg = 4;
    private final int weightEgg = 70;

    private int WeightDrink() { return countBananа * weightBanana + countMilk * weightMilk
        + countIceCream * weightIceCream + countEgg * weightEgg;}

    public void Print()
    {
        int weightDrink = WeightDrink();
        IO.println(weightDrink);
        IO.println((float)weightDrink / gramToKilogram);
    }
}
