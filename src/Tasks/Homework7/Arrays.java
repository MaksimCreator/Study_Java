package Tasks.Homework7;

public class Arrays
{
    private final int[] firstArray = new int[3];
    private final double[] secondArray = { 1.57,7.654,9.986 };
    private final int[] thirdArray = { 0,10 };

    public Arrays()
    {
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
    }

    public void Print()
    {
        int i = 0;

        int startFirstArray = 0;
        int startSecondArray = 0;
        int startThirdArray = 0;

        int endFirstArray = firstArray.length;
        int endSecondArray = secondArray.length;
        int endThirdArray = thirdArray.length;

        for(i = startFirstArray; i < endFirstArray; i++)
        {
            if(i + 1 < endFirstArray)
                PrintElement(firstArray[i]);
            else
                IO.println(firstArray[i]);
        }

        for(i = startSecondArray; i < endSecondArray; i++)
        {
            if(i + 1 < endSecondArray)
                PrintElement(secondArray[i]);
            else
                IO.println(secondArray[i]);
        }

        for(i = startThirdArray; i < endThirdArray; i++)
        {
            if(i + 1 < endThirdArray)
                PrintElement(thirdArray[i]);
            else
                IO.println(thirdArray[i]);
        }
    }

    public void PrintFlip()
    {
        int i = 0;

        int startFirstArray = firstArray.length - 1;
        int startSecondArray = secondArray.length - 1;
        int startThirdArray = thirdArray.length - 1;

        int endFirstArray = 0;
        int endSecondArray = 0;
        int endThirdArray = 0;

        for(i = startFirstArray; i >= endFirstArray; i--)
        {
            if(i - 1 >= endFirstArray)
                PrintElement(firstArray[i]);
            else
                IO.println(firstArray[i]);
        }

        for(i = startSecondArray; i >= endSecondArray; i--)
        {
            if(i - 1 >= endSecondArray)
                PrintElement(secondArray[i]);
            else
                IO.println(secondArray[i]);
        }

        for(i = startThirdArray; i >= endThirdArray; i--)
        {
            if(i - 1 >= endThirdArray)
                PrintElement(thirdArray[i]);
            else
                IO.println(thirdArray[i]);
        }
    }

    public void SetFirstArrayEvenNumbers()
    {
        for(int i = 0; i < firstArray.length;i++)
        {
            if(firstArray[i] % 2 != 0)
                firstArray[i]++;
        }
    }

    public void PrintFirstArray()
    {
        for(int i = 0; i < firstArray.length;i++)
        {
            if(i + 1 < firstArray.length)
                PrintElement(firstArray[i]);
            else
                IO.println(firstArray[i]);
        }
    }

    private void PrintElement(Object element)
    {
        IO.print(element);
        IO.print(", ");
    }
}
