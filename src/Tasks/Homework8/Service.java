package Tasks.Homework8;

public class Service
{
    public void PrintArray(int[] array)
    {
        for(final int value : array)
        {
            IO.print(value);
            IO.print(" ");
        }
    }

    public void PrintArray(double[] array)
    {
        for(final double value : array)
        {
            IO.print(value);
            IO.print(" ");
        }
    }

    public void PrintArray(boolean[] array)
    {
        for(final boolean value : array)
        {
            IO.print(value);
            IO.print(" ");
        }
    }
    public void PrintArray(float[] array)
    {
        for(final float value : array)
        {
            IO.print(value);
            IO.print(" ");
        }
    }
}