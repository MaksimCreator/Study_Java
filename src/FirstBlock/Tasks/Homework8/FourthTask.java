package FirstBlock.Tasks.Homework8;

import Service_Locator.IService;

public class FourthTask implements IService
{
    private final Service service = new Service();
    private final int[] inputArray4  = {4352,-8343,12394,2034,20491};
    private final boolean[] outputArray4 = new boolean[1];

    public void Print()
    {
        outputArray4[0] = true;

        for(final int balance : inputArray4)
        {
            boolean value = GetCanPositiveValue(balance);

            if(value == false)
            {
                outputArray4[0] = false;
                break;
            }
        }

        IO.print("inputArray4: ");
        service.PrintArray(inputArray4);
        IO.println();

        IO.print("outputArray4: ");
        service.PrintArray(outputArray4);
        IO.println();
    }

    private boolean GetCanPositiveValue(int value)
    { return value >= 0; }

}
