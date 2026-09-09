package FirstBlock.Tasks.Homework8;

import Service_Locator.IService;

public class FirstTask implements IService
{
    private final Service service = new Service();
    private final int[] inputArray1 = {9340,23442,491,3902};
    private final float[] outputArray1 = new float[inputArray1.length];

    public void Print()
    {
        outputArray1[0] = GetSum();
        outputArray1[1] = GetMaxValue();
        outputArray1[2] = GetMinValue();
        outputArray1[3] = GetMiddleValue();

        IO.print("inputArray1: ");
        service.PrintArray(inputArray1);
        IO.println();

        IO.print("outputArray1: ");
        service.PrintArray(outputArray1);
        IO.println();
    }

    private int GetSum()
    {
        int sum = 0;

        for(final int number : inputArray1)
            sum += number;

        return sum;
    }

    private int GetMaxValue()
    {
        int max = inputArray1[0];

        for(final int number : inputArray1)
        {
            if(number > max)
                max = number;
        }

        return max;
    }

    private int GetMinValue()
    {
        int min = inputArray1[0];

        for(final int number : inputArray1)
        {
            if(number < min)
                min = number;
        }

        return min;
    }

    private float GetMiddleValue()
    {
        float sum = 0;

        for(final float number : inputArray1)
            sum += number;

        return sum / inputArray1.length;
    }
}
