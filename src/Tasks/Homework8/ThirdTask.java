package Tasks.Homework8;

import Service_Locator.IService;
import Tasks.Input;

import java.util.function.IntUnaryOperator;

public class ThirdTask implements IService
{
    private final Service service = new Service();
    private final int[] inputArray3 = {4352,8343,12394,2034,20491};
    private final boolean[] outputArray3 = new boolean[inputArray3.length];

    private final int minBonusToTrue = 5000;

    public void Print()
    {
        int index = 0;

        for(final int bonus : inputArray3)
        {
            outputArray3[index] = GetStateBonus(bonus);
            index++;
        }

        IO.print("inputArray3: ");
        service.PrintArray(inputArray3);
        IO.println();

        IO.print("outputArray3: ");
        service.PrintArray(outputArray3);
        IO.println();
    }

    private boolean GetStateBonus(int bonus)
    { return bonus > minBonusToTrue; }
}
