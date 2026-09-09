package FirstBlock.Tasks.Homework8;

import Service_Locator.IService;

public class SecondTask implements IService
{
    private final Service service = new Service();
    private final int[] inputArray2 = {83421,30453,49189,69014,290456};
    private final float[] outputArray2 = new float[inputArray2.length];

    private final int percentNDFL = 13;

    public void Print()
    {
        int index = 0;

        for(final int value : inputArray2)
        {
            outputArray2[index] = GetNDFL(value);
            index++;
        }

        IO.print("inputArray2: ");
        service.PrintArray(inputArray2);
        IO.println();

        IO.print("outputArray2: ");
        service.PrintArray(outputArray2);
        IO.println();
    }

    private float GetNDFL(int salary)
    { return (float)salary / 100 * percentNDFL; }
}
