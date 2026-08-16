package Tasks.Homework6;

import Service_Locator.IService;

public class FourthTask implements IService
{
    private final int increment = 15000;
    private final int monthForPercent = 6;
    private final float percent = 7;
    private final int target = 12000000;

    private int month = 0;
    private float total = 0;

    public void Print()
    {
       while(true)
       {
           total += increment;
           month++;

           if(month % monthForPercent == 0)
               total += total / 100 * percent;

           IO.print("Месяц - ");
           IO.print(month);
           IO.print(", сумма - ");
           IO.println(total);

           if(total >= target)
               break;
       }
    }
}
