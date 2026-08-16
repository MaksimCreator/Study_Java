package Tasks.Homework8;

import Service_Locator.IService;

public class FifthTask implements IService
{
    private final Service service = new Service();

    private final int[] inputArray5  = {435234,-12343,495812,395852,788343};
    private final int[] outputArray5 = new int[1];

    public void Print()
    {
        int counter = 0;

        for(final int balance : inputArray5)
        {
            if(balance > 0)
                counter++;
        }

        outputArray5[0] = counter;

        IO.print("inputArray5: ");
        service.PrintArray(inputArray5);
        IO.println();

        IO.print("outputArray5: количество прибыльных месяцев ");
        service.PrintArray(outputArray5);
        IO.println();
    }
}
